package data;
import java.util.*;

public class infixtopostfix {
	private Stack Stack;
	   private String inp;
	   private String out = "";
	   public infixtopostfix(String in) {
	      inp = in;
	      int stackSize = inp.length();
	      Stack = new Stack(stackSize);
	   }
	   public String doTrans() {
	      for (int j = 0; j < inp.length(); j++) {
	         char c = inp.charAt(j);
	         switch (c) {
	            case '+': 
	            case '-':
	               gotOper(c, 1); 
	               break; 
	            case '*': 
	            case '/':
	               gotOper(c, 2); 
	               break; 
	            case '(': 
	              Stack.push(c);
	               break;
	            case ')': 
	               gotParen(c); 
	               break;
	            default: 
	               out = out + c; 
	               break;
	         }
	      }
	      while (!Stack.isEmpty()) {
	         out = out + Stack.pop();
	      }
	      System.out.println(out);
	      return out; 
	   }
	   public void gotOper(char opThis, int prec1) {
	      while (!Stack.isEmpty()) {
	         char Top = Stack.pop();
	         if (Top == '(') {
	            Stack.push(Top);
	            break;
	         } else {
	            int prec;
	            if (Top == '+' || Top == '-')
	            prec = 1;
	            else
	            prec = 2;
	            if (prec < prec1) { 
	               Stack.push(Top);
	               break;
	            } 
	            else out = out + Top;
	         }
	      }
	      Stack.push(opThis);
	   }
	   public void gotParen(char ch) { 
	      while (!Stack.isEmpty()) {
	         char chx = Stack.pop();
	         if (chx == '(') 
	         break; 
	         else out = out + chx; 
	      }
	   }
	   public static void main(String[] args) throws IOException {
	      String inp = "1+2*4/5-7+3/6";
	      String out;
	      infixtopostfix theTrans = new infixtopostfix(inp);
	      out= theTrans.doTrans(); 
	      System.out.println("Postfix is " + out + '\n');
	   }
	   class Stack {
	      private int maxSize;
	      private char[] stackArray;
	      private int top;
	      
	      public Stack(int max) {
	         maxSize = max;
	         stackArray = new char[maxSize];
	         top = -1;
	      }
	      public void push(char j) {
	         stackArray[++top] = j;
	      }
	      public char pop() {
	         return stackArray[top--];
	      }
	      public char peek() {
	         return stackArray[top];
	      }
	      public boolean isEmpty() {
	         return (top == -1);
	      }
	   }

}
