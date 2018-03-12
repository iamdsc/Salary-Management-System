package database;

import java.awt.event.ActionEvent;

import java.sql.*;
import java.util.Arrays;

import gui.ViewYearlyRecords;

public class DAO_2 {
		
	static int f = 0;
	static int c= 0;
	public static Object data[][];


	public static void getEmployee()
	{
		ViewYearlyRecords vr = new ViewYearlyRecords();
		
		Connection conn = DBConnection.getConnection();
		try {

			String insert = "select * from projectDatabase.projectDatabase";

			PreparedStatement ps = conn.prepareStatement(insert);

			ResultSet rs1 = ps.executeQuery();
			
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

						if(((String)vr.cb1.getSelectedItem()).equalsIgnoreCase(name) && ((String)vr.cb3.getSelectedItem()).equalsIgnoreCase(years))
						{
//							gs.t1.setText(Float.toString(basicsal));
//							gs.t2.setText(Float.toString(hra));
//							gs.t3.setText(Float.toString(da));
							sal = (float) (basicsal + (basicsal * da)/100.00 + (basicsal * hra)/100.00);
//							gs.t4.setText(Float.toString(sal));
							
							Object dat[] = {month, Float.toString(basicsal), Float.toString(hra), Float.toString(da), Float.toString(sal)};
							vr.model.addRow(dat);
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
