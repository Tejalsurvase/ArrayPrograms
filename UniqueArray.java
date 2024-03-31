package AProgramms;

public class UniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 2, 3, 4, 4, 6, 7} ;
		
		boolean found = false ;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					found = true ;
					break ;
				}
			}
			if (found) {
				break ;
			}
		}
		if (!found) {
			System.out.println("Unique Array.");
		} else {
			System.out.println("Not Unique Array.");

		}

	}

}
