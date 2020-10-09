





public class Main {

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

        System.out.println( "index = " + index );


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
    }

    public static void swap( int[] array, int i, int j )
    {
        if( i==j )
            { return; }

        int temp = array[ i ];
        array[ i ] = array[ j ];
        array[ j ] = temp;

    }
}