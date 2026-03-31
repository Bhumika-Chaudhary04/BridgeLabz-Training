import java.util.Scanner;

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0, totalCost = 0;

        // Step 1: Check if solution exists
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalGas < totalCost) {
            return -1;
        }

        // Step 2: Find starting index
        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stations: ");
        int n = sc.nextInt();

        int[] gas = new int[n];
        int[] cost = new int[n];

        System.out.println("Enter gas values:");
        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }

        System.out.println("Enter cost values:");
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        int result = canCompleteCircuit(gas, cost);

        if (result == -1) {
            System.out.println("No possible starting station");
        } else {
            System.out.println("Start at station index: " + result + ");
        }

        sc.close();
    }
}