import java.util.Scanner;
public class checkname
{
public static void main(String[] arg)
{
boolean flag=false;
int i,a=-1;
String name;
String[] s={"riddhi","siddhi","sanika","saniya","pooja"};
Scanner sc=new Scanner(System.in);
System.out.print("enter name to be search in array:-" );
name=sc.nextLine();
for(i=0;i<s.length;i++)
{
if(s[i].equals(name))
{
a=i;
flag=true;
break;
}
}
if(flag==true)
{
System.out.print("found at index ="+a);
}
else
{
System.out.print(name+" not found in the array");
}
}
}

