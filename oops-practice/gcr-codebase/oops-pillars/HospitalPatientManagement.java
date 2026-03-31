package oops_pillars;
import java.util.ArrayList;
import java.util.List;
//interface for medical records
interface MedicalRecord {
    void addRecord(String record); //add record
    void viewRecords(); //view records
}
//abstract base class for patient
abstract class Patient {
    private String patientId; //patient id
    private String name; //patient name
    private int age; //patient age
    protected double bill; //patient bill
    public Patient(String patientId,String name,int age){ this.patientId=patientId;this.name=name;this.age=age; }
    public abstract double calculateBill(); //abstract bill
    public void getPatientDetails(){ System.out.println("Patient ID: "+patientId+"\nName: "+name+"\nAge: "+age); } //display details
    public String getPatientId(){ return patientId; } //get id
    public String getName(){ return name; } //get name
    public int getAge(){ return age; } //get age
}
//inpatient class
class InPatient extends Patient implements MedicalRecord {
    private List<String> records=new ArrayList<>(); //medical records
    private int days; //days admitted
    private double dailyRate; //daily rate
    public InPatient(String id,String name,int age,int days,double rate){ super(id,name,age); this.days=days; this.dailyRate=rate; }
    @Override
    public double calculateBill(){ return days*dailyRate; } //calculate bill
    @Override
    public void addRecord(String record){ records.add(record); } //add record
    @Override
    public void viewRecords(){ System.out.println("Medical Records: "+records); } //view records
}
//outpatient class
class OutPatient extends Patient implements MedicalRecord {
    private List<String> records=new ArrayList<>(); //medical records
    private double consultationFee; //consultation fee
    public OutPatient(String id,String name,int age,double fee){ super(id,name,age); this.consultationFee=fee; }
    @Override
    public double calculateBill(){ return consultationFee; } //calculate bill
    @Override
    public void addRecord(String record){ records.add(record); } //add record
    @Override
    public void viewRecords(){ System.out.println("Medical Records: "+records); } //view records
}
//main class
public class HospitalPatientManagement {
    public static void main(String[] args){
        List<Patient> patients=new ArrayList<>();
        InPatient ip=new InPatient("P101","Alice",30,5,2000); //create inpatient
        ip.addRecord("Diagnosed with flu"); //add record
        OutPatient op=new OutPatient("P102","Bob",25,500); //create outpatient
        op.addRecord("Routine checkup"); //add record
        patients.add(ip); patients.add(op); //add to list
        processPatients(patients); //process patients
    }
    public static void processPatients(List<Patient> patients){
        for(Patient p:patients){
            p.getPatientDetails(); //display details
            double bill=p.calculateBill(); //calculate bill
            System.out.println("Bill Amount: "+bill); //print bill
            if(p instanceof MedicalRecord){
                MedicalRecord mr=(MedicalRecord)p;
                mr.viewRecords(); //view medical records
            }
            System.out.println("------------------------------"); //separator
        }
    }
}
