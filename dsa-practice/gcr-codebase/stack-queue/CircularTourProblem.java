package stack_queue;
import java.util.*;
class PetrolPump {
	int petrol;
	int distance;

	PetrolPump(int petrol, int distance) {
		this.petrol = petrol;
		this.distance = distance;
	}
}

public class CircularTourProblem {
	public static int findStart(PetrolPump[] pumps) {
		Queue<Integer> queue = new LinkedList<>();
		int currentPetrol = 0;
		int n = pumps.length;
		int i = 0;

		//traverse circularly (at most 2n steps)
		while (i < 2 * n) {
			int idx = i % n;

			queue.offer(idx);
			currentPetrol += pumps[idx].petrol - pumps[idx].distance;

			//remove pumps until petrol is non-negative
			while (!queue.isEmpty() && currentPetrol < 0) {
				int removed = queue.poll();
				currentPetrol -= (pumps[removed].petrol - pumps[removed].distance);
			}

			//if all pumps are in queue → valid tour
			if (queue.size() == n) {
				return queue.peek();
			}
			i++;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of petrol pumps: ");
		int n = sc.nextInt();

		PetrolPump[] pumps = new PetrolPump[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter petrol and distance for pump " + i + ": ");
			int petrol = sc.nextInt();
			int distance = sc.nextInt();
			pumps[i] = new PetrolPump(petrol, distance);
		}

		int start = findStart(pumps);

		if (start == -1) {
			System.out.println("No possible circular tour");
		} else {
			System.out.println("Start from petrol pump index: " + start);
		}

		sc.close();
	}
}
