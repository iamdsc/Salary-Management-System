import javax.swing.*;
import java.awt.*;

public class GenerateSalary extends JFrame{

    public GenerateSalary(){
        super("IIIT KALYANI");
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel l, l1, name, designation, basicsal, hra, da, total;
        JTextField t1, t2, t3, t4;
        JComboBox cb1, cb2;
        JButton btn1, btn2;

        l = new JLabel("Generate Salary");
        l.setFont(new Font("Serif", Font.ITALIC, 25));
        l.setBounds(300,20,250,50);
        panel.add(l);

        name = new JLabel("Name :");
        name.setFont(new Font("Serif", Font.BOLD, 20));
        name.setBounds(200,100,100,30);
        panel.add(name);

        //Temporary string array which will be replaced by database
        String employee_name[] = {"","Mr. Sambhunath Datta","Dr. Madhumita Sengupta","Dr. Imon Mukherjee"};
        cb1 = new JComboBox(employee_name);
        cb1.setBounds(300,100,250,30);
        cb1.setFont(new Font("Serif", Font.PLAIN, 18));
        panel.add(cb1);

        designation = new JLabel("Designation :");
        designation.setFont(new Font("Serif", Font.BOLD, 20));
        designation.setBounds(150,150,150,30);
        panel.add(designation);

        //Temporary string array which will be replaced by database
        String designate[] = {"","Registrar","Assistant Registrar","Assistant Professor"};
        cb2 = new JComboBox(designate);
        cb2.setBounds(300,150,250,30);
        cb2.setFont(new Font("Serif", Font.PLAIN, 18));
        panel.add(cb2);


        btn1 = new JButton("Generate");
        btn1.setFont(new Font("Serif", Font.BOLD, 20 ));
        btn1.setBounds(320, 210, 120, 30);
        panel.add(btn1);


        l1 = new JLabel("Salary Details");
        l1.setFont(new Font("Serif", Font.ITALIC, 25));
        l1.setBounds(300,260,250,50);
        panel.add(l1);

        basicsal = new JLabel("Basic Salary :");
        basicsal.setFont(new Font("Serif", Font.BOLD, 20));
        basicsal.setBounds(140,350,200,30);
        panel.add(basicsal);

        t1 = new JTextField("");
        t1.setBounds(350, 350, 120, 30);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setFont(new Font("Serif",Font.BOLD,15));
        panel.add(t1);

        hra = new JLabel("HRA :");
        hra.setFont(new Font("Serif", Font.BOLD, 20));
        hra.setBounds(200,400,100,30);
        panel.add(hra);

        t2 = new JTextField("");
        t2.setBounds(350, 400, 120, 30);
        t2.setHorizontalAlignment(JTextField.CENTER);
        t2.setFont(new Font("Serif",Font.BOLD,15));
        panel.add(t2);

        da = new JLabel("DA :");
        da.setFont(new Font("Serif", Font.BOLD, 20));
        da.setBounds(210,450,100,30);
        panel.add(da);

        t3 = new JTextField("");
        t3.setBounds(350, 450, 120, 30);
        t3.setHorizontalAlignment(JTextField.CENTER);
        t3.setFont(new Font("Serif",Font.BOLD,15));
        panel.add(t3);

        total = new JLabel("Total :");
        total.setFont(new Font("Serif", Font.BOLD, 20));
        total.setBounds(200,550,100,30);
        panel.add(total);

        t4 = new JTextField("");
        t4.setBounds(350, 550, 120, 30);
        t4.setHorizontalAlignment(JTextField.CENTER);
        t4.setFont(new Font("Serif",Font.BOLD,15));
        panel.add(t4);

        btn2 = new JButton("Print");
        btn2.setFont(new Font("Serif", Font.BOLD, 20 ));
        btn2.setBounds(600, 600, 80, 30);
        panel.add(btn2);

        add(panel);
        setSize(800,700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
