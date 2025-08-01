public class arithmetic
{
public static void main(String[] args)
{
int ch=Integer.parseInt(args[0]);
int a=Integer.parseInt(args[1]);
int b=Integer.parseInt(args[2]);
switch(ch)
{
case 1:
System.out.print("the addition= " +(a+b) );
break;
case 2:
System.out.print("the substraction= " +(a-b) );
break;
case 3:
System.out.print("the multiplication= " +(a*b) );
break;
case 4:
System.out.print("the division= " +(a/b) );
break;
default:
System.out.print("invalid choice enter between 1 to 4 only" );
}
}
}