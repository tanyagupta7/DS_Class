package data;
import java.util.ArrayList; 


public class circularqueue {
	private int size, front, rear; 
	  
	private ArrayList<Integer> queue = new ArrayList<Integer>(); 
	  
	circularqueue(int size) 
	{ 
	    this.size = size; 
	    this.front = this.rear = -1; 
	} 
	  
	public void enQueue(int data) 
	{ 
	      
	    if((front == 0 && rear == size - 1) || 
	      (rear == (front - 1) % (size - 1))) 
	    { 
	        System.out.print("Queue is Full"); 
	    } 
	  
	    else if(front == -1) 
	    { 
	        front = 0; 
	        rear = 0; 
	        queue.add(rear, data); 
	    } 
	  
	    else if(rear == size - 1 && front != 0) 
	    { 
	        rear = 0; 
	        queue.set(rear, data); 
	    } 
	  
	    else
	    { 
	        rear = (rear + 1); 
	      
	        
	        if(front <= rear) 
	        { 
	            queue.add(rear, data); 
	        } 
	      
	      
	        else
	        { 
	            queue.set(rear, data); 
	        } 
	    } 
	} 
	  
	
	public int deQueue() 
	{ 
	    int t; 
	  
	 
	    if(front == -1) 
	    { 
	        System.out.print("Queue is Empty"); 
	          
	        return -1;  
	    } 
	  
	    t = queue.get(front); 
	  
	    if(front == rear) 
	    { 
	        front = -1; 
	        rear = -1; 
	    } 
	  
	    else if(front == size - 1) 
	    { 
	        front = 0; 
	    } 
	    else
	    { 
	        front = front + 1; 
	    } 
	      
	    return t; 
	} 
	  
	
	public void displayQueue() 
	{ 
	      
	  
	    if(front == -1) 
	    { 
	        System.out.print("Queue is Empty"); 
	        return; 
	    } 
	   
	   
	  
	    if(rear >= front) 
	    { 
	      
	       
	        for(int i = front; i <= rear; i++) 
	        { 
	            System.out.print(queue.get(i)); 
	            System.out.print(" "); 
	        } 
	        System.out.println(); 
	    } 
	  
	   
	    else
	    { 
	        
	        for(int i = front; i < size; i++) 
	        { 
	            System.out.print(queue.get(i)); 
	            System.out.print(" "); 
	        } 
	  
	     
	        for(int i = 0; i <= rear; i++) 
	        { 
	            System.out.print(queue.get(i)); 
	            System.out.print(" "); 
	        } 
	        System.out.println(); 
	    } 
	} 
	  
	
	public static void main(String[] args) 
	{ 
	      
	   
	    circularqueue a = new circularqueue(5); 
	      
	    a.enQueue(5); 
	    a.enQueue(6); 
	    a.enQueue(7); 
	    a.enQueue(8); 
	      
	    a.displayQueue(); 
	  
	    int b = a.deQueue(); 
	  
	    if(b != -1) 
	    { 
	        System.out.print("Deleted value = "); 
	        System.out.println(b); 
	    } 
	  
	    b= a.deQueue(); 
	  
	   
	    if(b != -1) 
	    { 
	        System.out.print("Deleted value = "); 
	        System.out.println(b); 
	    } 
	  
	    a.displayQueue(); 
	      
	    a.enQueue(1); 
	    a.enQueue(2); 
	    a.enQueue(3); 
	      
	    a.displayQueue(); 
	      
	    a.enQueue(2); 
	} 
	} 


