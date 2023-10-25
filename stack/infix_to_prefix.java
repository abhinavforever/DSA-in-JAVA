package stack;
import java.util.Stack;
public class infix_to_prefix {
    // Function to check if a character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
    // Function to determine the precedence of an operator
    private static int precedence(char c) {
        switch (c) {
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
    // Function to convert infix to prefix
    public static String infixToPrefix(String infix) {
        Stack<Character> operatorStack = new Stack<>();
        Stack<String> operandStack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char currentChar = infix.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                operandStack.push(String.valueOf(currentChar));
            } else if (currentChar == '(') {
                operatorStack.push(currentChar);
            } else if (currentChar == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    String operand2 = operandStack.pop();
                    String operand1 = operandStack.pop();
                    char operator = operatorStack.pop();
                    String result = operator + operand1 + operand2;
                    operandStack.push(result);
                }
                operatorStack.pop(); // Pop the '('
            } else if (isOperator(currentChar)) {
                while (!operatorStack.isEmpty() && precedence(currentChar) <= precedence(operatorStack.peek())) {
                    String operand2 = operandStack.pop();
                    String operand1 = operandStack.pop();
                    char operator = operatorStack.pop();
                    String result = operator + operand1 + operand2;
                    operandStack.push(result);
                }
                operatorStack.push(currentChar);
            }
        }
        while (!operatorStack.isEmpty()) {
            String operand2 = operandStack.pop();
            String operand1 = operandStack.pop();
            char operator = operatorStack.pop();
            String result = operator + operand1 + operand2;
            operandStack.push(result);
        }
        return operandStack.pop();
    }
    public static void main(String[] args) {
        String infixExpression = "(A+B)*C";
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
    }
}