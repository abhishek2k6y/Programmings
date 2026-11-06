abstract class Parent {
    int a =10;
    abstract void displayParent();
}

class Child extends Parent {

    @Override
    void displayParent() {
        System.out.println("This is parent class");
    }

    void displayChild() {
        System.out.println("This is child class");
    }
}

public class AbstractParentt{
    public static void main(String[] args) {
            
        Child c = new Child();
        Parent p = new Child();
        
        c.a=15;
        System.out.println(c.a);

        p.displayParent();
        c.displayChild();
        c.displayParent();
    }
}
 
