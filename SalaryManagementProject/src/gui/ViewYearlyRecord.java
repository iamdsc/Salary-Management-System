package gui;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewYearlyRecord extends JFrame{

    public static JComboBox cb1, cb2, cb3;
    public static JButton btn1;
    JLabel l,name, designation, year;

    public ViewYearlyRecord(){
        super("View Yearly Record");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        Cursor cur=new Cursor(Cursor.HAND_CURSOR);

        l = new JLabel("View Record");
        l.setFont(new Font("Serif", Font.ITALIC, 25));
        l.setBounds(320, 20, 250, 50);
        panel.add(l);

        name = new JLabel("Name :");
        name.setFont(new Font("Serif", Font.BOLD, 20));
        name.setBounds(200, 100, 100, 30);
        panel.add(name);

        //Temporary string array which will be replaced by database
        String employee_name[] = {"", "Sambhunath Datta", "Madhumita Sengupta", "Imon Mukherjee"};
        cb1 = new JComboBox(employee_name);
        ((JLabel)cb1.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        cb1.setBounds(300, 100, 200, 30);
        cb1.setFont(new Font("Serif", Font.PLAIN, 18));
        panel.add(cb1);

        designation = new JLabel("Designation :");
        designation.setFont(new Font("Serif", Font.BOLD, 20));
        designation.setBounds(150, 150, 150, 30);
        panel.add(designation);

        //Temporary string array which will be replaced by database
        String designate[] = {"", "Registrar", "Assistant Registrar", "Assistant Professor"};
        cb2 = new JComboBox(designate);
        ((JLabel)cb2.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        cb2.setBounds(300, 150, 200, 30);
        cb2.setFont(new Font("Serif", Font.PLAIN, 18));
        panel.add(cb2);

        year = new JLabel("Year :");
        year.setFont(new Font("Serif", Font.BOLD, 20));
        year.setBounds(210, 200, 150, 30);
        panel.add(year);

        String years[]={"","2015","2016","2017","2018"};
        cb3 = new JComboBox(years);
        ((JLabel)cb3.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        cb3.setBounds(350, 200, 100, 30);
        cb3.setFont(new Font("Serif", Font.PLAIN, 18));
        panel.add(cb3);


        btn1 = new JButton("View");
        btn1.setFont(new Font("Serif", Font.BOLD, 20));
        btn1.setBounds(350, 260, 100, 30);
        panel.add(btn1);

        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {

            }
        });

        Object columns[] = {"MONTH", "BASIC SALARY", "HRA", "DA","TOTAL"};
        Object data[][] = {{"January"," "," "," "," "},{"February"," "," "," "," "},{"March"," "," "," "," "},
                {"April"," "," "," "," "},{"May"," "," "," "," "},{"June"," "," "," "," "},
                {"July"," "," "," "," "},{"August"," "," "," "," "},{"September"," "," "," "," "},
                {"October"," "," "," "," "},{"November"," "," "," "," "},{"December"," "," "," "," "}};
        JTable jt = new JTable(data, columns);
        jt.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        for(int x=0;x<5;x++){
            jt.getColumnModel().getColumn(x).setCellRenderer( centerRenderer );
        }
        jt.setRowHeight(25);
        JScrollPane scrollPane = new JScrollPane(jt);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(0, 100, 10, 100));

        add(panel);
        add(scrollPane);
        setLayout(new GridLayout(2,1));
        setSize(800,700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
