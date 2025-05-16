import java.util.Scanner;

public class TakingInputsDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Scanner object: named s

        String fName = "";   //Declare and initialize variables
        int age = 0;         //at top of method. Use proper
        double height = 0.0; //naming conventions. [camelCase]

        System.out.print("Input your first name: "); //Input 1: String
        fName = s.next(); 

        System.out.print("Input your age: "); //Input 2: int
        age = s.nextInt();

        System.out.print("Input your height: "); //Input 3: double
        height = s.nextDouble();
        
        
        System.out.println("Your height is: " + height); // Use the height variable
        System.out.println("Your age is: " + age); // Use the age variable
        System.out.println("Your first name is: " + fName); // Use the fName variable
    } //end of main method
} //end of class







/*NOTES
  o An error might occur initially. This is because programs must import the Scanner class.
  o Java has thousands of classes. With so many classes, it doesn't make sense to load them all when a program starts.
  o To import the Scanner class, an import statement must be made at the top of the program. [import java.util.Scanner;]
  o This import statements can be generated automatically by clicking on the red error line and selecting the option to import the class.
 */
