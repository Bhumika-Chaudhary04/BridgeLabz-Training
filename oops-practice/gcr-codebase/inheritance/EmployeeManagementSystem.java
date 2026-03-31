package inheritance;
//superclass
class Employee{
	String name;
	int id;
	int salary;
	Employee(){
		name="Olivia Davis";
		id=1;
		salary=243;
	}
	void displayDetails() {
		System.out.println("Employee ID : "+id);
		System.out.println("Employee salary : "+salary);
		System.out.println("Employee name : "+name);
	}
}
//subclass
class Manager extends Employee{
	int id;
	String name;
	int teamSize;
	Manager(){
		id=2;
		name="John Smith";
		teamSize=23;
	}
	void displayDetails() {
		System.out.println("Manager ID: "+id);
		System.out.println("Manager Name : "+name);
		System.out.println("Team size :"+teamSize);
	}
}
//subclass
class Developer extends Employee{
	int id;
	String name;
	String programmingLanguage;
	Developer(){
		id=3;
		name="Marry Smith";
		programmingLanguage="Java";
	}
	void displayDetails() {
		System.out.println("Developer id : "+id);
		System.out.println("Developer name : "+name);
		System.out.println("ProgrammingLanguage : "+programmingLanguage);
	}
	
}
//subclass
class Intern extends Employee{
	int id;
	String name;
	String role;
	Intern(){
		id=34;
		name="Olivia Rodridge";
		role="Developer";
	}
	void displayDetails() {
		System.out.println("Intern id : "+id);
		System.out.println("Intern name :"+name);
		System.out.println("Intern role : "+role);
	}
}
//main class
public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Employee employee1=new Employee();
		Manager manager1=new Manager();
		Developer developer1= new Developer();
		Intern intern1=new Intern();
		employee1.displayDetails();
		System.out.println("----------------------");
		manager1.displayDetails();
		System.out.println("----------------------");
		developer1.displayDetails();
		System.out.println("----------------------");
		intern1.displayDetails();
	}	
}
