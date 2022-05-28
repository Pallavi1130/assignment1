34. Calculate power of a number using a while loop
/*34. Calculate power of a number using a while loop
O/P : 
Enter Base : 4
Enter Power : 2
4^2 = 16

Program :
public class PowerUsingWhile {
		  public static void main(String[] args) {

		    int base = 4, exponent = 2;

		    long result = 1;

		    while (exponent != 0) {
		      result *= base;
		      --exponent;
		    }

		    System.out.println("Answer = " + result);
		  }
		}