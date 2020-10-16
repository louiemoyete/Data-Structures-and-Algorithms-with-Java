package radixsort;

public class radixsort 
{
    public static void main( String[] args )
	{
        int[] arr = { 4725, 4586, 1330, 8792, 1594, 5729 };
        radixSort(arr, 10, 4);

        for( int i=0; i<arr.length; i++ )
			{ System.out.println(arr[i]); }
    }

    public static void radixSort( int[] in, int radix, int width )
	{
        for( int i=0; i<width; i++ )
			{ radixSingleSort( in, i, radix ); }
    }

    public static void radixSingleSort( int[] in, int postn, int radix )
	{
        int items = in.length;
        int[] arrCount = new int[ radix ];
        for( int value: in )
			{ arrCount[ getDigit( postn, value, radix )]++; }
			
        for( int j=1; j<radix; j++ )
			{ arrCount[ j ]+=arrCount[ j-1 ]; }

        int[] arrTemp = new int[ items ];
        for( int arrTempIndex=( items-1 ); arrTempIndex>=0; arrTempIndex-- )
			{ arrTemp[ --arrCount[ getDigit( postn, in[ arrTempIndex ], radix )]] = in[ arrTempIndex ]; }

        for( int arrTempIndex=0; arrTempIndex<items; arrTempIndex++ )
			{ in[ arrTempIndex ]=arrTemp[ arrTempIndex ]; }

    }

    public static int getDigit( int postn, int value, int radix ) 
		{ return value/( int )Math.pow( radix, postn )% radix; }

}
