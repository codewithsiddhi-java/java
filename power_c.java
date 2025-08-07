import java.util.Scanner;
class power_c
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
System.out.print("enter base:=  ");
int base=s.nextInt();
System.out.print("enter exponent:=  ");
int exponent=s.nextInt();
System.out.print("the power is "+funpow(base,exponent));
}//main close
static int funpow(int base,int exponent)
{
if(exponent==0)
{
return 1;
}
else
{
return base*funpow(base,exponent-1);
}

}}

