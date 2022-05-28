12. Java Program to Check Alphabet using isAlphabetic() Method a is an alphabet.

Program:
public class Main {      
    public static void main(String[] args) {  
    char codepoint1 = '0';  
    char codepoint2 = '1';  
    boolean b1 = Character.isAlphabetic(codepoint1);  
    boolean b2 = Character.isAlphabetic(codepoint2);    
    System.out.println("The returned value for the first character is given as:"+"   "+b1);  
    System.out.println("The returned value for the first character is given as:"+"   "+b2);  
      
        }  
    }  

Output:
The returned value for the first character is given as:   false
The returned value for the first character is given as:   false


