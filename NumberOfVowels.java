package AProgramms;

public class NumberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch = {'a','b','c','d','e'};
		System.out.println("The numbers of vowels present in array is " +countVowel(ch)) ;

	}
	
	public static int countVowel(char[] ar)
	{
		int count = 0 ;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 'a' || ar[i] == 'e' || ar[i] == 'i' || ar[i] == 'o' || ar[i] == 'u' || 
					ar[i] == 'A' || ar[i] == 'E' || ar[i] == 'I' || ar[i] == 'O' || ar[i] == 'U') {
				count++ ;
				//return IndexOfElement(ar) ;
			}
		}
		return count ;
	}
	
	public static int indexOfElement(char[] ar)
	{
		for (int i = 0; i < ar.length; i++) {
			return ar[i] ;
		}
		return 0;
	}

}
