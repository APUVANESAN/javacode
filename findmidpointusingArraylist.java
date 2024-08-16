import java.util.*;
class main{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    int c = 0;
    while(true){
      int a = obj.nextInt();
      
      if(a == -1)
      break;
      list.add(a);
      c++;
    }
    int sum = c/2;
    System.out.print(list.get(sum));
    
  }
}
