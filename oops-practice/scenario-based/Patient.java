package HospitalPatientManagementSystem;

//Abstract Patient class (Base class)
public abstract class Patient implements IPayable {

	private int patientId;
	private String name;
	private int age;
	private Doctor doctor;

	// Constructor
	public Patient(int patientId, String name, int age, Doctor doctor) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.doctor = doctor;
	}

	// Encapsulation (getters & setters)
	public int getPatientId() {
		return patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	// Polymorphism
	public abstract void displayInfo();
}
