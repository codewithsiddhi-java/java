public class armarray {
public static void main(String[] arg) 
{
int i, k = 0;
int[] a = new int[arg.length]; 
for (i = 0; i < arg.length; i++)
 {
int r, sum = 0, temp, n;
n = Integer.parseInt(arg[i]); 
temp = n;
 while (n != 0)
{
r = n % 10;
sum = sum + (r * r * r);
n = n / 10;
 }
if (sum == temp) 
{
a[k] = temp;
k++;
 }
}
System.out.print("The Armstrong numbers are =");
for (i = 0; i < k; i++) 
{
  System.out.print(" " + a[i]);
        }
    }
}
