package data;

public class infixtoprefix {

	static boolean isOperator(char ch) 
	{ 
	    return (!(ch >= 'a' && ch <= 'z') &&  
	            !(ch >= '0' && ch <= '9') &&  
	            !(ch >= 'A' && ch <= 'Z')); 
	} 
	  
	
	static int getPriority(char CH) 
	{ 
	    if (CH == '-' || CH == '+') 
	        return 1; 
	    else if (CH == '*' || CH == '/') 
	        return 2; 
	    else if (CH == '^') 
	        return 3; 
	    return 0; 
	} 
	  
	
	static String infixtoprefix(String infix) 
	{ 
	    Stack<Character> operators = new Stack<Character>(); 
	  
	    Stack<String> operands = new Stack<String>(); 
	  
	    for (int i = 0; i < infix.length(); i++)  
	    { 
	  
	        
	        if (infix.charAt(i) == '(')  
	        { 
	            operators.push(infix.charAt(i)); 
	        } 
	  
	        	        else if (infix.charAt(i) == ')')  
	        { 
	            while (!operators.empty() &&  
	                operators.peek() != '(')  
	                { 
	  
	               
	                String p1 = operands.peek(); 
	                operands.pop(); 
	  
	               	                String p2 = operands.peek(); 
	                operands.pop(); 
	  
	                
	                char p = operators.peek(); 
	                operators.pop(); 
	  
	               
	                String temp = p + p2 + p1; 
	                operands.push(temp); 
	            } 
	  
	            
	            operators.pop(); 
	        } 
	  
	      
	        else if (!isOperator(infix.charAt(i)))  
	        { 
	            operands.push(infix.charAt(i) + ""); 
	        } 
	  
	       	        else 
	        { 
	            while (!operators.empty() &&  
	                getPriority(infix.charAt(i)) <=  
	                    getPriority(operators.peek()))  
	                { 
	  
	                String p1 = operands.peek(); 
	                operands.pop(); 
	  
	                String p2 = operands.peek(); 
	                operands.pop(); 
	  
	                char p = operators.peek(); 
	                operators.pop(); 
	  
	                String temp = p + p2 + p1; 
	                operands.push(temp); 
	            } 
	  
	            operators.push(infix.charAt(i)); 
	        } 
	    } 
	  
	   
	    while (!operators.empty())  
	    { 
	        String p1 = operands.peek(); 
	        operands.pop(); 
	  
	        String p2 = operands.peek(); 
	        operands.pop(); 
	  
	        char p = operators.peek(); 
	        operators.pop(); 
	  
	        String temp = p + p2 + p1; 
	        operands.push(temp); 
	    } 
	  
	  	    return operands.peek(); 
	} 
	  
	 
	public static void main(String args[]) 
	{ 
	    String st = "(A-B/C)*(A/K-L)"; 
	    System.out.println( infixtoprefix(st)); 
	} 
}
