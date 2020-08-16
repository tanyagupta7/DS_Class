package data;
import java.util.*;

public class prefixtopostfix {
	static boolean isOperator(char ch)  
	{ 
	    switch (ch)  
	    { 
	        case '+': 
	        case '-': 
	        case '/': 
	        case '*': 
	        return true; 
	    } 
	    return false; 
	} 
	  
		static String preToPost(String exp) 
	{ 
	  
	    Stack<String> a= new Stack<String>(); 
	  
	    
	    int l = exp.length(); 
	  
	   
	    for (int i = l - 1; i >= 0; i--)  
	    { 
	  
	        	        if (isOperator(exp.charAt(i)))  
	        { 
	  
	           	            String p1 = a.peek(); a.pop(); 
	            String p2 = a.peek(); a.pop(); 
	  
	            
	            String temp = p1 + p2 + exp.charAt(i); 
	  
	            	            a.push(temp); 
	        } 
	  
	       	        else
	        { 

	            a.push( exp.charAt(i)+""); 
	        } 
	    } 
	  
	    	    return a.peek(); 
	} 
	  
		public static void main(String args[])  
	{ 
	    String exp = "*-A/BC-/AKL"; 
	    System.out.println("Postfix : " + preToPost(exp)); 
	} 

}
