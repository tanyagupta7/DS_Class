package data;
import java.util.Scanner;

public class reverseLL {
	public static Node takeInput()
	{
		Node head = null,tail=null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1)
		{
			Node newNode = new Node(data);
			
			if(head==null)
			{
				head= newNode;
				tail = newNode;
			}
			else
			{	
				tail.next= newNode; 
				tail= newNode;
			} 
			
			data = s.nextInt();
		}
		return head;
	}
	
	public static Node reverse(Node head)
	{
		if(head==null||head.next==null)
		{
			return head;
		}
		
		Node fHead=reverse(head.next);
		Node temp= fHead;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		
		temp.next=head;
		head.next=null;
		return fhead;
	}
	
	public static void main(String[] args) {
		
		Node head = takeInput();
		
		reverse(head);
		
		
	}

}
