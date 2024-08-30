package src.polymorphism.simply;

public class Mouse implements UsbConnection {

    private String mouseName;
    private int port;
    private double version;

    public Mouse() {

    }

    public Mouse(String mouseName, int port, double version) {
        this.mouseName = mouseName;
        this.port = port;
        this.version = version;
    }

    @Override
    public void plugin() {
        System.out.println("Connected " + this.mouseName);
        System.out.print("Port :" + this.port);
        System.out.println("\t\tVersion: " + this.version);

    }

    @Override
    public void unPlug() {
        System.out.println("Disconnected " + this.mouseName);
    }

    public void startUse() {
        System.out.println(this.mouseName + " start working...");

    }
}
