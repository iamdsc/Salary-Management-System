package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JFrame frame = new JFrame("Salary Management System Login");
                    ImageIcon img = new ImageIcon("img/logo.png");
                    Image newImage = img.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH);
                    frame.setIconImage(newImage);

                    JLabel image, userLabel, passwordLabel;
                    JButton loginButton, resetButton;
                    JCheckBox showPassword;

                    JPanel panel = new JPanel();
                    panel.setLayout(null);

                    image = new JLabel((new ImageIcon(img.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH))));

                    image.setBounds(280, 20, img.getIconWidth(), img.getIconHeight());
                    panel.add(image);

                    userLabel = new JLabel("Username : ");
                    userLabel.setBounds(215, 300, 150, 30);
                    userLabel.setFont(new Font("Serif", Font.BOLD, 20));
                    panel.add(userLabel);

                    JTextField userTextField = new JTextField();
                    userTextField.setBounds(350, 300, 150, 30);
                    userTextField.setFont(new Font("Arial", Font.PLAIN, 17));
                    userTextField.setHorizontalAlignment(JTextField.CENTER);
                    panel.add(userTextField);

                    passwordLabel = new JLabel("Password : ");
                    passwordLabel.setBounds(220, 350, 100, 30);
                    passwordLabel.setFont(new Font("Serif", Font.BOLD, 20));
                    panel.add(passwordLabel);

                    JPasswordField passwordField = new JPasswordField();
                    passwordField.setBounds(350, 350, 150, 30);
                    passwordField.setFont(new Font("Arial", Font.PLAIN, 17));
                    passwordField.setHorizontalAlignment(JPasswordField.CENTER);
                    panel.add(passwordField);

                    showPassword = new JCheckBox("Show Password");
                    showPassword.setBounds(350, 400, 200, 30);
                    showPassword.setFont(new Font("Serif", Font.PLAIN, 17));
                    panel.add(showPassword);

                    loginButton = new JButton("LOGIN");
                    loginButton.setBounds(350, 450, 100, 30);
                    panel.add(loginButton);

                    loginButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            String userText;
                            String pwdText;

                            userText = userTextField.getText();
                            pwdText = passwordField.getText();

                            if (userText.equalsIgnoreCase("iiitkalyani") && pwdText.equalsIgnoreCase("officestaff")) {
                                JOptionPane.showMessageDialog(panel, "Login Successful");
                                home h = new home();
                            } else {
                                JOptionPane.showMessageDialog(panel, "Invalid Username or Password");
                            }
                        }
                    });

                    resetButton = new JButton("RESET");
                    resetButton.setBounds(350, 450, 100, 30);
                    panel.add(resetButton);

                    resetButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            userTextField.setText("");
                            passwordField.setText("");
                        }
                    });

                    showPassword.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if (showPassword.isSelected()) {
                                passwordField.setEchoChar((char) 0);

                            } else {
                                passwordField.setEchoChar('*');
                            }
                        }
                    });
                    frame.add(panel);
                    frame.setSize(800, 700);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            });
        }
}
