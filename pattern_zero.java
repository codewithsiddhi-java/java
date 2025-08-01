public class pattern_zero
{
public static void main(String[] arg)
{
int i,j;
int n=5;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
if((i+j)%2==0)
{
System.out.print("  1  ");
}
else
{
System.out.print("  0  ");
}}
System.out.print("\n");
}
}}
