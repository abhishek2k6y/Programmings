/*

class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            int age = 16;

            if (age < 18) {
                throw new AgeException("Age must be 18 or above.");
            }

            System.out.println("You are eligible.");

        }
        catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 */


import java.util.*;

class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);    // used to send custom msg to superclass i.e Exception
    }
}

class Eligibility {
    int age;

    public Eligibility(int age) {
        this.age = age;
    }

    void Display() throws AgeException {               ///optional to use throws.
        if(age < 18){
            throw new AgeException("Enter Age atleast 18.");
        }

        System.out.println("Eligible for voting: " + age);
    }   
}

public class AgeExcep {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter age for voting:");
            int age = sc.nextInt();
    
            Eligibility el = new Eligibility(age);
            el.Display();
        } 
        catch(InputMismatchException e){
            System.out.println("Error: Enter Integers only.");
        }
        catch (AgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
