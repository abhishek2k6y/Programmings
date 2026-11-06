class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException(String msg){
        super(msg);
    }
}


class NameNotValidException extends Exception{
    public NameNotValidException(String msg){
        super(msg);
    }
}


class Studentt{
    int RollNo;
    String Name;
    int Age;
    String Course;

    public Studentt(int Age, String Course, String Name, int RollNo) throws AgeNotWithinRangeException, NameNotValidException{
        this.Age = Age;
        this.Course = Course;
        this.Name = Name;
        this.RollNo = RollNo;

        if (Age<15 || Age>21)
            throw new AgeNotWithinRangeException("Enter Age between 15 to 21.");

        for (int i = 0; i < Name.length(); i++) {
            char ch = Name.charAt(i);

            if (!Character.isLetter(ch) && ch != ' ') {
                throw new NameNotValidException("Name contains numbers or special symbols");
            }
        }

        // if (!Name.matches("[a-zA-Z ]+")) {
        //     throw new NameNotValidException("Name should not contain numbers or special symbols");
        // }

    }


    void Display(){
        System.out.println("Student Details...");
        System.out.println("Roll No: " + RollNo);
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Course: " + Course);
    }
}

public class StudentAttExcep{
    public static void main(String[] args) {
        try {
            Studentt s1 = new Studentt(20,"Aiml", "Abhishek",25261799);
            s1.Display();
        } 
        catch (AgeNotWithinRangeException | NameNotValidException e){
            System.out.println(e.getMessage());
        }
        
    }
}
