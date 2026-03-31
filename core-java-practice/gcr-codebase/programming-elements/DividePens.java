
public class DividePens {
	public static void main(String[] args) {
//		total pens
		int pens=14;
//		number of students 
		int students=3;
//		dividing equal pens between each student
		int penstoEachStudent=pens/students;
//		number of remaining pens are
		int remainingPens=pens%students;
		System.out.println("The Pen Per Student is "+penstoEachStudent+" and the remaining pens not distributed is "+remainingPens);
	}

}
