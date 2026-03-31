package constructors_access_modifiers;
public class Person {
	//attributes
	private String name;
	private int age;
	private String gender;
	//default constructor
	Person(){
		name="Bhumika";
		age=21;
		gender="Female";
	}
	//parameterized constructor
	Person(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	//copy constructor
	Person(Person person){
		this.name=person.name;
		this.age=person.age;
		this.gender=person.gender;
	}
	//display function
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("------------------------------------------------\n");
	}
	public static void main(String[] args) {
		//objects
        Person person1=new Person();
        Person person2=new Person("Prachi",20,"Female");
        Person person3=new Person(person2);
        person1.display();
		person2.display();
		person3.display();
	}
}

