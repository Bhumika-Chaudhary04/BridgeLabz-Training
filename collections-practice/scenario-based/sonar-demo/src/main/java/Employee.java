public class Employee {
    private String employeeId;      // e.g. "E001"
    private String name;
    private int leaveBalance;       // total available leaves (casual/sick/whatever combined)

    public Employee(String employeeId, String name, int initialLeaveBalance) {
        this.employeeId = employeeId;
        this.name = name;
        this.leaveBalance = initialLeaveBalance;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    // Reduce balance when leave is approved
    public void deductLeaves(int days) {
        this.leaveBalance -= days;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", leaveBalance=" + leaveBalance +
                '}';
    }
}