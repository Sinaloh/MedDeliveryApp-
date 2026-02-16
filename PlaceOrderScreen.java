import javax.swing.*;

public class PlaceOrderScreen {
    public PlaceOrderScreen(String email) {
        JFrame frame = new JFrame("Place Order");
        JTextField medField = new JTextField();
        JTextField addressField = new JTextField();
        JButton submitBtn = new JButton("Submit Order");

        submitBtn.addActionListener(e -> {
            String med = medField.getText();
            String address = addressField.getText();
            DatabaseConnection.placeOrder(email, med, address);
            JOptionPane.showMessageDialog(frame, "Order Placed!");
            frame.dispose();
            new PatientDashboard(email);
        });

        frame.setLayout(new java.awt.GridLayout(3, 2));
        frame.add(new JLabel("Medication:"));
        frame.add(medField);
        frame.add(new JLabel("Delivery Address:"));
        frame.add(addressField);
        frame.add(new JLabel());
        frame.add(submitBtn);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
