26. LCM using while Loop and if Statement
Enter a number : 72 Enter a number : 120 LCM is 360
Program:
public class Main {
  public static void main(String[] args) {

    int n1 = 72, n2 = 120, lcm;
    lcm = (n1 > n2) ? n1 : n2;
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}

Output:
The LCM of 72 and 120 is 360.