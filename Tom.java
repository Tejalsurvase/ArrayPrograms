package AProgramms;

public class Tom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 4, 10, 30, 56} ; 
		int search = 5 ;
		System.out.println(search(a, search)) ;

	}
	
	public static int search(int[] a, int targetID)
	{
		int start = 0, end = a.length-1, mid = (start + end) / 2 ;
		while (start <= end) {
			if (targetID == a[mid]) {
				return a[mid] ;
			}
			else if (targetID < a[mid]) {
				end = mid - 1 ;
			}
			else if (targetID > a[mid]) {
				start = mid + 1 ;
			}
			mid = (start + mid) / 2;
		}
		return mid - 1;
	
	}

}
