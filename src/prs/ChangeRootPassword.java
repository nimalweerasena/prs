/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prs;

import java.sql.*;
class ChangeRootPassword
{
	public static void main(String[] args) 
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "a", "a");
			String sql = "SET PASSWORD FOR 'a'@'localhost' = PASSWORD('weeranimal')";
			Statement stmt = conn.createStatement();
			stmt.executeQuery(sql);
			stmt.close();
			conn.close();
		//	System.out.println("Password is changed successfully!");
			}
		catch(Exception ex){
			ex.printStackTrace();
			}
	}
}