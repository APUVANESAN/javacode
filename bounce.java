import java.util.*;
class bounce{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int H = obj.nextInt();
        int V = obj.nextInt();
        int vn = obj.nextInt();
        int en = V / vn;
        H = H * (en*en);
        System.out.print(H);
    }
}
