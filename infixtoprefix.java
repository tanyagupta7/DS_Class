package data;

public class infixtoprefix {

	static int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static StringBuilder infixtopreFix(String expression){

        StringBuilder result = new StringBuilder();
        StringBuilder input = new StringBuilder(expression);
        input.reverse();
        Stack Stack1 = new Stack();

        char [] exp = new String(input).toCharArray();
        for (int i = 0; i < exp.length; i++) {

            if (exp[i] == '(') {
            	exp[i] = ')';
                i++;
            }
            else if (exp[i] == ')') {
            	exp[i] = '(';
                i++;
            }
        }
        for (int i = 0; i <exp.length ; i++) {
            char ch = exp[i];

                        if(precedence(ch)>0){
                while(Stack1.isEmpty()==false && precedence(Stack1.peek())>=precedence(ch)){
                    result.append(Stack1.pop());
                }
                Stack1.push(ch);
            }else if(ch==')'){
                char a = Stack1.pop();
                while(a!='('){
                    result.append(a);
                    a = Stack1.pop();
                }
            }else if(ch=='('){
                Stack1.push(ch);
            }else{
                               result.append(ch);
            }
        }

        for (int i = 0; i <=Stack1.size() ; i++) {
            result.append(Stack1.pop());
        }
        return result.reverse();
    }

    public static void main(String[] args) {
        String exp = "A+B*(C^D-E)";
        System.out.println("Prefix Expression: " + infixtopreFix(exp));
    }
}
