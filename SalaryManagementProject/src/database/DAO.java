package database;

import java.awt.event.ActionEvent;

import java.sql.*;

import gui.GenerateSalary;

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
				String month = rs.getString("MONTH");
				//int mot = Integer.parseInt(month);
				int year = rs.getInt("YEAR");
				String yr = Integer.toString(year);
				
				gs.btn1.addActionListener(new java.awt.event.ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String yea = (String)gs.cb3.getSelectedItem();
						int ys = Integer.parseInt(yea);
						String mont = null;
						String s = (String)gs.cb4.getSelectedItem();
						
							if(s.equalsIgnoreCase("JANUARY"))
							{
									if(yea.equalsIgnoreCase("2015"))
									{
										gs.t1.setText("0");
										gs.t2.setText("0");
										gs.t3.setText("0");
										gs.t4.setText("0");
									}
									else
									{
										mont = "DECEMBER";
										ys = ys - 1;
										yea = Integer.toString(ys);
									}
							}
							if(s.equalsIgnoreCase("FEBRUARY"))
							{
								mont = "JANUARY";
							}
							if(s.equalsIgnoreCase("MARCH"))
									{
											mont = "FEBRUARY";
									}
							if(s.equalsIgnoreCase("APRIL"))
									{
											mont = "MARCH";
									}
							if(s.equalsIgnoreCase("MAY"))
									{
											mont = "APRIL";
									}
							if(s.equalsIgnoreCase("JUNE"))
									{
											mont = "MAY";
									}
							if(s.equalsIgnoreCase("JULY"))
									{
											mont = "JUNE";
									}
							if(s.equalsIgnoreCase("AUGUST"))
									{
											mont = "JULY";
									}
							if(s.equalsIgnoreCase("SEPTEMBER"))
									{
											mont = "AUGUST";
									}
							if(s.equalsIgnoreCase("OCTOBER"))
									{
											mont = "SEPTEMBER";
									}
							if(s.equalsIgnoreCase("NOVEMBER"))
									{
											mont = "OCTOBER";
									}
							if(s.equalsIgnoreCase("DECEMBER"))
									{
											mont = "NOVEMBER";
									}
						
						//int f= 0;
						//System.out.println(mont+" "+yea);
						if(((String)gs.cb1.getSelectedItem()).equalsIgnoreCase(name) && (month).equalsIgnoreCase(mont) && (yr).equalsIgnoreCase(yea))                       
						{
							gs.t1.setText(Float.toString(basicsal));
							gs.t2.setText(Float.toString(hra));
							gs.t3.setText(Float.toString(da));
							float sal = (float) (basicsal + (basicsal * da)/100.00 + (basicsal * hra)/100.00);
							gs.t4.setText(Float.toString(sal));
							//f =1;
						} 
					}
				});
				
			}
			gs.btn2.addActionListener(new java.awt.event.ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					float basal = Float.parseFloat(gs.t1.getText());
					float ha = Float.parseFloat(gs.t2.getText());
					float d = Float.parseFloat(gs.t3.getText());
					
					Connection con1 = DBConnection.getConnection();
					try {
						
						String insert = "INSERT INTO projectDatabase.projectDatabase VALUES(?,?,?,?,?,?,NULL)";

						PreparedStatement ps1 = con1.prepareStatement(insert);

						ps1.setString(1, (String)gs.cb1.getSelectedItem());
						ps1.setFloat(2, basal);
						ps1.setFloat(3, ha);
						ps1.setFloat(4, d);
						ps1.setString(5, (String)gs.cb4.getSelectedItem());
						ps1.setInt(6, Integer.parseInt((String) gs.cb3.getSelectedItem()));
					
						ps1.executeUpdate();

					} catch (Exception e1) {

						e1.printStackTrace();
					}
				}
			});
			

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.getEmployee();
	}
}
