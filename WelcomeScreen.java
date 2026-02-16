import javax.swing.*;

public class WelcomeScreen {
    public WelcomeScreen() {
        JFrame frame = new JFrame("MedDeliveryApp");
        JLabel label = new JLabel("Welcome to MedDeliveryApp", SwingConstants.CENTER);
        JButton login = new JButton("Login");
        JButton register = new JButton("Register");

        login.addActionListener(e -> {
            frame.dispose();
            new LoginScreen();
        });

        register.addActionListener(e -> {
            frame.dispose();
            new RegisterScreen();
        });

        frame.setLayout(new java.awt.GridLayout(3, 1));
        frame.add(label);
        frame.add(login);
        frame.add(register);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
