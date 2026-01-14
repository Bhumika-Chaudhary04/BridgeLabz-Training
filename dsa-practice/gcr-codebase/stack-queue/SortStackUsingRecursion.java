package stack_queue;

import java.util.Stack;
public class SortStackUsingRecursion {
	//method to sort stack
	public static void sortStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int top = stack.pop();
		sortStack(stack);
		insertStack(stack, top);
	}
	//helper method
	public static void insertStack(Stack<Integer> stack, int element) {
		if (stack.isEmpty() || stack.peek() <= element) {
			stack.push(element);
			return;
		}
		int top = stack.pop();
		insertStack(stack, element);
		stack.push(top);

	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(3);
		st.push(2);
		st.push(4);
		System.out.println("Original stack : " + st);
		sortStack(st);
		System.out.println("Sorted stack : " + st);
	}

}
