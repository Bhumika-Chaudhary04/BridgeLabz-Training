package HospitalPatientManagementSystem;

//Bill class
public class Bill {
	private Patient patient;

	public Bill(Patient patient) {
		this.patient = patient;
	}

	public void generateBill() {
		System.out.println("Total Bill Amount: ₹" + patient.calculateBill());
	}
}
