package database;

import java.awt.event.ActionEvent;
import java.sql.*;

import guiPages.GenerateSalary;

public class DAO {
		
	public static void getEmployee()
	{
		GenerateSalary gs = new GenerateSalary();
		Connection conn = DBConnection.getConnection();
		try {

			String insert = "select * from projectDatabase.projectDatabase";

			PreparedStatement ps = conn.prepareStatement(insert);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				String name = rs.getString("NAME");
				float basicsal = rs.getFloat("BASIC SALARY");
				float hra = rs.getFloat("HRA");
				float da = rs.getFloat("DA");
				gs.btn1.addActionListener(new java.awt.event.ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						float sal = 0.0f;

						if(((String)gs.cb1.getSelectedItem()).equalsIgnoreCase(name))
						{
							gs.t1.setText(Float.toString(basicsal));
							gs.t2.setText(Float.toString(hra));
							gs.t3.setText(Float.toString(da));
							sal = (float) (basicsal + (basicsal * da)/100.00 + (basicsal * hra)/100.00);
							gs.t4.setText(Float.toString(sal));
						} 
					}
				});
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.getEmployee();
	}
}
