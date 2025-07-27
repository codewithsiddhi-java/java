import java.util.Scanner;
public class greeting
{
public static void main(String arg[])
{
String str,upname;
Scanner s=new Scanner(System.in);
System.out.print("enter name of user=");
str=s.nextLine();
upname=str.toUpperCase();
System.out.print("hello " +upname+ " nice to meet you! ");
}
}
