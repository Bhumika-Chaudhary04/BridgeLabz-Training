import java.time.LocalDate;

public class LeaveRequest {
	private String requestId; // optional - can auto-generate
	private String employeeId;
	private int daysRequested;
	private LocalDate startDate;
	private String status; // "PENDING", "APPROVED", "REJECTED"
	private String reason; // optional

	public LeaveRequest(String requestId, String employeeId, int daysRequested, LocalDate startDate, String reason) {
		this.requestId = requestId;
		this.employeeId = employeeId;
		this.daysRequested = daysRequested;
		this.startDate = startDate;
		this.reason = reason;
		this.status = "PENDING";
	}

	// Getters & Setters
	public String getRequestId() {
		return requestId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public int getDaysRequested() {
		return daysRequested;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LeaveRequest{" + "requestId='" + requestId + '\'' + ", employeeId='" + employeeId + '\'' + ", days="
				+ daysRequested + ", start=" + startDate + ", status='" + status + '\'' + '}';
	}
}