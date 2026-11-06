import java.util.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class LowScoreException extends Exception {
    LowScoreException(String msg) {
        super(msg);
    }
}

class CourseRegistration {
    String name;
    int age;
    int testScore;

    CourseRegistration(String name, int age, int testScore) {
        this.name = name;
        this.age = age;
        this.testScore = testScore;
    }

    void Display() throws InvalidAgeException, LowScoreException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }

        if (testScore < 60) {
            throw new LowScoreException("Test score must be at least 60.");
        }

        System.out.println("Course registration successful!");
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Test Score: " + testScore);
    }
}

public class Course {
    public static void main(String[] args) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter age: ");
                int age = sc.nextInt();
                System.out.print("Enter test score: ");
                int testScore = sc.nextInt();

                CourseRegistration cr = new CourseRegistration(name, age, testScore);
                cr.Display();

                if (testScore < 0 || testScore > 100) {
                    throw new IllegalArgumentException("Score must be between 0 and 100.");
                }
            } 
            catch (IllegalArgumentException | InvalidAgeException | LowScoreException e) {
                System.out.println("Exception: " + e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println("Exception: Please enter integers for age and score.");
            }
    }
}
