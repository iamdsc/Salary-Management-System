import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;



public class home extends JFrame{

    public home(){

                super("Salary Management System");

                ImageIcon img = new ImageIcon("C:\\Users\\Akars\\Desktop\\swing\\iiit.png");

                Image newImage = img.getImage().getScaledInstance(35,35,Image.SCALE_SMOOTH);

                setIconImage(newImage);



                JPanel panel = new JPanel();
                panel.setBackground(new Color(0, 0, 255));
                

                panel.setLayout(null);



                JLabel l1,l2;



                JButton b1 = new JButton("Generate Current Salary");
                b1.setForeground(new Color(0, 0, 0));
                b1.setBackground(new Color(240, 248, 255));
                b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                JButton b2 = new JButton("View Yearly Record");
                b2.setForeground(new Color(0, 0, 0));
                b2.setBackground(new Color(245, 255, 250));
                b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));



                b1.setBounds(250,349,267,40);

                b2.setBounds(250,444,267,40);

                b1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));

                b2.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 20));



                b1.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                        

                        GenerateSalary g=new GenerateSalary();

                    }

                });

                b2.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent e) {

                        ViewYearlyRecord rec = new ViewYearlyRecord();

                    }

                });



                



                l2=new JLabel("Salary Management System");
                l2.setBackground(new Color(255, 255, 255));
                l2.setForeground(new Color(255, 255, 255));

                l1=new JLabel(" Indian Institute of Information Technology, Kalyani");
                l1.setForeground(new Color(255, 255, 255));

                l1.setFont(new Font("Serif", Font.BOLD, 33));

                l2.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 27));

                l1.setBounds(24,37,750,62);

                l2.setBounds(236,244,294,62);





                panel.add(l1);

                panel.add(l2);



                panel.add(b1);

                panel.add(b2);



                getContentPane().add(panel);
                
                ImageIcon imageIcon = new ImageIcon(img.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH));
                
                JLabel label = new JLabel("");
                label.setLabelFor(label);
                label.setIcon(imageIcon);
                label.setBounds(335, 111, 100, 106);
                panel.add(label);
                
                setSize(800,700);

                setLocationRelativeTo(null);

                setVisible(true);

    }
}