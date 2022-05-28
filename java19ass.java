19. Generate Multiplication Table using while loop
Enter a number : 5
5*1=5 5 * 2 = 10 5 * 3 = 15 5 * 4 = 20 5 * 5 = 25 5 * 6 = 30 5 * 7 = 35 5 * 8 = 40 5 * 9 = 45 5 * 10 = 50
Program:
public class Main{

    public static void main(String[] args) {

        int num = 5, i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}

Output:
5 * 1 = 5 
5 * 2 = 10 
5 * 3 = 15 
5 * 4 = 20 
5 * 5 = 25 
5 * 6 = 30 
5 * 7 = 35 
5 * 8 = 40 
5 * 9 = 45 
5 * 10 = 50 


** Process exited - Return Code: 0 **