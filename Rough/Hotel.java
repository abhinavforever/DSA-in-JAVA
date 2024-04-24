package Rough;
import java.util.*;
 class Hotel{
     static int maxLen(int[] arr, int n)
     {
         // Your code here
         HashMap<Integer,Integer> m=new HashMap<>();
         int i=0,j=0;
         int max=0;
         while(i<=n-1 && j<=n-1){
             m.put(arr[i],m.getOrDefault(arr[i],0)+1);
             while(m.getOrDefault(0,0)!=m.getOrDefault(1,0)){
                 i++;
                 if(i<=n-1){
                     m.put(arr[i],m.getOrDefault(arr[i],0)+1);
                 }
             }
             if(m.getOrDefault(0,0) == m.getOrDefault(1,0) && i<=j){
                 max=Math.max(max,j-i+1);
                 j++;
             }

         }
         return max;
     }

     public static void main(String[] args) {
         int arr[]={0,1,0,1};
         maxLen(arr, arr.length);
     }
 }