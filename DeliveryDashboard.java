import javax.swing.*;

public class DeliveryDashboard {
    public DeliveryDashboard(String email) {
        JFrame frame = new JFrame("Delivery Team Dashboard");
        JButton viewAssigned = new JButton("View Assigned Deliveries");
        JButton confirmDelivery = new JButton("Confirm Delivery");
        JButton logout = new JButton("Logout");

        viewAssigned.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Feature: View Assigned Deliveries (To be implemented)");
        });

        confirmDelivery.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Feature: Confirm Delivery (To be implemented)");
        });

        logout.addActionListener(e -> {
            frame.dispose();
            new WelcomeScreen();
        });

        frame.setLayout(new java.awt.GridLayout(3, 1));
        frame.add(viewAssigned);
        frame.add(confirmDelivery);
        frame.add(logout);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
