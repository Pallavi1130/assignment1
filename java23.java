23. Find GCD of two numbers using for loop and if statement Enter a number : 81
Enter a number 153 GCD of 81 and 153 is 9

Program:public class FindGCDExample1   
{  
public static void main(String[] args)   
{  
int x = 12, y = 8, gcd = 1;    
for(int i = 1; i <= x && i <= y; i++)  
{   
if(x%i==0 && y%i==0)  
//storing the variable i in the variable gcd  
gcd = i;  
}  
System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
}  
}  

Output:GCD of 81 and 153 is: 9