package scenario_based;
import java.util.Scanner;
public class CafeteriaMenuApp {
    public static void main(String[] args){
        String[] menu={"Sandwich","Burger","Pizza","Pasta","Salad","Coffee","Tea","Juice","Cake","Ice Cream"}; //menu items
        displayMenu(menu); //show menu
        Scanner sc=new Scanner(System.in); //scanner for input
        System.out.println("Enter item index to order (1-10):");
        int index=sc.nextInt(); //read choice
        String item=getItemByIndex(menu,index); //get item
        System.out.println("You ordered: "+item); //display ordered item
        sc.close(); //close scanner
    }
    public static void displayMenu(String[] menu){
        System.out.println("Cafeteria Menu:");
        for(int i=0;i<menu.length;i++) {
        	System.out.println(i+1+". "+menu[i]); //print menu with index
        }
    }
    public static String getItemByIndex(String[] menu,int index){
        if(index>0 && index<=menu.length) {
        	return menu[index-1]; //return valid item
        }
        else return "Invalid selection"; //invalid input
    }
}
