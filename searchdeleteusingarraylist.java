import java.util.*;
class main{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    while(true){
      int a = obj.nextInt();
      if(a == -1)
      break;
      list.add(a);
    }
    int b = obj.nextInt();
    for(int i = 0; i < list.size();i++){
      if(list.get(i).equals(b)){
        list.remove(i);}
    }
    for(int i = 0; i < list.size() ; i++){
      System.out.print(list.get(i)+" ");}
    }
}
