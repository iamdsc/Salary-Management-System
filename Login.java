import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class Login {

    public static void main(String[] a) {

        LoginFrame frame = new LoginFrame();
        ImageIcon img=new ImageIcon("iiit.png");
        frame.setIconImage(img.getImage());
        
        frame.setTitle("Salary Management System Login");

        frame.setVisible(true);

        frame.setBounds(10, 10, 370, 600);

        frame.setDefaultCloseOperation(LoginFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);



    }



}