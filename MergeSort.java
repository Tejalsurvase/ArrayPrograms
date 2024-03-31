package AProgramms;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {7, 56, 4, 78, 65, 45, 9, 87} ;
		mergeSort(ar, 0, ar.length - 1) ;
		System.out.println(Arrays.toString(ar)) ;
		
	}
	
	public static void mergeSort(int[] ar, int low, int high)
	{
		if(low < high)
		{
			int mid = (low + high) / 2 ;
			mergeSort(ar, low, mid) ;
			mergeSort(ar, mid + 1, high) ;
			merge(ar, low, mid, high) ;
		}
	}
	
	public static void merge(int[] ar, int low, int mid, int high)
	{
		int[] ans = new int[ar.length] ;
		int i = low, j = mid + 1, k = low ;
		while(i <= mid && j <= high)
		{
			if(ar[i] < ar[j])
			{
				ans[k++] = ar[i++] ;
			}
			else
			{
				ans[k++] = ar[j++] ;
			}
		}
		while(i<= mid)
		{
			ans[k++] = ar[i++] ;
		}
		while(j <= high)
		{
			ans[k++] = ar[j++] ;
		}
		
		for(int k1 = low; k1 <= high; k1++)
		{
			ar[k1] = ans[k1] ;
		}
	}

}
