package LeetCode;

public class Container_with_mostWater {
    //My Earlier Naive Approach :
     public static int maxArea(int[] height) {
         int n=height.length;
         int area;
         int max=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if (height[i]<height[j]){
                     area=height[i]*Math.abs(j-i);
                 }
                 else{
                     area=height[j]*Math.abs(j-i);
                 }
                 if (area>max){
                     max=area;
                 }
             }
         }
     return max;}

    public static void main(String[] args) {
         int height[]= {1,8,6,2,5,4,8,3,7};
         System.out.println(maxArea(height));

         int height2[]={1,1};
        System.out.println(maxArea(height2));
    }
}