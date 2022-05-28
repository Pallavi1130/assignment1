17. Find Factorial of a number using while loop
Enter a number : 10 Factorial of 10 = 3628800
Program:
public class Main {

    public static void main(String[] args) {

        int num = 10, i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
Output:
Factorial of 10 = 3628800

** Process exited - Return Code: 0 **