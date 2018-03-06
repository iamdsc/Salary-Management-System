import javax.swing.*;
import java.awt.*;

public class home{
    public static void main(String[] args){
        SwingUtilities.invokeLater( new Runnable(){
            public void run(){
                JFrame frame = new JFrame("IIIT KALYANI");
                JPanel panel = new JPanel();
                panel.setLayout(null);
                JLabel l1,l2;
                ImageIcon imageIcon = new ImageIcon("img/logo.png"); // load the image to a imageIcon
                Image image = imageIcon.getImage(); // transform it
                Image newimg = image.getScaledInstance(50, 50,Image.SCALE_SMOOTH); // scale it the smooth way
                imageIcon = new ImageIcon(newimg);
                l2=new JLabel("Salary Management System");
                l1=new JLabel(" Indian Institute of Information Technology, Kalyani",imageIcon,2);
                l1.setFont(new Font("Serif", Font.PLAIN, 25));
                l2.setFont(new Font("Serif", Font.PLAIN, 22));
                l1.setBounds(100,50,600,50);
                l2.setBounds(280,100,300,50);
                panel.add(l1);
                panel.add(l2);
                frame.add(panel);
                frame.setSize(800,700);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

