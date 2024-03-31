package AProgramms;

public class WithoutLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,4,5,6} ;
		int count = 0 ;
		try {
			for(; ; )//while(true)
			{
				arr[count] = arr[count] ;
				count++ ;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(count) ;
		}

	}

}
