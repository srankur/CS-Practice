public class BiggestPalindrome{
	
	static int match = -1;
	public static void main (String[] args){
		String teststr= "abcbamalayalam";
		
		match = findBigPalindrome(teststr);
		System.out.println("Length::"+ match);
		


	}

	static int  findBigPalindrome(String testStr){
		int i =1, result=-1;	
		System.out.println("String Length::"+ testStr.length());

		while( i < testStr.length() ){
			int m =i;
			int k =i;
			
			while( k<testStr.length()-1 &&  testStr.charAt(--m) == testStr.charAt(++k)&& m>0   ){
				if (result < (2*(k-i)+1)){
					result = 2*(k-i)+1;
		       		}

			}
			i++;
		
		}
			System.out.println("Result"+ result);
		return result;
	
	}



}
