import javax.swing.*;

public class ClinicDashboard {
    public ClinicDashboard(String email) {
        JFrame frame = new JFrame("Clinic Dashboard");
        JButton viewOrders = new JButton("View Incoming Orders");
        JButton updateStatus = new JButton("Update Order Status");
        JButton logout = new JButton("Logout");

        viewOrders.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Feature: View and Accept Orders (To be implemented)");
        });

        updateStatus.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Feature: Update Order Status (To be implemented)");
        });

        logout.addActionListener(e -> {
            frame.dispose();
            new WelcomeScreen();
        });

        frame.setLayout(new java.awt.GridLayout(3, 1));
        frame.add(viewOrders);
        frame.add(updateStatus);
        frame.add(logout);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
