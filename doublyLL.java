package data;

class Node
{
	int data;
	Node pre;
	Node next;
	
	Node(int data)
	{
		this.data=data;
	}
}

public class doublyLL {
	
static Node head;
	
	public static void insert(int data)
	{
		Node newNode = new Node(data);
		
		newNode.next=head;
		newNode.pre=null;
		
		if(head!=null)
		{
			head.pre=newNode;
		}
		
		head= newNode;
	}
 
	public static void deletenode(Node delete)
	{
		if (head == null || delete == null) { 
            return; 
        } 
		
		 if (head == delete) { 
	            head = delete.next; 
	        } 
		 
		 if (delete.next != null) { 
	            delete.next.pre = delete.pre; 
	        } 
		 
		 if (delete.pre != null) { 
	            delete.pre.next = delete.next; 
	        } 
		 
		 return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insert(5);
		deletenode(head.next);
	}

}
