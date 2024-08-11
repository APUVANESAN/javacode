import java.util.*;
class cll{
    node head;
    class node{
        int data;
        node next;
        node(int val){
            data = val;
            next = null;
        }
    }
        cll(){
            head = null;
        }
        public void insertbegin(int a){
            node newnode = new node(a);
            if(head == null){
            newnode.next = newnode;
            head = newnode;
            }
            else{
                newnode.next = head.next;
                head.next = newnode;
            }
        }
        public void insertend(int b){
            node newnode = new node(b);
            if(head == null){
                newnode.next = newnode;
                head = newnode;
            }else{
                newnode.next = head.next;
                head.next = newnode;
                head = newnode;
            }
        }
        public void insertpos(int pos,int c){
            node newnode = new node(c);
            node temp = head.next;
            for(int i=1;i<pos-1;i++){
                temp = temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
        public void display(){
            node temp = head.next;
            do{
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            while(temp != head.next);
            System.out.println( );
        }
        
        
        public static void main(String args[]){
            Scanner obj = new Scanner(System.in);
            cll list = new cll();
            while(true){
                int j = obj.nextInt();
                if(j ==-1){
                    break;
                }else{
                    list.insertbegin(j);
                }
            }
            list.display();
            int w = obj.nextInt();
            list.insertend(w);
            list.display();
            int pos = obj.nextInt();
            int q = obj.nextInt();
            list.insertpos(pos,q);
            list.display();
        }
    }
