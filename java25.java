25. GCD for both positive and negative numbers 
Enter a number : 81 Enter a number -153 GCD of 81 and -153 is 9
Program:
class GCD {
  public static void main(String[] args) {

    int n1 = 81, n2 = -153;

    n1 = ( n1 > 0) ? n1 : -n1;
    n2 = ( n2 > 0) ? n2 : -n2;

    while(n1 != n2) {
        
      if(n1 > n2) {
        n1 -= n2;
      }
      
      else {
        n2 -= n1;
      }
    }
    
    System.out.println("GCD: " + n1);
  }
}

Output:
GCD: 9