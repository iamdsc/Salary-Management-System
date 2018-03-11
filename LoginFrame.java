import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.*;



public class LoginFrame extends JFrame implements ActionListener {



    Container container = getContentPane();

    JLabel userLabel = new JLabel("USERNAME");

    JLabel passwordLabel = new JLabel("PASSWORD");

    JTextField userTextField = new JTextField();

    JPasswordField passwordField = new JPasswordField();

    JButton loginButton = new JButton("LOGIN");

    JButton resetButton = new JButton("RESET");

    JCheckBox showPassword = new JCheckBox("Show Password");

    ImageIcon img=new ImageIcon("iiit.png");

    JLabel image=new JLabel(img);
	

    LoginFrame() {

        setLayoutManager();

        setLocationAndSize();

        addComponentsToContainer();

        addActionEvent();



    }



    public void setLayoutManager() {

        container.setLayout(null);

    }



    public void setLocationAndSize() {
        Cursor cur=new Cursor(Cursor.HAND_CURSOR);

        image.setBounds(130,20,img.getIconWidth(),img.getIconHeight());
        
        userLabel.setBounds(50, 250, 100, 30);

        passwordLabel.setBounds(50, 320, 100, 30);

        userTextField.setBounds(150, 250, 150, 30);

        passwordField.setBounds(150, 320, 150, 30);

        showPassword.setBounds(150, 350, 150, 30);

        loginButton.setBounds(50, 400, 100, 30);
        loginButton.setCursor(cur);
        
        (this).getRootPane().setDefaultButton(loginButton);
        
        resetButton.setBounds(200, 400, 100, 30);
        resetButton.setCursor(cur);

        
	



    }



    public void addComponentsToContainer() {

        container.add(userLabel);

        container.add(passwordLabel);

        container.add(userTextField);

        container.add(passwordField);

        container.add(showPassword);

        container.add(loginButton);

        container.add(resetButton);
        
        container.add(image);

    }



    public void addActionEvent() {


        loginButton.addActionListener(this);

        resetButton.addActionListener(this);

        showPassword.addActionListener(this);

    }





    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {

            String userText;

            String pwdText;

            userText = userTextField.getText();

            pwdText = passwordField.getText();

            if (userText.equalsIgnoreCase("virat") && pwdText.equalsIgnoreCase("vishnu")) {

                JOptionPane.showMessageDialog(this, "Login Successful");
                salary_home sh=new salary_home();

            } else {

                JOptionPane.showMessageDialog(this, "Invalid Username or Password");

            }



        }

        if (e.getSource() == resetButton) {

            userTextField.setText("");

            passwordField.setText("");

        }

        if (e.getSource() == showPassword) {

            if (showPassword.isSelected()) {

                passwordField.setEchoChar((char) 0);

            } else {

                passwordField.setEchoChar('*');

            }





        }

    }



}

