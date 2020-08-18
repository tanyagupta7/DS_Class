package data;
import java.util.Queue;

public class queueusingarray {
	private int data[];
	private int front;
	private int rear; 
	private int size;
    
	
	public queueusingarray() {
		data = new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	
	public queueusingarray(int c) {
		data = new int[c];
		front=-1;
		rear=-1;
		size=0;
	}

    int size()
    {
    	return size;
    }

    boolean isEmpty()
    {
    	return size()==0;
    }

    int front() throws QueueEmptyException
    {   
    	if(size()==0)
    	{
    		throw new QueueEmptyException();
    	}
    	
    	return data[front];
    }
    
    void enqueue(int element) 
    {     
    	if(size==data.length)
    	{
    		doubleCapacity();
    	}
    	
    	
    	if(size==0)
    	{
    		front=0;
    	}
    	
    	
    	rear++;
    	size++;
    	//rear=(rear+1)%data.length;
    	if(rear==data.length)
    	{
    		rear=0;
    	}
    	data[rear]=element;
    }

    private void doubleCapacity() {
			
    	int temp[]= data;
    	data= new int[2*temp.length];
    	int index=0;
    	for(int i=front; i<temp.length;i++)
    	{
    		data[index]=temp[i];
    		index++;
    	}
    	
    	for(int i=0;i<=front-1;i++)
    	{
    		data[index]=temp[i];
    		index++;
    	}
    	front=0;
    	rear=temp.length-1;
    	
		
	}

	int  dequeue() throws QueueEmptyException {	
    	if(size()==0)
    	{
    		throw new QueueEmptyException();
    	}
    	int temp = data[front];
    	
    	front = (front+1)%data.length;
//    	front++;
//    	if(front==data.length)
//    	{
//    		front=0;
//    	}
    	size--;
    	if(size==0)
    	{
    		front=-1;
    		rear=-1;
    	}
    	return temp;
    }

}
