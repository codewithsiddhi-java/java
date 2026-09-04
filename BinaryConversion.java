import java.util.Scanner;

class BinaryConversion
{
    public static void main(String[] args)
    {
        int n = 34;
        int temp = n;
        int binrev = 0;
        int cnt = 0;

        while(n != 0)
        {
            cnt++;
            int rem = n % 2;
            binrev = binrev * 10 + rem;
            n = n / 2;
        }

        int bin = reverse(binrev);
        String actbin = bin + "";

        if(actbin.length() < cnt)
        {
            int bal = cnt - actbin.length();

            for(int i = 0; i < bal; i++)
            {
                actbin = actbin +"0";
            }
        }

        System.out.println("Binary format of " + temp + " is " + actbin);
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