package Rough;

import java.io.*;
import java.util.*;

class Solution {

    public static int solve(int N, List<Integer> A) {
        int totalHandshakes = 0;
        int emptyChairs = N;
        boolean[] seated = new boolean[N];
        while (emptyChairs > 0) {
            for (int i = 0; i < N; i++) {
                if (A.get(i) == 0 && !seated[i]) { // If the chair is empty and not yet seated
                    int j = i; // Start from the current chair
                    while (true) {
                        j = (j + 1) % N; // Move clockwise to the next chair
                        if (A.get(j) == 0 && !seated[j]) { // If the chair is empty and not yet seated
                            seated[j] = true; // Seat the person
                            emptyChairs--;
                            // Count handshakes with seated persons
                            for (int k = 0; k < N; k++) {
                                if (seated[k]) {
                                    totalHandshakes++;
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
        return totalHandshakes;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine().trim());

        List<Integer> A = new ArrayList<>(N);
        for (int j = 0; j < N; j++) {
            A.add(Integer.parseInt(scan.nextLine().trim()));
        }

        int result = solve(N, A);
        System.out.println(result);
}
}