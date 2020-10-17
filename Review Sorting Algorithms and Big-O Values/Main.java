





public class Main 
{
    public static void main( String[] args )
    {
        int[] arr = new int[ 7 ];

        arr[ 0 ] = 20;
        arr[ 1 ] = 35;
        arr[ 2 ] = -15;
        arr[ 3 ] = 7;
        arr[ 4 ] =55;
        arr[ 5 ] = 1;
        arr[ 6 ] = -22;

        int ind = -1;
        for( int i = 0; i < arr.length; i++ )
        {
            if( arr[ i ] == 7 )
            {
                ind = i;
                break;
            }
        }

        System.out.println( "index = " + ind );
        int[] arr2 = { 20, 35, -15, 7, 55, 1, -22 };

        for( int lastUnsortedIndex = arr2.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- )
        {
            for( int i = 0; i < lastUnsortedIndex; i++ )
            {
                if( arr2[ i ] > arr2[ i+1 ])
                    { swap( arr2, i, i + 1 ); }
            }
        }

        for( int i = 0; i < arr2.length; i++ )
            { System.out.println( arr2[ i ] ); }

        int[] arr3 = { 20, 35, -15, 7, 55, 1, -22 };

        for( int lastUnsortedIndex = arr3.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- )
        {
            int largest = 0;
            for( int i = 1; i <= lastUnsortedIndex; i++ )
            {
                if( arr3[ i ] > arr3[ largest ] )
                    { largest = i; }
            }
            swap2( arr3, largest, lastUnsortedIndex );
        }
        for( int i = 0; i < arr3.length; i++ )
            { System.out.println( arr3[ i ] ); }
    }

    public static void swap( int[] arr, int i, int j )
    {
        if( i==j )
            { return; }
        int temp = arr[ i ];
        arr[ i ] = arr[ j ];
        arr[ j ] = temp;
    }
    public static void swap2( int[] arr, int i, int j )
    {
        if( i==j )
        { return; }
        int temp = arr[ i ];
        arr[ i ] = arr[ j ];
        arr[ j ] = temp;
    }
}