import java.util.*;

class MyNumber extends Thread {
    int num;

    MyNumber(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (num % 2 == 0) {
            System.out.println(num + " is an Even Number.");
        } else {
            System.out.println(num + " is an Odd Number.");
        }
    }
}

class Tablee extends Thread {
    int num;

    Tablee(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();

            MyNumber mn = new MyNumber(num);
            mn.start();
            Tablee tb = new Tablee(num);
            tb.start();
        }
    }
}
