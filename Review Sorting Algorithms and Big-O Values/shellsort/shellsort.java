package shellsort;

public class shellsort 
{
    public static void main( String[] args )
	{
	    int[] arrInt = { 20, 35, -15, 7, 55, 1, -22 };
        for( int inBetween = arrInt.length/2; inBetween>0; inBetween/=2 ) 
		{
            for( int i = inBetween; i<arrInt.length; i++ ) 
			{
                int newElem=arrInt[ i ];
                int j=i;
                while( j>=inBetween && arrInt[ j-inBetween ]>newElem )
					{
                    arrInt[ j ]=arrInt[ j-inBetween ];
                    j-=inBetween;
                }
                arrInt[ j ]=newElem;
            }
        }
        for( int i=0; i<arrInt.length; i++ )
			{ System.out.println(arrInt[ i ]); }
    }
}
