import java.util.Scanner;
class BinaryToInt
{
	public static void main(String[] args)
	{
		int n,binrev=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n: ");
		n=s.nextInt();
		int temp;
		int dec=0;
		temp=n;
		int power=0;
		while(n!=0)
		{
			
			int rem=n%10;
		    dec=dec +rem * expo(2,power);
			power++;
			
			n=n/10;
		}
		System.out.println("the ans: "+dec);
	}
	public static int expo(int base,int pow)
	{
		int expovar=1;
		for(int i=1;i<=pow;i++)
		{
			expovar=expovar*base;
		}
		return expovar;
	}
}