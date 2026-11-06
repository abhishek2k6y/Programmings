class StAgeException extends Exception {
    StAgeException(String msg) {
        super(msg);
    }
}

class StMarksException extends Exception {
    StMarksException(String msg) {
        super(msg);
    }
}

public class StudentEx {
    public static void main(String[] args) {
        int age = 20;
        int marks = 30;

        try {
            if (age < 18) {
                throw new StAgeException("Age is too low.");
            }

            if (marks < 40) {
                throw new StMarksException("Marks must be at least 40.");
            }

            System.out.println("Eligible for exam.");

        } catch (StAgeException | StMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
