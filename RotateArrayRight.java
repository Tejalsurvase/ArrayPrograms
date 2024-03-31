package AProgramms;

import java.util.Arrays;

public class RotateArrayRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 2, 3, 4, 5} ;
		int num = 4 ;
		System.out.println(rorateRight(a, num)) ;

	}
	
	public static String rorateRight(int[] a, int num)
	{
		for (int i = 0; i < num; i++) {
			int temp = a[a.length - 1] ;
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1] ;
			}
			a[0] = temp ;
		}
		return Arrays.toString(a) ;
	}

}
