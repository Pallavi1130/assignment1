/*38. Java Program to Check Palindrome String

O/P : 
Enter a String : ABCBA
It is a pallindrom String*/
public class PalindromeString {

	public static void main(String[] args) {
		
			static boolean isPalindrome(String str)
			{
				int i = 0, j = str.length() - 1;
				while (i < j) {
					if (str.charAt(i) != str.charAt(j))
						return false;

					i++;
					j--;
				}

				return true;
			}
	
			{
				String str = "ABCBA";
		
				str = str.toLowerCase();
	
				if (isPalindrome(str))
					
					System.out.print("Yes");
				else
					System.out.print("No");
			}
		}


	

