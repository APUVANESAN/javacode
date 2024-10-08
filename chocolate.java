
import java.util.*;
class chocolate{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int t = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            
        }
        if(t > n){
            System.out.print(-1);
        }
        else{
            int sum = 0;
            Arrays.sort(arr);
            for (int i = 0; i < t; i++) {
                sum = sum+arr[i];
                
            }
            System.out.print(sum);
        }
        
    }
}
