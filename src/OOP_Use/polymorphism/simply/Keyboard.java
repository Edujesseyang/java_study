package src.OOP_Use.polymorphism.simply;

public class Keyboard implements UsbConnection {
    private String keyBoardName;
    private int port;
    private double version;

    public Keyboard() {
    }

    public Keyboard(String keyBoardName, int port, double version) {
        this.keyBoardName = keyBoardName;
        this.port = port;
        this.version = version;
    }

    @Override
    public void plugin() {
        System.out.println("Connected " + this.keyBoardName);
        System.out.print("Port :" + this.port);
        System.out.println("\t\tVersion: " + this.version);
    }

    @Override
    public void unPlug() {
        System.out.println("Disconnected " + this.keyBoardName);
    }

    public void startUse() {
        System.out.println("You can start typing on " + this.keyBoardName);
    }
}
