package data;
import java.util.*;


	class Node {

		
	    int data;
	    Node next;
	    
	    Node(int data)
	    {
	 	   this.data=data;
	 	   next=null;
	    }
		

	}
	
		public class insertlinkedlist {
		
		public static void InsertAtEnd(Node head,int data)
		{  
			Node tail = head;
			
			while(head.next!=null)
			{
				head=head.next;
			}
			Node newNode = new Node (data);
			
			head.next=newNode;
			
			while(tail!=null)
			{   
				System.out.println(tail.data+" ");
				
				tail=tail.next;
			}
			
			
			
			
		}
		
		public static Node takeInput()
		{
			Node head = null,last=null;
			Scanner s = new Scanner(System.in);
			int data = s.nextInt();
			while(data!=-1)
			{
				Node newNode = new Node(data);
				
				if(head==null)
				{
					head= newNode;
					last = newNode;
				}
				else
				{	
					last.next= newNode; 
					last= newNode;
				} 
				
				data = s.nextInt();
			}
			return head;
		}

		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			Node head= takeInput();
			
			System.out.println("Enter element you want to insert at the end");
			
			int data = s.nextInt();
			
			InsertAtEnd(head,data);
			
			
		}
		
	}



