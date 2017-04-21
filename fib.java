import java.util.*;
class fib{
public static void main(String args[]){
int a=0,b=1,c,i;
int d=Integer.parseInt(args[0]);
System.out.print(a+" "+b);
for(i=2;i<d;i++)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}
}}
