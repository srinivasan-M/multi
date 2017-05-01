import java.io.*;
class HCF
{
public static void main(String args[])
{
int first=Integer.parseInt(args[0]);
int second=Integer.parseInt(args[1]);
int hcf=0;
int min=Math.min(first,second);
for(int i=min;i>=1;i--){
if(first%i==0 && second%i==0){
hcf=i;'
}}
System.out.println("Hcf:"+hcf);
}}
