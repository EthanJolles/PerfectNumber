public class Main
{

    public static void main(String[] args)
    {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(1));
    }

    public static boolean isPerfectNumber(int x)
    {
        int comparison = 0;
        if(x<1)
        {
            return false;
        }
        for(int i = 1; i<x; i++)
        {
            if (x % i == 0)
            {
                comparison += i;
            }
        }
        return (comparison == x);
    }
}
