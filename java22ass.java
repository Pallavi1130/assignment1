22. Display Fibonacci series up to a given number
Enter the limit : 25 Fibonacci Series till 10 terms: 0, 1, 1, 2, 3, 5, 8, 13, 21,
Program:
class Main {
  public static void main(String[] args) {

    int n = 25, firstTerm = 0, secondTerm = 1;
        
    System.out.println("Fibonacci Series Upto " + n + ": ");
    
    while (firstTerm <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}
Output:
Fibonacci Series Upto 25: 
0, 1, 1, 2, 3, 5, 8, 13, 21, 

** Process exited - Return Code: 0 **