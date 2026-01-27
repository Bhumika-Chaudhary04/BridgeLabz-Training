package review2;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class SinglyLinkedListImplementation {
	static Node head;
	static void insertAtBegin(int data){
		if(head==null) {
			head=new Node(data);
			return;
		}
		Node nn=new Node(data);
		nn.next=head;
		head=nn;
	}
	static void insertAtEnd(int data) {
		if(head==null) {
			insertAtBegin(data);
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new Node(data);
	}
	static int findSize() {
		if(head==null) {
			return 0;
		}
		Node temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
		
	}
	static void insertAtMiddle(int data) {
		int c=0;
		int size=findSize();
		int mid;
		if(size%2==0) {
			mid=size/2;
		}
		else {
			mid=(size/2)+1;
		}
		Node temp=head;
		while(c<mid-1) {
			temp=temp.next;
			c++;
		}
		Node nn=new Node(data);
		nn.next=temp.next;
		temp.next=nn;
	}
	static void display() {
		if(head==null) {
			System.out.println("Empty linked list");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data);
			if(temp.next!=null) {
				System.out.print("-->");
			}
			temp=temp.next;
		}
		System.out.println();
	}
}
public class SinglyLinkedList{
	public static void main(String[] args) {
		SinglyLinkedListImplementation sl=new SinglyLinkedListImplementation();
		sl.display();
		sl.insertAtBegin(1);
		sl.insertAtEnd(2);
		sl.insertAtBegin(3);
		sl.insertAtMiddle(4);
		sl.insertAtMiddle(5);
		sl.display();
		
	}
}
