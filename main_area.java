import java.util.Scanner;
class Main_area
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
System.out.print("enter radius: ");
int rad=s.nextInt();
System.out.print("enter base = ");
float b=s.nextFloat();
System.out.print("enter height");
float h=s.nextFloat();
System.out.print("enter length");
int l=s.nextInt();
System.out.print("enter breadth");
int l2=s.nextInt();
Main_area a=new Main_area();
a.area(rad);
a.area(b,h);
a.area(l,l2);
}
void area(int r)
{
double ans=3.14*r*r;
System.out.print("\n the area of circle is: "+ans);
}
void area(int length,int breadth)
{
int ans=length*breadth;
System.out.print("\n the area of rectangle is: "+ans);
}
void area(float base,float height)
{
double ans=0.5*base*height;
System.out.print("\n the area of triangle is: "+ans);
}
}






