/*interface Thr{
    void run();
}

class SubThr extends Thread implements Thr{
    @Override
    public void run(){
        System.out.println("Hello Thread Print..");
    }
}

public class printInt{
    public static void main(String[] args) {
        SubThr s1 = new SubThr();
        s1.start();
    }
}*/


class SubThr implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello Thread Print..");
    }
}

public class printInt {
    public static void main(String[] args) {

        SubThr s1 = new SubThr();
        Thread t1 = new Thread(s1);
        t1.start();
    }
}
