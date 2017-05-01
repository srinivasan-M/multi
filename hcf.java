import java.util.*;
class hcf
{
public static void main(String args[])
{
int firstnum=Integer.parseInt(args[0]);
int secondnum=Integer.parseInt(args[1]);
int a=firstnum*secondnum;
int hcf=1;
for(int i=2;i<a;i++){
if(firstnum%i==0 && secondnum%i==0){
hcf=i;
}}
System.out.println("hcf:"+hcf);
}}
