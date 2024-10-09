import java.util.*;
class playoff{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int M = obj.nextInt();
        int R = obj.nextInt();
        int[] arr = new int[3];
        int sum = 0;
        int select=0;
        
        for(int i = 0; i < 3; i++){
            arr[i] = obj.nextInt();
        }
        for (int i = 0; i < 3; i++){
            sum = sum + arr[i];
        }
        if((R * N) - sum > M ){
            System.out.print(-1);
        }
        else{
           select = (R * N) - sum;
        
        System.out.print(select);
            
        }

    }}
