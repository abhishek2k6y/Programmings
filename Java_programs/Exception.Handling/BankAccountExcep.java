import java.util.InputMismatchException;
import java.util.Scanner;

class Insufficient_BankBalance extends Exception{
    public Insufficient_BankBalance(String msg) {
        super(msg);
    }
}

public class BankAccountExcep {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Bank Balance:");
            int bal = sc.nextInt();
            System.out.print("Enter Withdrawal amount:");
            int amt = sc.nextInt();

            if(amt>bal){
                throw new Insufficient_BankBalance("\nInsufficient Balance: Deposit Money First!");
            } else {
                bal = bal-amt;
                System.out.println("Successful withdrawal of Rs. "+ amt);
                System.out.println("Remaining Balance Rs. "+ bal);
            }
        } 
        catch (Insufficient_BankBalance e) {
            System.out.println(e.toString());
        }
        catch (InputMismatchException e){
            System.out.println("Error: Enter Integers onlyy.");
        }

    }
}
