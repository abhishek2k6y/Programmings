class Thr extends Thread{
    @Override
    public void run(){
        System.out.println("Hello Thread Print..");
    }
}

public class printcls{
    public static void main(String[] args) {
        Thr t1 = new Thr();
        t1.start();
    }
}
