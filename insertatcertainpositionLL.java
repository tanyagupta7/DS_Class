package data;

public class insertatcertainpositionLL {
	
	public static Node takeinput()
	{
		Node head = null,tail=null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data!=-1)
		{
			{
				head= newNode;
				tail = newNode;
			}
			else
			{	
				tail.next= newNode; 
				tail= newNode;
			} 
			
			data =  s.nextInt();
		}
		return head;
	}
	
	public static Node insert(Node head, int data, int b)
	{
			 Node newNode= new Node(data);
			 int i=0;
			 Node t= head;
			 
			 if(b==0)
			 {
				 newNode.next= head;
				 head= newNode;
				 return newNode; 
			 }
			 
			 while(i<b-1)
			 {
				 t=t.next;
				 i++;
			 }
			 newNode.next= t.next;
			 t.next= newNode;
			 return head;	
			 
	}
	
	public static void main(String[] args) {
		
		Node head = takeinput();
		
		insert(head, 2, 2);
		
		
	}

}
