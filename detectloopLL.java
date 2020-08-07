package data;

import java.util.Scanner;

public class detectloopLL {
	
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
	
	public static void detect(Node head)
	{
		

        Node slowp = head, fastp = head; 
        int flag = 0; 
        
        while (slowp != null && fastp != null && fastp.next != null) { 
            slowp = slowp.next; 
            fastp = fastp.next.next; 
            if (slowp == fastp) { 
                flag = 1; 
                break; 
            } 
        } 
        if (flag == 1) 
            System.out.println("loop found"); 
        else
            System.out.println("no loop found");
		
		
	}
  
  public static void main(String[] args) {
		
		
	  Node head = takeInput();
		detect(head);
		
	}

}
