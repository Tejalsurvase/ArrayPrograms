package AProgramms;

public class SizeWithoutLength {
	public static void main(String[] args) {
		
		int[] ar = {1,2,3,4,5,6,7} ;
		System.out.println(countSize(ar)) ;
		
	}
	
	public static int countSize(int[]ar)
	{
		int size = 0 ;
		int i = 0 ;
		while(ar[i] != 0)
		{
			size++ ;
			i++ ;
		}
		return size ;
	}
}