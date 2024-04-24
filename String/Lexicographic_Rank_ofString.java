package String;

import java.util.Arrays;

public class Lexicographic_Rank_ofString{

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int lexicographicRank(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);

        int rank = 1;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int smallerCharCount = sortedString.indexOf(currentChar);
            rank += smallerCharCount * factorial(s.length() - i - 1);
            // Remove the current character from the sorted string
            sortedString = sortedString.substring(0, smallerCharCount) + sortedString.substring(smallerCharCount + 1);
        }
        return rank;
    }

    public static void main(String[] args) {
        String inputString = "dcba";
        int rank = lexicographicRank(inputString);
        System.out.println("The lexicographic rank of '" + inputString + "' is " + rank);
    }
}