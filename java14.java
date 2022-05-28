14. Sum of Natural Numbers using while loop
Enter a limit : 100  Sum = 5050

Program:

public class Main {

    public static void main(String[] args) {

        int num = 50, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}

Output:
Sum = 1275


** Process exited - Return Code: 0 **