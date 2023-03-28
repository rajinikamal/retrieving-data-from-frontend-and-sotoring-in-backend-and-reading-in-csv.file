package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Model
{
	private static String url = "jdbc:mysql://localhost:3306/java";
	private static String user="root";
	private static String pass="root";
	
	
	public static void insert(String pname,String pprice,String inum,String pcate,String pdes)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, pass);
			PreparedStatement ps=con.prepareStatement("insert into csv(pro_name_model_num,pro_price,item_num,pro_cate,pro_des) values (?,?,?,?,?);");
			
			ps.setString(1, pname);
			ps.setString(2, pprice);
			ps.setString(3, inum);
			ps.setString(4, pcate);
			ps.setString(5, pdes);
			ps.executeUpdate();
			
			ps.close();
			con.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Dao> select(int num)
	{
		ArrayList <Dao> al = new ArrayList<Dao>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, pass);
			PreparedStatement ps=con.prepareStatement("select * from csv limit ? ;");
			ps.setInt(1, num);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				String sl = rs.getString("sl_no");
				String nameAndmodel = rs.getString("pro_name_model_num");
				   String pprice = rs.getString("pro_price");
				     String item = rs.getString("item_num");
				    String category = rs.getString("pro_cate");
				    String description = rs.getString("pro_des");
				    Dao d = new Dao(sl,nameAndmodel,pprice,item,category,description);
				    al.add(d);
			}
			rs.close();
			ps.close();
			con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
		
	
		
		
	}


	
	
	
	

}
