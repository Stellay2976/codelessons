import java.util.Scanner;

public class TakingCharacterInputDemo {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); //declares Scanner object
        char fInitial = ' '; //initialize char variable

        System.out.print("Input your first initial: "); //prompt user for input
        fInitial = s.next().charAt(0); //take input and convert to char

        System.out.println("Your first initial is: " + fInitial); //use input [use variable]
    } //end of main method
} //end of class


/*NOTES
   Set Up Variables:
     o Always do this at the top of the method.
     o Use proper naming conventions. [camelCase]
            - Start with a lowercase letter.
            - Use descriptive names.
 */
