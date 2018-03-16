package database;

import java.awt.event.ActionEvent;


import java.sql.*;
import java.util.Arrays;

import javax.swing.JButton;

import gui.ViewYearlyRecord;

public class DAO_2 {
		
	public static Object data[][];
	static int t = 0;
	static int count = 0;


	public static void getEmployee()
	{
		ViewYearlyRecord vr = new ViewYearlyRecord();
		
		Connection conn = DBConnection.getConnection();
		Connection conn1 = DBConnection.getConnection();
		try {

			String insert = "select * from projectDatabase.projectDatabase";
			String insert1 = "select COUNT(*) from projectDatabase.projectDatabase";

			PreparedStatement ps = conn.prepareStatement(insert);
			PreparedStatement ps1 = conn1.prepareStatement(insert1);

			ResultSet rs1 = ps.executeQuery();
			ResultSet rs2 = ps1.executeQuery();
            while (rs2.next()){
                count = rs2.getInt(1);
            }
			
			while(rs1.next())
			{
				String name = rs1.getString("NAME");
				float basicsal = rs1.getFloat("BASIC SALARY");
				float hra = rs1.getFloat("HRA");
				float da = rs1.getFloat("DA");
				int year = rs1.getInt("YEAR");
				String years = Integer.toString(year);
				String month = rs1.getString("MONTH");
				vr.btn1.addActionListener(new java.awt.event.ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						float sal = 0.0f;
						JButton b = (JButton)e.getSource();
						if(b.equals(vr.btn1))
							t++;
						
						//System.out.println(t);
						if(((String)vr.cb1.getSelectedItem()).equalsIgnoreCase(name) && ((String)vr.cb3.getSelectedItem()).equalsIgnoreCase(years))
						{
							//t = 1;
//							gs.t1.setText(Float.toString(basicsal));
//							gs.t2.setText(Float.toString(hra));
//							gs.t3.setText(Float.toString(da));
							sal = (float) (basicsal + (basicsal * da)/100.00 + (basicsal * hra)/100.00);
//							gs.t4.setText(Float.toString(sal));
							
							Object dat[] = {month, Float.toString(basicsal), Float.toString(hra), Float.toString(da), Float.toString(sal)};
							vr.model.addRow(dat);
						} 
						
						if(t == 11)
						{
							t = 0;
							    for (int i = vr.model.getRowCount() - 1; i > -1; i--) {
							    	vr.model.removeRow(i);
							}
						}
					}
			});
		}
			
	} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		DAO_2 dao2 = new DAO_2();
		dao2.getEmployee();
	}
}
