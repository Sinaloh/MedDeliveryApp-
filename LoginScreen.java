import javax.swing.*;

public class LoginScreen {
    public LoginScreen() {
        JFrame frame = new JFrame("Login");
        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JComboBox<String> roleBox = new JComboBox<>(new String[]{"Patient", "Clinic", "Delivery"});
        JButton loginBtn = new JButton("Login");

        loginBtn.addActionListener(e -> {
            String email = emailField.getText();
            String password = new String(passField.getPassword());
            String role = (String) roleBox.getSelectedItem();

            if (DatabaseConnection.loginUser(email, password, role)) {
                frame.dispose();
                switch (role) {
                    case "Patient" -> new PatientDashboard(email);
                    case "Clinic" -> new ClinicDashboard(email);
                    case "Delivery" -> new DeliveryDashboard(email);
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials");
            }
        });

        frame.setLayout(new java.awt.GridLayout(5, 1));
        frame.add(new JLabel("Email:"));
        frame.add(emailField);
        frame.add(new JLabel("Password:"));
        frame.add(passField);
        frame.add(roleBox);
        frame.add(loginBtn);
        frame.setSize(400, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
