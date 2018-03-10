import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class salary_home
{
    static Container c;
    public static void main(String args[])
    {
        JFrame f= new JFrame("WELCOME TO SALARY MANAGEMENT SYSTEM");
        ImageIcon img=new ImageIcon("iiit.png");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(0,0,1700,768);
        f.setIconImage(img.getImage());
        c=f.getContentPane();
        c.setLayout(null);
        
        c.setBackground(Color.LIGHT_GRAY );
        
        JLabel mytext1=new JLabel("INDIAN INSTITUTE OF INFORMATION TECHNOLOGY",JLabel.CENTER);
	mytext1.setBounds(100,20,1200,100);
	Font fonta=new Font("Arial",Font.BOLD ,35);
	mytext1.setFont(fonta);
	
	JLabel mytext2=new JLabel("KALYANI, NADIA, WEST BENGAL",JLabel.CENTER);
	mytext2.setBounds(100,70,1200,100);
	Font fontb=new Font("Comic_Sans_MS",Font.BOLD ,30);
	mytext2.setFont(fontb);
	
	c.add(mytext1);
	c.add(mytext2);
	
	JLabel image=new JLabel(img);
	image.setBounds(100,50,img.getIconWidth(),img.getIconHeight());
	c.add(image);
	
	Font font=new Font("Arial",Font.BOLD,16);
	Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		
	JButton generate_salary=new JButton("GENERATE SALARY");
	generate_salary.setBounds(300,400,300,50);
	generate_salary.setFont(font);
	generate_salary.setCursor(cur);
	c.add(generate_salary);
	
	JButton view_record=new JButton("CHECK PREVIOUS RECORD");
	view_record.setBounds(800,400,300,50);
	view_record.setFont(font);
	view_record.setCursor(cur);
	c.add(view_record);
	
	view_record.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		prev_mon_record p=new prev_mon_record();
        	}
        });
        
        generate_salary.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		GenerateSalary g= new GenerateSalary();
        	}
        });
    }
}