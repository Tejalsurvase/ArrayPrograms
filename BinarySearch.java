package AProgramms;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 3, 5, 79, 87, 345, 3245} ;
		int start = 0, end = a.length - 1 ;
		int mid = (start + end) / 2 ;
		int search = 80 ;
		while (start <= end) {
			if (search == a[mid]) {
				System.out.println("Element is present") ;
			}
			else if (search < a[mid]) {
				end = mid - 1;
			}
			else if (search > a[mid]) {
				start = mid + 1 ;
			}
			mid = (start + end) / 2 ;
		}
		if (start > end) {
			System.out.println("Element is not present") ;
		}

	}

}
