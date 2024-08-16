import java.util.*;
class main{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    ArrayList<Integer>list1 = new ArrayList<>();
    ArrayList<Integer>list2 = new ArrayList<>();
    ArrayList<Integer>list3  = new ArrayList<>();
    while(true){
      int a = obj.nextInt();
      if(a == -1)
      break;
      list1.add(a);
    }
    while(true){
      int a = obj.nextInt();
      if(a == -1)
      break;
      list2.add(a);
    }
    list3.addAll(list1);
    list3.addAll(list2);
    Collections.sort(list3);
    for(int i = 0; i < list3.size(); i++){
      System.out.print(list3.get(i)+" ");
    }
  }
}
