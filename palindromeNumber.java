/*39. Java Program to Check Palindrome Number
OP : 

Enter a number : 1221
It is a palindrome number*/

public class PalindromeNumber {

	public static void main(String[] args) {
		 int r,sum=0,temp;    
		  int n=1221;
		 
		  temp=n;    
		  while(n>0){    
		   r=n%10;    
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(" it is a palindrome number ");    
		  else    
		   System.out.println("it is not a palindrome number");    
		}  
		}  
		

