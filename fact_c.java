import java.util.Scanner;
public class fact_c
{
public static void main(String[] arg)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("enter number=  ");
n=s.nextInt();
System.out.println("the factorial " +fact(n));
}
static int fact(int n)
{
if(n==0)
{
return 1;
}
else
{
return (n*fact(n-1));
}
}
}