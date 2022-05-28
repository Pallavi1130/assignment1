20. Display Fibonacci Series Using for Loop
Enter the limit : 10 Fibonacci Series till 10 terms: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
Program:
public class Main {

    public static void main(String[] args) {

        int count = 10 ,num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}

Output:Fibonacci Series of 10 numbers:0 1 1 2 3 5 8 13 21 34 

** Process exited - Return Code: 0 **