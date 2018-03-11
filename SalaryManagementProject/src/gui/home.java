package gui;


import database.DAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame{
    public home(){
                super("Salary Management System");
                ImageIcon img = new ImageIcon("C:\\Users\\Dilpreet Singh\\Desktop\\Salary-Management-System\\img\\logo.png");
                Image newImage = img.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH);
                setIconImage(newImage);

                JPanel panel = new JPanel();
                panel.setLayout(null);

                JLabel l1,l2;

                JButton b1 = new JButton("Generate Current Salary");
                JButton b2 = new JButton("View Yearly Record");

                b1.setBounds(250,300,300,40);
                b2.setBounds(250,400,300,40);
                b1.setFont(new Font("Serif", Font.BOLD, 20 ));
                b2.setFont(new Font("Serif", Font.BOLD, 20 ));

                b1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        DAO dao = new DAO();
                        dao.getEmployee();
                    }
                });
                b2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        ViewYearlyRecord rec = new ViewYearlyRecord();
                    }
                });

                ImageIcon imageIcon = new ImageIcon(img.getImage().getScaledInstance(50, 50,Image.SCALE_SMOOTH));

                l2=new JLabel("Salary Management System");
                l1=new JLabel(" Indian Institute of Information Technology, Kalyani",imageIcon,2);
                l1.setFont(new Font("Serif", Font.BOLD, 27));
                l2.setFont(new Font("Serif", Font.ITALIC, 25));
                l1.setBounds(60,50,700,50);
                l2.setBounds(250,100,350,50);


                panel.add(l1);
                panel.add(l2);

                panel.add(b1);
                panel.add(b2);

                add(panel);
                setSize(800,700);
                setLocationRelativeTo(null);
                setVisible(true);
    }
}
