import java.util.Scanner;
public class palindrome
{
public static void main(String[] arg)
{
String str;
Scanner sc=new Scanner(System.in);
System.out.print("enter a string to be check palindrome or not=" );
str=sc.nextLine();
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
rev=rev+str.charAt(i); //adding reverse characters into empty string
}
if(str.equals(rev))
{
System.out.println( str + " string is palindrome");
}
else
{
System.out.println( str  + " string is not palindrome");
}
}
}