package data;

public class insertionsort {
	 void sort(int a[]) 
	    { 
	        int n = a.length; 
	        for (int i = 1; i < n; ++i) { 
	            int key = a[i]; 
	            int j = i - 1; 
	  
	            
	            while (j >= 0 && a[j] > key) { 
	                a[j + 1] = a[j]; 
	                j = j - 1; 
	            } 
	            a[j + 1] = key; 
	        } 
	    } 
	  
	    /* A utility function to print array of size n*/
	    static void print(int a[]) 
	    { 
	        int n = a.length; 
	        for (int i = 0; i < n; ++i) 
	            System.out.print(a[i] + " "); 
	  
	        System.out.println(); 
	    } 
	  
	    // Driver method 
	    public static void main(String args[]) 
	    { 
	        int a[] = { 89, 14, 54, 75, 7 }; 
	  
	        insertionsort s = new insertionsort(); 
	        s.sort(a); 
	  
	        print(a); 

}
}
