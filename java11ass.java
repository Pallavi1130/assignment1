                                   Assignment 2

11. Java Program to Check Alphabet using ternary operator A is an alphabet.
program:
public class Main {

    public static void main(String[] args) {

        char c = 'A';
        
        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";
        
        System.out.println(output);
    }
}


OUTPUT:
A is an alphabet.


** Process exited - Return Code: 0 **



















