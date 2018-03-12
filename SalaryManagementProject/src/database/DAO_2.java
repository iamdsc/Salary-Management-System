package database;

import gui.ViewYearlyRecord;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO_2 {

    static int f = 0;
    static int c= 0;
    public static Object data[][];


    public static void getEmployee()
    {
        ViewYearlyRecord vr = new ViewYearlyRecord();

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
                    public void actionPerformed(ActionEvent e) {
                        float sal = 0.0f;

                        if(((String)vr.cb1.getSelectedItem()).equalsIgnoreCase(name) && ((String)vr.cb3.getSelectedItem()).equalsIgnoreCase(years))
                        {
                            sal = (float) (basicsal + (basicsal * da)/100.00 + (basicsal * hra)/100.00);
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

}