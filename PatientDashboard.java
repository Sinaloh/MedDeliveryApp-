import javax.swing.*;

public class PatientDashboard {
    public PatientDashboard(String email) {
        JFrame frame = new JFrame("Patient Dashboard");
        JButton placeOrder = new JButton("Place Order");
        JButton viewStatus = new JButton("View Order Status");
        JButton logout = new JButton("Logout");

        placeOrder.addActionListener(e -> {
            frame.dispose();
            new PlaceOrderScreen(email);
        });

        viewStatus.addActionListener(e -> {
            frame.dispose();
            new ViewStatusScreen(email);
        });

        logout.addActionListener(e -> {
            frame.dispose();
            new WelcomeScreen();
        });

        frame.setLayout(new java.awt.GridLayout(3, 1));
        frame.add(placeOrder);
        frame.add(viewStatus);
        frame.add(logout);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
