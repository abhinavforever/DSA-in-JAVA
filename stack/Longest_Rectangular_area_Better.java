package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Longest_Rectangular_area_Better {
    static int getMaxArea(int arr[],int n){
        int res=0;
        ArrayList<Integer> ps=printPrevSmallerEffi(arr,n);
        ArrayList<Integer> ns=nextSmaller(arr,n);
        for (int i=0;i<n;i++){
            int curr=arr[i];
            curr+=(i-ps.get(i)-1)*arr[i];
            curr+=(ns.get(i)-i-1)*arr[i];
            res=Math.max(res,curr);
        }
        return res;
    }
    static ArrayList<Integer> printPrevSmallerEffi(int arr[],int n){
        ArrayList<Integer> a=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        s.push(arr[0]);
        a.add(-1);
        for(int i=1;i<n;i++){
            while (s.isEmpty()==false && s.peek()>=arr[i])
                s.pop();
            int ps=(s.isEmpty())?-1:s.peek();
            a.add(ps);
            s.push(arr[i]);
        }
        return a;
    }
    static ArrayList<Integer> nextSmaller(int arr[],int n) {
        ArrayList<Integer> a=new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        a.add(-1);
        for (int i=n-2;i>=0;i--){
            while (s.isEmpty()==false && s.peek()<=arr[i])
                s.pop();
            int ns=(s.isEmpty())?-1:s.peek();
            a.add(ns);
            s.push(arr[i]);
        }
        Collections.reverse(a);
        return a;
    }

    public static void main(String[] args) {
        int arr[]={6,2,5,4,1,5,6};
        System.out.println(getMaxArea(arr,arr.length));
    }
}