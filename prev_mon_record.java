import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class prev_mon_record
{
    public prev_mon_record()
    {
        JFrame fr = new JFrame("PREVIOUS MONTH'S RECORD");
        ImageIcon img=new ImageIcon("iiit.png");
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(350,20,800,700);
        fr.setIconImage(img.getImage());
        Container cr=fr.getContentPane();
        cr.setLayout(null);
        cr.setBackground(Color.LIGHT_GRAY );
        
        Cursor cur=new Cursor(Cursor.HAND_CURSOR);
        
        JLabel mytext1=new JLabel("PREVIOUS MONTH'S RECORD",JLabel.CENTER);
	mytext1.setBounds(20,20,760,100);
	Font font1=new Font("Arial",Font.BOLD ,35);
	mytext1.setFont(font1);
	cr.add(mytext1);
	
	JLabel l1=new JLabel("USERNAME:");
	l1.setBounds(50,200,100,30);
	Font font2=new Font("Arial",Font.BOLD ,15);
	l1.setFont(font2);
	cr.add(l1);
	
	JTextField username=new JTextField(JLabel.CENTER);
	username.setBounds(150,200,120,30);
	Font font3=new Font("Arial",Font.PLAIN ,13);
	username.setFont(font2);
	cr.add(username);
	
	JButton btn=new JButton("Enter");
	btn.setBounds(350,300,80,25);
	btn.setFont(font2);
	btn.setCursor(cur);
	cr.add(btn);
	
	JLabel m=new JLabel("MONTH:");
    	m.setBounds(300,200,80,30);                	
    	m.setFont(new Font("Arial",Font.BOLD ,15));
    	cr.add(m); 
    	
    	String month[]={"Select","01","02","03","04","05","06","07","08","09","10","11","12"};
    	JComboBox cb=new JComboBox(month);
    	cb.setBounds(380,200,100,30);                	
    	cb.setFont(new Font("Arial",Font.BOLD ,13));
    	cr.add(cb);
    	
    	JLabel y=new JLabel("YEAR:");
    	y.setBounds(550,200,60,30);                	
    	y.setFont(new Font("Arial",Font.BOLD ,15));
    	cr.add(y);
    	
    	String year[]={"Select","2015","2016","2017","2018"};
    	JComboBox cb2=new JComboBox(year);
    	cb2.setBounds(610,200,100,30);                	
    	cb2.setFont(new Font("Arial",Font.BOLD ,13));
    	cr.add(cb2); 
	btn.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e)
        	{
        		
        	}
        });
    }
}