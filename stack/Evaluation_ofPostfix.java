package stack;

import java.util.Stack;

public class Evaluation_ofPostfix {

    // Function to evaluate a postfix expression
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert the character to an integer and push it onto the stack
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop(); // The final result is on top of the stack
    }

    public static void main(String[] args) {
        String postfixExpression = "102*35*+9-";
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
        System.out.println("Result: " + result);
    }
}