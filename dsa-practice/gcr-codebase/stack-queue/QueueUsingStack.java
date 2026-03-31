package stack_queue;
import java.util.*;
public class QueueUsingStack {
	//empty stacks
	Stack<Integer> inStack=new Stack<>();
	Stack<Integer> outStack=new Stack<>();
	//enqueue
	public void enqueue(int x) {
		inStack.push(x);
	}
	//dequeue
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		if(outStack.isEmpty()) {
			while(!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
	}
	//isEmpty
	public boolean isEmpty() {
		if(inStack.isEmpty() && outStack.isEmpty()) {
			return true;
		}
		return false;
	}
	//main method
	public static void main(String[] args) {
		QueueUsingStack queue=new QueueUsingStack();
		//enqueue
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println(queue.dequeue());
		queue.enqueue(6);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
