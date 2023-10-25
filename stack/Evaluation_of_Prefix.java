package stack;
import java.util.Stack;

public class Evaluation_of_Prefix {
    // Function to evaluate a prefix expression
    public static int evaluatePrefix(String prefix) {
        Stack<Integer> operandStack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char currentChar = prefix.charAt(i);
            if (Character.isDigit(currentChar)) {
                operandStack.push(Character.getNumericValue(currentChar));
            } else if (currentChar == ' ') {
                continue; // Skip spaces
            } else {
                int operand1 = operandStack.pop();
                int operand2 = operandStack.pop();
                int result;

                switch (currentChar) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + currentChar);
                }
                operandStack.push(result);
            }
        }

        if (operandStack.size() != 1) {
            throw new IllegalArgumentException("Invalid prefix expression");
        }

        return operandStack.pop();
    }

    public static void main(String[] args) {
        String prefixExpression = "+ 5 * 3 2"; // Example prefix expression
        int result = evaluatePrefix(prefixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
        System.out.println("Result: " + result);
    }
}