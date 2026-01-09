package HospitalPatientManagementSystem;

//InPatient class
public class InPatient extends Patient {

	private int daysAdmitted;
	private double dailyCharge;

	public InPatient(int id, String name, int age, Doctor doctor, int daysAdmitted, double dailyCharge) {
		super(id, name, age, doctor);
		this.daysAdmitted = daysAdmitted;
		this.dailyCharge = dailyCharge;
	}

	// Bill calculation
	@Override
	public double calculateBill() {
		return daysAdmitted * dailyCharge;
	}

	// Polymorphic method
	@Override
	public void displayInfo() {
		System.out.println("InPatient | ID: " + getPatientId() + " | Name: " + getName() + " | Doctor: "
				+ getDoctor().getName() + " | Bill: ₹" + calculateBill());
	}
}
