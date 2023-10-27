package Queue;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class Generate_first_n_numbers_with_given_digits {
    static void prrintFirstN(int n,int d1,int d2){
        Queue<String> q=new ArrayDeque<>();
        q.offer(Integer.toString(d1));
        q.offer(Integer.toString(d2));
        for (int i = 0; i < n; i++) {
            String curr=q.poll();
            System.out.print(curr+" ");
            q.offer(curr+Integer.toString(d1));
            q.offer(curr+Integer.toString(d2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first digit:");
        int d1 = sc.nextInt();
        System.out.println("Enter second digit:");
        int d2 = sc.nextInt();
        System.out.println("enter how many first n numbers you want to print with the given digits:");
        int n = sc.nextInt();
        prrintFirstN(n, d1, d2);
    } }