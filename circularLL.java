package data;

import java.util.Scanner;

 public class Node {

		
	    int data;
	    Node next;
	    
	    Node(int data)
	    {
	 	   this.data=data;
	 	   next=null;
	    }
		

	}

public class circularLL 
{
	public static Node head=null;
	public static Node tail=null;
	
	public static Node InsertAtBegining()
    {
		
    	Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node last=null;
		while(data!=-1)
		{
			Node newNode = new Node (data);
			
			if(head==null)
			{
				head= newNode;
				tail = newNode;
				last=newNode;
				
			}
			else
			{   
				
				head= newNode; 
				head.next=tail;
				tail=head;
			} 
			
			data = s.nextInt();
		}
		last.next=head;
		return head;
    }
    
    
	public static Node InsertAtEnd()
	{
	
		
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1)
		{
			Node newNode = new Node (data);
			
			if(head==null)
			{
				head= newNode;
				tail = newNode;
			}
			else
			{
				tail.next= newNode; 
				tail= newNode;
				tail.next=head;
			} 
			
			data = s.nextInt();
		}
		return head;
	}
	
	
	public static void  printlist(Node head)
	
	{
		
		if(head==null)
		{
			return;
		}
		
		Node tail = head;
		
		do
		{
			System.out.println(tail.data+" ");
			tail=tail.next;
			
		}while(tail!=head);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = InsertAtEnd();
		
				//Node head = InsertAtBegining();
		printlist(head);
		
	}

}
