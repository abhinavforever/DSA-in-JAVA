import java.util.Scanner;

public class ROUGH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String result = replaceAdjacentDuplicates(input);
        System.out.println(result);
    }

    public static String replaceAdjacentDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();

        while (i < n) {
            char currentChar = s.charAt(i);
            sb.append(currentChar);

            int j = i + 1;
            while (j < n && s.charAt(j) == currentChar) {
                j++;
            }

            if (j - i > 1) {
                // Replace adjacent duplicates with their uppercase version
                sb.setCharAt(sb.length() - 1, Character.toUpperCase(currentChar));
            }

            i = j;
        }

        return sb.toString();
    }
}