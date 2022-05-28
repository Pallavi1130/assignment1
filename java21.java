21. Display Fibonacci series using while loo
Enter the limit : 10 Fibonacci Series till 10 terms: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,

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