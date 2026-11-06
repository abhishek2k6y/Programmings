interface MyCamera {
    void takeSnap();
    void recordVideo();

    // Private method (can only be used inside the interface)
    private void greet() {
        System.out.println("This is a private method");
    }

    // Default method
    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4K...");
    }
}


interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}


class MyCellPhone {

    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {

    @Override
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Taking snap");
    }

    @Override
    public String[] getNetworks() {

        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry","Prashanth","Anjali5G"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class default_methods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        ms.callNumber(788);
        ms.pickCall();

        // ms.greet(); ❌ Cannot access private interface method

        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
