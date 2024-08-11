import java.util.*;
class stackll{
    node head;
    node top;
    class node{
        int data;
        node next;
        node(int val){
            data = val;
            next = null;
        }
    }
    stackll(){
        head = null;
        top = null;
    }
    
    public void push(int val){
       node newnode = new node(val);
       if(head == null)
       head = newnode;
       else{
           top.next = newnode;
       }
       top = newnode;
    }
    public void pop(){
       node temp = head;
       while(temp.next != top){
           temp = temp.next;
       }
       temp.next = null;
       top = temp;
    }
    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(" ");
        System.out.println("Peak : "+top.data+" ");
    }
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        stackll sl = new stackll();
        while(true){
            int j = obj.nextInt();
            if(j== -1)
            break;
            sl.push(j);
            
        }
        sl.display();
        sl.pop();
        sl.display();
        
    }
}
