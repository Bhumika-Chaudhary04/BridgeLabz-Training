package scenario_based;
import java.util.Scanner;
public class InvoiceGenerator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //scanner for input
        System.out.println("Enter invoice details (e.g., Logo Design - 3000 INR, Web Page - 4500 INR):");
        String invoice=sc.nextLine(); //read user input
        String[] tasks=parseInvoice(invoice); //parse tasks
        double total=getTotalAmount(tasks); //calculate total
        System.out.println("Tasks:");
        for(String t:tasks) System.out.println(t); //display tasks
        System.out.println("Total Amount: "+total+" INR"); //display total
        sc.close(); //close scanner
    }
    public static String[] parseInvoice(String input){
        return input.split(","); //split by comma
    }
    public static double getTotalAmount(String[] tasks){
        double total=0;
        for(String task:tasks){
            String[] parts=task.split("-"); //split name and amount
            if(parts.length>1){
                String amtStr=parts[1].trim().replace("INR","").trim(); //extract amount
                total+=Double.parseDouble(amtStr); //add to total
            }
        }
        return total; //return total
    }
}
