import java.util.Scanner;
import java.io.*;
class product
{
String nm;
int pid,qty,rate;
int total;
void accept()
{
Scanner s=new Scanner(System.in);
System.out.print("enter product name: ");
nm=s.nextLine();
System.out.print("enter product ID: ");
pid=s.nextInt();
System.out.print("enter qty: ");
qty=s.nextInt();
System.out.print("enter rate : ");
rate=s.nextInt();
}
void display()
{
total=qty * rate;
System.out.print("the details are\n");
System.out.println("pid:  "+pid);
System.out.println("nm:  "+nm);
System.out.println("rate:  "+rate);
System.out.println("qty:  "+qty);
System.out.println("total amount:  "+total);
}
}
class producttotal
{
public static void main(String[] arg)
{
int i;
Scanner s1=new Scanner(System.in);
System.out.print("enter n:  ");
int n=s1.nextInt();
product p[]=new product[n];
for(i=0;i<n;i++)
{
p[i]=new product();
p[i].accept();
}
for(i=0;i<n;i++)
{
p[i].display();
}
}
}

