package src.Syntax.lambda;

import javax.swing.*;

public class example2 {
    public static void main(String[] args) {
        // create a window
        JFrame window = new JFrame("The Window");
        window.setSize(400, 300);
        window.setVisible(true);
        // create a button
        JButton btn = new JButton("Click me");
        btn.setSize(100, 50);
        btn.setLocation(150, 100);
        window.add(btn);

        // add evenListener on the button
        // before:
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("I'm clicked");
//            }
//        });

        // simplified:
//        btn.addActionListener((ActionEvent e) -> {
//            System.out.println("I'm clicked");
//        });

        // simplified more:
//        btn.addActionListener((e) -> {
//            System.out.println("I'm clicked");
//        });

        // even more simplified:  -- only one param can remove ()
        btn.addActionListener(e -> System.out.println("I'm clicked"));

    }
}
