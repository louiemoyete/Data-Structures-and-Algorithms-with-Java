package quicksort;

public class quicksort 
{
    public static void main( String[] args )
	{
        int[] arr = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort( arr, 0, arr.length );

        for( int i=0; i<arr.length; i++ )
			{ System.out.println( arr[ i ]); }
    }

    public static void quickSort( int[] input, int start, int end )
	{
        if( end-start < 2 )
			{ return; }

        int pivotIndex = part( input, start, end );
        quickSort( input, start, pivotIndex );
        for( int i=0; i<input.length; i++ )
			{ System.out.println( input[ i ]); }
        quickSort( input, pivotIndex+1, end );
    }

    public static int part( int[] input, int start, int end )
	{
        // Pivot 1st element 
        int pivot = input[ start ];
        int i = start;
        int j = end;

        while( i<j )
			{
            while( i<j && input[ --j ] >= pivot );
            if( i<j )
				{ input[ i ]=input[ j ]; }
            while( i<j && input[ ++i ] <= pivot);
            if( i<j )
				{ input[ j ]=input[ i ]; }

        }
        input[ j ] = pivot;
        return j;
    }
}
