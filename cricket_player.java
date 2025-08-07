import java.util.Scanner;
import java.io.*;
class cricket
{
String nm;
int pid,run,inning,notout;
float avg;
void accept()
{
Scanner s=new Scanner(System.in);
System.out.print("enter player name: ");
nm=s.nextLine();
System.out.print("enter player ID: ");
pid=s.nextInt();
System.out.print("enter total runs: ");
run=s.nextInt();
System.out.print("enter total innings: ");
inning=s.nextInt();
System.out.print("enter how many times not out : ");
notout=s.nextInt();
}
void display()
{
avg=run / inning;
System.out.print("the details are\n");
System.out.println("pid:  "+pid);
System.out.println("nm:  "+nm);
System.out.println("innings:  "+inning);
System.out.println("not out:  "+notout);
System.out.println("average:  "+avg);
}
}
class cricket_player
{
public static void main(String[] arg)
{
int i;
float max;
Scanner s1=new Scanner(System.in);
System.out.print("enter n:  ");
int n=s1.nextInt();
cricket c[]=new cricket[n];
for(i=0;i<n;i++)
{
c[i]=new cricket();
c[i].accept();
}
for(i=0;i<n;i++)
{
c[i].display();
}
max=c[0].avg;
for(i=0;i<n;i++)
{
if(c[i].avg>max)
{
max=c[i].avg;
}
}
System.out.print("maximum average=" +max);
}
}

