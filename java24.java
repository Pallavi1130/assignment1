24. Find GCD of two numbers using while loop and if else statement
Enter a number : 81 Enter a number 153 GCD of 81 and 153 is 9
Program:
public class Main
{  
public static void main(String[] args)   
{  
int n1=81, n2=153;  
while(n1!=n2)   
{  
if(n1>n2)  
n1=n1-n2;  
else  
n2=n2-n1;  
}  
System.out.printf("GCD of n1 and n2 is: " +n2);  
}  
}  

Output:
GCD of n1 and n2 is: 9