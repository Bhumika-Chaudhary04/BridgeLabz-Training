package this_static_final_instanceof_keywords;
public class Patient {
    //static variable
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    //final variable
    private final String patientID;
    //instance variables
    private String name;
    private int age;
    private String ailment;
    //constructor using 'this'
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }
    //static method
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    //display details using instanceof
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
    //main method
    public static void main(String[] args) {
        Patient p1 = new Patient("P001", "Lathika", 30, "Flu");
        Patient p2 = new Patient("P002", "Lidiya", 45, "Fracture");
        getTotalPatients();
        p1.displayPatientDetails();
        p2.displayPatientDetails();
    }
}