import javax.swing.*;

import java.awt.*;



public class GenerateSalary extends JFrame {



    JLabel l, l1, name, designation, month, year, basicsal, hra, da, total,sym1, sym2;

    public static JTextField t1, t2, t3, t4;

    public static JComboBox cb2, cb3;

    public JButton btn1, btn2, btn3;
    private JTextField textField;



    public GenerateSalary() {

        super("Generate Current Salary");

        ImageIcon img = new ImageIcon("img/logo.png");

        Image newImage = img.getImage().getScaledInstance(25,25,Image.SCALE_SMOOTH);

        setIconImage(newImage);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 139));

        panel.setLayout(null);



        l = new JLabel("Generate Salary");
        l.setForeground(new Color(255, 255, 255));

        l.setFont(new Font("Tw Cen MT", Font.BOLD, 30));

        l.setBounds(300, 20, 210, 50);

        panel.add(l);



        name = new JLabel("Name:");
        name.setForeground(new Color(255, 255, 255));

        name.setFont(new Font("Serif", Font.BOLD, 18));

        name.setBounds(10, 100, 50, 30);

        panel.add(name);



        //Temporary string array which will be replaced by database

        String employee_name[] = {"Select", "Sambhunath Datta", "Madhumita Sengupta", "Imon Mukherjee"};



        designation = new JLabel("Designation :");
        designation.setForeground(new Color(255, 255, 255));

        designation.setFont(new Font("Serif", Font.BOLD, 18));

        designation.setBounds(210, 100, 110, 30);

        panel.add(designation);



        //Temporary string array which will be replaced by database

        String designate[] = {"Select", "Registrar", "Assistant Registrar", "Assistant Professor"};

        cb2 = new JComboBox(designate);
        cb2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ((JLabel)cb2.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        cb2.setBounds(316, 101, 140, 30);

        cb2.setFont(new Font("Serif", Font.PLAIN, 15));

        panel.add(cb2);



        month = new JLabel("Month :");
        month.setForeground(new Color(255, 255, 255));

        month.setFont(new Font("Serif", Font.BOLD, 18));

        month.setBounds(475, 100, 70, 30);

        panel.add(month);



        SpinnerModel value = new SpinnerNumberModel(1, //initial value

                        1, //minimum value

                        12, //maximum value

                        1);



        year = new JLabel("Year :");
        year.setForeground(new Color(255, 255, 255));

        year.setFont(new Font("Serif", Font.BOLD, 18));

        year.setBounds(624, 100, 61, 30);

        panel.add(year);



        String years[] = {"Select", "2015", "2016", "2017", "2018"};

        cb3 = new JComboBox(years);
        cb3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        ((JLabel)cb3.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);

        cb3.setBounds(677, 101, 80, 30);

        cb3.setFont(new Font("Serif", Font.PLAIN, 15));

        panel.add(cb3);





        btn1 = new JButton("Generate");
        btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        btn1.setFont(new Font("Serif", Font.BOLD, 15));

        btn1.setBounds(353, 159, 100, 30);

        panel.add(btn1);





        l1 = new JLabel("Salary Details");
        l1.setForeground(new Color(255, 255, 255));

        l1.setFont(new Font("Tw Cen MT", Font.BOLD, 30));

        l1.setBounds(316, 210, 194, 50);

        panel.add(l1);



        basicsal = new JLabel("Basic Salary :");
        basicsal.setForeground(new Color(255, 255, 255));

        basicsal.setFont(new Font("Serif", Font.BOLD, 20));

        basicsal.setBounds(140, 300, 133, 30);

        panel.add(basicsal);





        t1 = new JTextField("");

        t1.setBounds(350, 300, 120, 30);

        t1.setHorizontalAlignment(JTextField.CENTER);

        t1.setFont(new Font("Serif", Font.BOLD, 15));

        panel.add(t1);



        hra = new JLabel("HRA :");
        hra.setForeground(new Color(255, 255, 255));

        hra.setFont(new Font("Serif", Font.BOLD, 20));

        hra.setBounds(200, 350, 100, 30);

        panel.add(hra);



        t2 = new JTextField("");

        t2.setBounds(350, 350, 120, 30);

        t2.setHorizontalAlignment(JTextField.CENTER);

        t2.setFont(new Font("Serif", Font.BOLD, 15));

        panel.add(t2);



        sym1 = new JLabel("%");
        sym1.setForeground(new Color(255, 255, 255));

        sym1.setBounds(475,350,50,30);

        sym1.setFont(new Font("Serif",Font.BOLD,15));

        panel.add(sym1);



        da = new JLabel("DA :");
        da.setForeground(new Color(255, 255, 255));

        da.setFont(new Font("Serif", Font.BOLD, 20));

        da.setBounds(210, 400, 100, 30);

        panel.add(da);



        t3 = new JTextField("");

        t3.setBounds(350, 400, 120, 30);

        t3.setHorizontalAlignment(JTextField.CENTER);

        t3.setFont(new Font("Serif", Font.BOLD, 15));

        panel.add(t3);



        sym2 = new JLabel("%");
        sym2.setForeground(new Color(255, 255, 255));

        sym2.setBounds(475,400,50,30);

        sym2.setFont(new Font("Serif",Font.BOLD,15));

        panel.add(sym2);



        btn3 = new JButton("Calculate");
        btn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        btn3.setFont(new Font("Serif", Font.BOLD, 15));

        btn3.setBounds(356, 468, 100, 30);

        panel.add(btn3);



        total = new JLabel("Total :");
        total.setForeground(new Color(255, 255, 255));

        total.setFont(new Font("Serif", Font.BOLD, 20));

        total.setBounds(200, 530, 88, 30);

        panel.add(total);



        t4 = new JTextField("");

        t4.setBounds(353, 532, 120, 30);

        t4.setHorizontalAlignment(JTextField.CENTER);

        t4.setFont(new Font("Serif", Font.BOLD, 15));

        panel.add(t4);



        btn2 = new JButton("Save");
        btn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        btn2.setFont(new Font("Serif", Font.BOLD, 15));

        btn2.setBounds(650, 600, 80, 30);

        panel.add(btn2);



        getContentPane().add(panel);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        comboBox.setFont(new Font("Serif", Font.PLAIN, 15));
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        comboBox.setBounds(544, 101, 70, 30);
        panel.add(comboBox);
        
        textField = new JTextField();
        textField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        textField.setBounds(65, 100, 133, 30);
        panel.add(textField);
        textField.setColumns(10);
        
        JLabel label = new JLabel("\u20B9");
        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label.setForeground(new Color(255, 255, 255));
        label.setBounds(479, 300, 31, 30);
        panel.add(label);
        
        JLabel label_1 = new JLabel("\u20B9");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_1.setBounds(479, 530, 31, 30);
        panel.add(label_1);

        setSize(800, 700);

        setLocationRelativeTo(null);

        setVisible(true);

    }
}
