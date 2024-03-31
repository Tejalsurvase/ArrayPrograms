package AProgramms;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5,6,7,8,9,10} ;
		System.out.println(sum(ar)) ;

	}
	
	public static int sum(int[] ar)
	{
		int sum = 0 ;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i] ;
		}
		return sum ;
	}

}
