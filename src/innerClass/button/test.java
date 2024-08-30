package src.innerClass.button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    public static void main(String[] args) {
        // 1. create a window
        JFrame window = new JFrame("Window");
        window.setSize(400, 300); // set window size
        window.setVisible(true);  // set visibility
        window.setLocationRelativeTo(null); // location is center

        // 2. create a panel
        JPanel panel = new JPanel();
        window.add(panel); // at panel on the window

        // 3. create 3 button
        JButton btn = new JButton("Click Me");
        btn.setSize(100, 50);
        btn.setLocation(150, 50);

        JButton btn2 = new JButton("Try me!");
        btn2.setSize(100, 50);
        btn2.setLocation(150, 100);

        JButton btn3 = new JButton("And me!");
        btn3.setSize(100, 50);
        btn3.setLocation(150, 150);


        // 4. add btn to the panel
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);

        // 5. add behavior on btn
        // way1
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("btn1 Clicked!!");
                JOptionPane.showMessageDialog(window, "I am clicked!!");
            }
        });
        // way2
        btn2.addActionListener(e -> {
            System.out.println("btn2 Clicked!!");
            JOptionPane.showMessageDialog(window, "Now I am clicked!!");
        });

        // way3
        btn3.addActionListener(e -> JOptionPane.showMessageDialog(window, "Finally, I am clicked!"));
    }
}
