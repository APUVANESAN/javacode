import java.util.*;
class puvan{
    node head;
    node tail;
    class node{
        int data;
        node next;
        node prev;
        node(int val)
    {
         data = val;
        next = null;
        prev = null;
        
    }
    }
    puvan(){
        head = null;
        tail = null;
    }
    public void insertbegin(int a){
        node newnode = new node(a);
        if(head == null)
        tail = newnode;
        else{
            newnode.next = head;
            head.prev = newnode;
        }
        head = newnode;
    }
    public void insertend(int b){
        node newnode = new node(b);
        if(head == null)
        head = newnode;
        else{
            newnode.prev = tail;
            tail.next = newnode;
            
        }
            tail = newnode;
        
    }
    public void deletebegin(){
        head = head.next;
        head.prev = null;
    }
    public void deleteend(){
        tail = tail.prev;
        tail.next = null;
    }
    public void insertpos(int pos,int val){
      node newnode = new node(val);
      node temp = head;
      for(int i = 1; i < pos-1 ; i++){
          temp = temp.next;
      }
      temp.next.prev = newnode;
      newnode.next = temp.next;
      temp.next = newnode;
      newnode.prev = temp;
    }
    public void deletepos(int pos){
        node temp = head;
        node in = temp.next;
        for(int i = 1;i < pos ; i++){
            temp = temp.next;
            in = temp.next;
        }
        temp.prev .next = in;
        in.prev = temp.prev;
        temp.prev = null;
        temp.next = null;
    }
    public void sort(){
        node current ,sea;
        int temp;
        for(current = head; current.next != null ; current = current.next){
            for(sea = head.next; sea.next != null; sea = sea.next){
                if(current.data < sea.data){
                    temp = current.data;
                    current.data = sea.data;
                    sea.data = temp;
                
                }
            }
        }
    }
    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
            
        }System.out.println("null");
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        puvan sc = new puvan();
        int x = obj.nextInt();
        for(int i = 0; i< x; i++){
            int y = obj.nextInt();
            sc.insertend(y);
        }
        sc.display();
        int j = obj.nextInt();
        
        sc.insertbegin(j);
        sc.display();
        sc.sort();
        sc.display();
        int p = obj.nextInt();
        int v = obj.nextInt();
        sc.insertpos(p,v);
        sc.display();
        int s = obj.nextInt();
        
        sc.deletepos(s);
        sc.display();
        sc.deletebegin();
        sc.display();
        sc.deleteend();
        sc.display();
        
    }
}
