import java.time.LocalDate;
import java.util.*;

public class LeaveManagementSystem {
	private Map<String, Employee> employees = new HashMap<>(); // EmployeeID → Employee
	private List<LeaveRequest> leaveRequests = new ArrayList<>(); // all requests
	private int requestCounter = 1; // simple ID generator

	// Add a new employee
	public void addEmployee(String empId, String name, int initialLeaveBalance) {
		if (employees.containsKey(empId)) {
			System.out.println("Employee with ID " + empId + " already exists!");
			return;
		}
		Employee emp = new Employee(empId, name, initialLeaveBalance);
		employees.put(empId, emp);
		System.out.println("Added: " + emp);
	}

	// Submit a leave request
	public LeaveRequest applyForLeave(String empId, int days, LocalDate startDate, String reason) {
		Employee emp = employees.get(empId);
		if (emp == null) {
			throw new IllegalArgumentException("Employee not found: " + empId);
		}

		String requestId = "REQ" + String.format("%03d", requestCounter++);
		LeaveRequest request = new LeaveRequest(requestId, empId, days, startDate, reason);
		leaveRequests.add(request);

		System.out.println("Leave request submitted: " + request);
		return request;
	}

	// Approve a leave request
	public void approveLeave(String requestId) throws InsufficientLeaveBalanceException {
		LeaveRequest request = findRequestById(requestId);
		if (request == null) {
			throw new IllegalArgumentException("Request not found: " + requestId);
		}
		if (!"PENDING".equals(request.getStatus())) {
			System.out.println("Request already processed: " + requestId);
			return;
		}

		Employee emp = employees.get(request.getEmployeeId());
		if (emp.getLeaveBalance() < request.getDaysRequested()) {
			request.setStatus("REJECTED");
			throw new InsufficientLeaveBalanceException("Insufficient leave balance for " + emp.getName()
					+ ". Available: " + emp.getLeaveBalance() + ", Requested: " + request.getDaysRequested());
		}

		// Approve
		emp.deductLeaves(request.getDaysRequested());
		request.setStatus("APPROVED");
		System.out.println("Leave APPROVED for " + emp.getName() + ". New balance: " + emp.getLeaveBalance());
	}

	// Reject a leave request
	public void rejectLeave(String requestId) {
		LeaveRequest request = findRequestById(requestId);
		if (request == null || !"PENDING".equals(request.getStatus())) {
			System.out.println("Cannot reject: " + requestId);
			return;
		}
		request.setStatus("REJECTED");
		System.out.println("Leave REJECTED: " + requestId);
	}

	// Helper: find request
	private LeaveRequest findRequestById(String requestId) {
		for (LeaveRequest req : leaveRequests) {
			if (req.getRequestId().equals(requestId)) {
				return req;
			}
		}
		return null;
	}

	// View all employees
	public void printAllEmployees() {
		System.out.println("\nAll Employees:");
		employees.values().forEach(System.out::println);
	}

	// View pending requests
	public void printPendingRequests() {
		System.out.println("\nPending Leave Requests:");
		leaveRequests.stream().filter(r -> "PENDING".equals(r.getStatus())).forEach(System.out::println);
	}

	// Main method - demo
	public static void main(String[] args) {
		LeaveManagementSystem system = new LeaveManagementSystem();

		// Add some employees
		system.addEmployee("E001", "Bhumika", 20);
		system.addEmployee("E002", "Rahul", 15);
		system.addEmployee("E003", "Priya", 12);

		system.printAllEmployees();

		// Apply leaves
		try {
			system.applyForLeave("E001", 5, LocalDate.of(2026, 3, 10), "Family function");
			system.applyForLeave("E002", 18, LocalDate.of(2026, 3, 15), "Vacation");
			system.applyForLeave("E003", 3, LocalDate.of(2026, 3, 20), "Medical");

			system.printPendingRequests();

			// Process requests
			system.approveLeave("REQ001"); // should succeed
			system.approveLeave("REQ002"); // should throw exception
		} catch (InsufficientLeaveBalanceException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected: " + e.getMessage());
		}

		system.printAllEmployees();
		system.printPendingRequests();
	}
}