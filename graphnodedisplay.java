import java.util.*;
public class Main 
{
    static class Node 
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static class Graph
    {
        int V;
        Node[] head;
        public Graph(int V)
        {
            this.V = V;
            this.head = new Node[V];
        }
        public void create(int src,int dest)
        {
            Node newnode = new Node(src);
            if(head[dest] == null)
                head[dest] = newnode;
            else 
            {
                Node tptr = head[dest];
                while(tptr.next != null)
                    tptr = tptr.next;
                tptr.next = newnode;
            }
            newnode = new Node(dest);
            if(head[src] == null)
                head[src] = newnode;
            else 
            {
                Node tptr = head[src];
                while(tptr.next != null)
                    tptr = tptr.next;
                tptr.next = newnode;
            }
        }
        public void display()
        {
            for(int ind = 0; ind < V; ind++){
              Node tptr = head[ind];
              while(tptr != null){
                 System.out.print(tptr.data+" ");
                 tptr = tptr.next;}
                 System.out.println();}
        }
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int V = input.nextInt();
        int E = input.nextInt();
        Graph graph = new Graph(V);
        for(int itr = 1 ; itr <= E ; itr++)
        {
            int src = input.nextInt();
            int dest = input.nextInt();
            graph.create(src,dest);
        }
        graph.display();
        input.close();
    }
}
