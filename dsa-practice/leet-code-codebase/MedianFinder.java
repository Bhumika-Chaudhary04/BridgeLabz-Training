import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

    // Max heap (stores smaller half)
    private PriorityQueue<Integer> maxHeap;

    // Min heap (stores larger half)
    private PriorityQueue<Integer> minHeap;

    private boolean even;

    // Constructor
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
        even = true;
    }

    // Add number into data structure
    public void addNum(int num) {

        if (even) {
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        } else {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }

        even = !even;
    }

    // Find median
    public double findMedian() {

        if (even) {
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }

    // Main method to test
    public static void main(String[] args) {

        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        System.out.println("Median: " + mf.findMedian());  // 1.0

        mf.addNum(2);
        System.out.println("Median: " + mf.findMedian());  // 1.5

        mf.addNum(3);
        System.out.println("Median: " + mf.findMedian());  // 2.0

        mf.addNum(10);
        System.out.println("Median: " + mf.findMedian());  // 2.5
    }
}