import java.util.Scanner;
class Armstrong
{
static int temp;
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
int n;
System.out.print("enter number to be checked:  ");
n=s.nextInt();
int r,sum=0;
temp=n;
while(n!=0)
{
r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(sum==temp)
{
System.out.print("number is armstrong:  " +temp);
}
else
{
System.out.print("number is not armstrong:  " + temp);
}
}}






