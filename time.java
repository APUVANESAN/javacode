import java.util.*;
class time{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int y = obj.nextInt();
        int n = x * y;
        if(n > 24){
            System.out.print(-1);
        }
        else if(n > 12 && n <= 24){
            int diff = n - 12;
            System.out.print(diff);
        }
        else{
            System.out.print(n);}
        
    
    }
}
