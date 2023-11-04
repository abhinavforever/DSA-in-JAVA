package Deque;
public class First_Circular_Tour_Efficient {
    static int finalPetrolPump(int petrol[],int dist[],int n){
        int start=0,curr_pet=0;
        int prev_pet=0;
        for(int i=0;i<n;i++){
            curr_pet+=(petrol[i]-dist[i]);
            if(curr_pet<0){
                start=i+1;
                prev_pet+=curr_pet;
                curr_pet=0;
            }
        }
        return ((curr_pet+prev_pet)>=0)?(start+1):-1;
    }
    public static void main(String[] args) {
        int petrol[]={50,10,60,100};
        int dist[]={30,20,100,10};
        System.out.println(finalPetrolPump(petrol,dist,petrol.length));
    }
}