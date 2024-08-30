package src.polymorphism.simply;

public class Computer {
    public static void main(String[] args) {
        UsbConnection device1 = new Mouse("logitech", 8008, 1.02);
        UsbConnection device2 = new Keyboard("Apple keyboard", 4506, 3.588);

        useDevice(device1);
        useDevice(device2);

    }

    public static void useDevice(UsbConnection d) {
        System.out.println();
        d.plugin();
        if (d instanceof Mouse mouse) {
            mouse.startUse();
        } else if (d instanceof Keyboard keyboard) {
            keyboard.startUse();
        }
        d.unPlug();
        System.out.println();
    }
}
