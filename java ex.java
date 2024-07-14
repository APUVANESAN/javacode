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
