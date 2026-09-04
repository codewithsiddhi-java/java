import java.util.Scanner;

class TwistedPrime
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number to check for twisted prime: ");
        int n = s.nextInt();

        if(prime(n) == 2)
        {
            int rev = reverse(n);

            if(prime(rev) == 2)
            {
                System.out.println(n + " is a Twisted Prime Number");
            }
            else
            {
                System.out.println(n + " is Prime but not Twisted Prime");
            }
        }
        else
        {
            System.out.println(n + " is not Prime");
        }
    }

    public static int prime(int n)
    {
        int count = 0;

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }

        return count;
    }

    public static int reverse(int n)
    {
        int rev = 0;

        while(n != 0)
        {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        return rev;
    }
}