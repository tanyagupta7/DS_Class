package data;

public class evaluatepostfix {
	 static int evaluatePostfix(String e) 
	    { 
	        Stack<Integer> s=new Stack<Integar>(); 
	          
	        for(int i=0;i<e.length();i++) 
	        { 
	            char ch=e.charAt(i); 
	              
	            if(Character.isDigit(ch)) 
	            s.push(ch - '0'); 
	              
	            else
	            { 
	                int a1 = s.pop(); 
	                int a2 = s.pop(); 
	                  
	                switch(ch) 
	                { 
	                    case '+': 
	                    s.push(a2+a1); 
	                    break; 
	                      
	                    case '-': 
	                    s.push(a2- a1); 
	                    break; 
	                      
	                    case '/': 
	                    s.push(a2/a1); 
	                    break; 
	                      
	                    case '*': 
	                    s.push(a2*a1); 
	                    break; 
	              } 
	            } 
	        } 
	        return s.pop();     
	    } 
	      
	    public static void main(String[] args)  
	    { 
	        String e="231*+9-"; 
	        System.out.println("postfix evaluation: "+evaluatePostfix(e)); 
	    } 

}
