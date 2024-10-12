
import java.util.*;
class hello
{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();int c=0;
        int p=1,o=0;
        while(a!=0)
        {
            o=a%10;
            if(o==0)
              o=5;
           c=(o*p)+c;
            p=p*10;
           a=a/10;
        }
System.out.print(c);
        }
}
