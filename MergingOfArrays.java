package AProgramms;

import java.util.Arrays;

public class MergingOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"Tejal", "Teju", "Teja", "Gita"} ;
		String[] ar = new String[a.length] ;
		for (int i = 0; i < a.length; i++) {
			ar[i] = a[i] ;
		}
		System.out.println(Arrays.toString(ar)) ;
		
		
		int[] b = {1, 3, 4, 5, 6} ;
		int[] br = new int[b.length] ;
		for (int i = 0; i < b.length; i++) {
			br[i] = b[i] ;
		}
		System.out.println(Arrays.toString(br)) ;

	}

}
