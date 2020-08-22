package data;

public class selectionsort {
	void sort(int a[]) 
    { 
        int n = a.length; 
  
        for (int i = 0; i < n-1; i++) 
        { 
            int min = i; 
            for (int j = i+1; j < n; j++) 
                if (a[j] < a[min]) 
                    min = j; 
  
            
            int t = a[min]; 
            a[min] = a[i]; 
            a[i] = t; 
        } 
    } 
  

    void print(int a[]) 
    { 
        int n = a.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(a[i]+" "); 
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        selectionsort s = new selectionsort(); 
        int a[] = {45,58,12,51,39,41}; 
        s.sort(a); 
        s.print(a); 
    } 
}


