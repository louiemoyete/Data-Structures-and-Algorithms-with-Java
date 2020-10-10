package recursion;

public class recursion 
{
    public static void main( String[] args )
	{
        System.out.println( iterativeFactorial( 3 ));
        System.out.println( recursiveFactorial( 3 ));
    }
    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!
    // n! = n *(n - 1)!

    public static int recursiveFactorial( int n )
	{
        if( n==0 )
			{ return 1; }
        return( n * recursiveFactorial( n-1 ));
    }

    public static int iterativeFactorial( int n )
	{
        if( n==0 )
			{ return 1; }
        int factorial = 1;
        for( int i=1; i<=n; i++ )
			{ factorial*=i; }
        return( factorial );
    }
}
