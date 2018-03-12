package gui;

import javax.swing.*;
import java.awt.*;

public class GenerateSalary extends JFrame {

    JLabel l, l1, name, designation, month, year, basicsal, hra, da, total,sym1, sym2;
    public static JTextField t1, t2, t3, t4;
    public static JComboBox cb1, cb2, cb3;
    public JButton btn1, btn2, btn3;
    public static JSpinner months;

    public GenerateSalary() {
        super("Generate Current Salary");
        ImageIcon img = new ImageIcon("img/logo.png");
        Image newImage = img.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH);
        setIconImage(newImage);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        l = new JLabel("Generate Salary");
        l.setFont(new Font("Serif", Font.ITALIC, 25));
        l.setBounds(300, 20, 250, 50);
        panel.add(l);

        name = new JLabel("Name:");
        name.setFont(new Font("Serif", Font.BOLD, 18));
        name.setBounds(5, 100, 50, 30);
        panel.add(name);

        //Temporary string array which will be replaced by database
        String employee_name[] = {"", "Sambhunath Datta", "Madhumita Sengupta", "Imon Mukherjee"};
        cb1 = new JComboBox(employee_name);
        ((JLabel)cb1.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        cb1.setBounds(65, 100, 150, 30);
        cb1.setFont(new Font("Serif", Font.PLAIN, 15));
        panel.add(cb1);

        designation = new JLabel("Designation :");
        designation.setFont(new Font("Serif", Font.BOLD, 18));
        designation.setBounds(235, 100, 110, 30);
        panel.add(designation);

        //Temporary string array which will be replaced by database
        String designate[] = {"", "Registrar", "Assistant Registrar", "Assistant Professor"};
        cb2 = new JComboBox(designate);
        ((JLabel)cb2.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        cb2.setBounds(340, 100, 140, 30);
        cb2.setFont(new Font("Serif", Font.PLAIN, 15));
        panel.add(cb2);

        month = new JLabel("Month :");
        month.setFont(new Font("Serif", Font.BOLD, 18));
        month.setBounds(500, 100, 100, 30);
        panel.add(month);

        SpinnerModel value = new SpinnerNumberModel(1, //initial value
                        1, //minimum value
                        12, //maximum value
                        1); //step
        months = new JSpinner(value);
        months.setBounds(570,100,50,30);
        panel.add(months);

        year = new JLabel("Year :");
        year.setFont(new Font("Serif", Font.BOLD, 18));
        year.setBounds(640, 100, 100, 30);
        panel.add(year);

        String years[] = {"", "2015", "2016", "2017", "2018"};
        cb3 = new JComboBox(years);
        ((JLabel)cb3.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        cb3.setBounds(700, 100, 80, 30);
        cb3.setFont(new Font("Serif", Font.PLAIN, 15));
        panel.add(cb3);


        btn1 = new JButton("Generate");
        btn1.setFont(new Font("Serif", Font.BOLD, 15));
        btn1.setBounds(320, 160, 100, 30);
        panel.add(btn1);


        l1 = new JLabel("Salary Details");
        l1.setFont(new Font("Serif", Font.ITALIC, 25));
        l1.setBounds(300, 210, 250, 50);
        panel.add(l1);

        basicsal = new JLabel("Basic Salary :                ₹");
        basicsal.setFont(new Font("Serif", Font.BOLD, 20));
        basicsal.setBounds(140, 300, 210, 30);
        panel.add(basicsal);


        t1 = new JTextField("");
        t1.setBounds(350, 300, 120, 30);
        t1.setHorizontalAlignment(JTextField.CENTER);
        t1.setFont(new Font("Serif", Font.BOLD, 15));
        panel.add(t1);

        hra = new JLabel("HRA :");
        hra.setFont(new Font("Serif", Font.BOLD, 20));
        hra.setBounds(200, 350, 100, 30);
        panel.add(hra);

        t2 = new JTextField("");
        t2.setBounds(350, 350, 120, 30);
        t2.setHorizontalAlignment(JTextField.CENTER);
        t2.setFont(new Font("Serif", Font.BOLD, 15));
        panel.add(t2);

        sym1 = new JLabel("%");
        sym1.setBounds(475,350,50,30);
        sym1.setFont(new Font("Serif",Font.BOLD,15));
        panel.add(sym1);

        da = new JLabel("DA :");
        da.setFont(new Font("Serif", Font.BOLD, 20));
        da.setBounds(210, 400, 100, 30);
        panel.add(da);

        t3 = new JTextField("");
        t3.setBounds(350, 400, 120, 30);
        t3.setHorizontalAlignment(JTextField.CENTER);
        t3.setFont(new Font("Serif", Font.BOLD, 15));
        panel.add(t3);

        sym2 = new JLabel("%");
        sym2.setBounds(475,400,50,30);
        sym2.setFont(new Font("Serif",Font.BOLD,15));
        panel.add(sym2);

        btn3 = new JButton("Calculate");
        btn3.setFont(new Font("Serif", Font.BOLD, 15));
        btn3.setBounds(320, 470, 100, 30);
        panel.add(btn3);

        total = new JLabel("Total :                ₹");
        total.setFont(new Font("Serif", Font.BOLD, 20));
        total.setBounds(200, 530, 150, 30);
        panel.add(total);

        t4 = new JTextField("");
        t4.setBounds(350, 530, 120, 30);
        t4.setHorizontalAlignment(JTextField.CENTER);
        t4.setFont(new Font("Serif", Font.BOLD, 15));
        panel.add(t4);

        btn2 = new JButton("Save");
        btn2.setFont(new Font("Serif", Font.BOLD, 15));
        btn2.setBounds(650, 600, 80, 30);
        panel.add(btn2);

        add(panel);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}
