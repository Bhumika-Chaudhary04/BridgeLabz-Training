package constructors_access_modifiers;
public class HotelBooking {
	//attributes
	String guestName;
	String roomType;
	int nights;
	//default constructor
	HotelBooking(){
		guestName="Bhumika Chaudhary";
		roomType="Standard";
		nights=5;
	}
	// parameterized constructor
	HotelBooking(String guestName,String roomType,int nights){
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights=nights;
	}
	//copy constructor
	HotelBooking(HotelBooking hotel){
		this.guestName=hotel.guestName;
		this.roomType=hotel.roomType;
		this.nights=hotel.nights;
	}
	//display 
	void display() {
		System.out.println("Guest Name : "+guestName);
		System.out.println("Room Type : "+roomType);
		System.out.println("Nights : " +nights);
		System.out.println("-----------------------------------------");
	}
	public static void main(String[] args) {
		//objects
		HotelBooking hotel1=new HotelBooking();
		HotelBooking hotel2=new HotelBooking("Prachi","VIP",2);
		HotelBooking hotel3=new HotelBooking(hotel2);
		hotel1.display();
		hotel2.display();
		hotel3.display();

	}	
}
