import java.util.Scanner;

public class RepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		int [] ar = {1,2,3,4,5,3,2,1,3,5,2,1,3,5,6} ;
		
		System.out.println("Enter the element :") ;
		int num = sc.nextInt();
		
		System.out.println(countRepeate(ar, num)) ;
		

	}
	
	public static int countRepeate(int[] ar, int num)
	{
		int count = 0;
		for (int i = 0; i < ar.length;i++) {
			if (num == ar[i]) {
				count++ ;
			}
		}
		return count ;
	}

}
