read and print an integer

import java.util.*;
class main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        System.out.printf("Entered number is : %d",num);
    }
}

read input from console java

import java.util.*;
class main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int a = obj.nextInt();
        float b = obj.nextFloat();
        System.out.printf("entered string is : %s \n",str);
        System.out.printf("entered integer is : %d \n ",a);
        System.out.printf("entered float is : %.2f \n",b);
    }
}

multiplication of two float values

import java.util.*;
class main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        float num1 = obj.nextFloat();
        float num2 = obj.nextFloat();
        float result = num1 * num2;
        System.out.printf("the multiply of two float values are : %.2f ",result);
    }
}

swaping of two numbers

import java.util.*;
class main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
         System.out.print("before swap\n");
         System.out.print("enter the A value");
         int a = obj.nextInt();
         System.out.print("enter the B value");
        int b = obj.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.print("After the swap\n");
        System.out.printf("now a is : %d\n",a);
        System.out.printf("now b is : %d\n",b);
    }
}
