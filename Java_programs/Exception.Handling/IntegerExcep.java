import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerExcep {
      @SuppressWarnings("CallToPrintStackTrace")
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter numerator: ");
                int a = sc.nextInt();
                System.out.print("Enter denominator: ");
                int b = sc.nextInt();
                int result = a / b;
                System.out.println("Result = " + result);
            }
            // catch (ArithmeticException e){
            //     System.out.println("Exception: Cannot divide by zero");
            // }
            catch (InputMismatchException e){
                System.out.println("Exception: Enter Integers only");
            }
            catch (Exception e){
                System.out.println("Show Details regarding Exception.");
                System.out.println(e.getMessage());
                System.out.println("-------------------------");
                System.out.println(e.toString());
                System.out.println("-------------------------");
                //System.out.println(e.printStackTrace());
                e.printStackTrace();
            }
        }    
}
