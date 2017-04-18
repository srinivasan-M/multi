import java.util.*;
class multi{
public static void main(String args[]){
int n,c;
System.out.print("Input the integer to print its multiplication table");
Scanner in=new Scanner(System.in);
n=in.nexiInt();
System.out.print("Multiplication table of "+n+" is:-");
for(c=1;c<=10;c++)
System.out.print(n+"*"+c+"="+(n*c));}}
