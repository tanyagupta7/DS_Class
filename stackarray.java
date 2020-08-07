package data;

public class stackarray {
	
		
		private int arr[]; 
		private int top;
		
		public stackarray() {
			arr = new int[10];
			top=-1;
		}
		
		public stackarray(int size) {
			arr = new int[size];
			top=-1;
		}
		
		public boolean isEmpty()
		{
			return (top==-1);
			
		}
	   
		public int s()
		{
			return top+1;
		}

	    public int top() throws StackEmptyException
	    {    
	    	if(s()==0)
	    	{
	    		StackEmptyException a = new StackEmptyException();	
	    		throw a;
	    	}
	    	return arr[top];
	    }

	    public void push(int b) throws StackFullException
	    {   
	    	if(s()==arr.length)
	    	{
	    		
	    		
	    		doublesize();	
	    	}
	    	
	    	
	    	top++;
	    	arr[top]=b;
	    }
	    
	    private void doublesize()
	    {
	    	int temp[] = arr;
	    	
	    	arr = new int[temp.length*2];
	    	
	    	for(int i=0;i<=top;i++)
	    	{
	    		arr[i]=temp[i];
	    	}
	    }
	    public int pop() throws StackEmptyException
	    {  
	    	if(s()==0)
	    	{
	    		StackEmptyException a = new StackEmptyException();	
	    		throw a;
	    	}
	    	
	    	int temp = arr[top];
	    	top--;
	    	return temp;
	    }
	    
	}






