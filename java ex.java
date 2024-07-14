Scan a string and print all the Characters until it meets lowercase  character.
import java.util.;
class main{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
String str = obj.nextLine();
StringBuilder d = new StringBuilder();
for(char ch : str.toCharArray()){
if(Characters.isLowerCase(ch)){
break;
}
d.append(ch);
}
System.out.print(d.toString());
}
}

Given two strings ,write a code to compare two strings to check and say equal or not.
import java.util.*;
class main{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
String str1 = obj.nextLine();
String str2 = obnj.nextLine();
if(str1.equals(str2)){
System.out.print("Equal");}
else{
System.out.print("Not Equal");}
}
} 

Write a program to implement strupr function.
import java.util.*;
class main{
public static void main(String args[]){
Scanner obj = new Scanner(System.in);
String str = obj.nextLine();
System.out.print(str.toUpperCase());
}
}

Write a program to convert the digits in the string into a single number.
import java.util.*;
class main{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    String str = obj.nextLine();
    int r = 0;
    for(int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      if(Character.isDigit(c)){
        r = (r * 10) + (c - '0');
      }
    }
    System.out.print(r);
  }
}

Write a program to print the values from 1 to n except multiples of 4.use continue statement to skip 4.
import java.util.*;
class main{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    for(int i = 1;i < n ; i++){
      if(i % 4 == 0)
        continue;
      else
        System.out.print(i +" ");
    }
  }
}

Accept an integer N and generate the first N terms of the fibonacci series.
import java.util.*;
class main{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int a = 0,b = 0, c = 1;
    for(int i = 0; i < n; i++){
      System.out.print(c+" ");
      a = c;
      c = c + b;
      b = a;}
  }
}

check wheather the given number is a triangular number.
import java.util.*;
class main{
  public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    int n = obj.nextInt();
    int i = 0;
    while(n > 0){
      n = n - i;
      i++;
    }
    if(n == 0)
      System.out.print("Triangular Number");
    else
      System.out.print("Not a Triangular Number");
  }
}
      
  
