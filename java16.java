16.Find Factorial of a number using BigInteger Enter a number : 30 
Factorial of 30 = 265252859812191058636308480000000
Program:
public class Main{

    public static void main(String[] args) {

        int num = 30;
        BigInteger factorial = BigInteger.ONE;
        for(int i = 1; i <= num; ++i)
        {
            
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
Output:
Factorial of 30 = 265252859812191058636308480000000

** Process exited - Return Code: 0 **