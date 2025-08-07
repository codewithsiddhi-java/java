import java.util.Scanner;
class sum_c
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
System.out.print("enter no:=  ");
int n=s.nextInt();
System.out.print("the power is "+sum(n));
}//main close
static int sum(int n)
{
if(n==0)
{
return 1;
}
else
{
return (n%10)+sum(n/10);
}

}}

