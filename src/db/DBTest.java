package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DBTest
{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/aban", 
					"root", "1234");
			
			Statement stmt = conn.createStatement();
			
			// insert
//			String sId = JOptionPane.showInputDialog("아이디 입력: ");
//			String sName = JOptionPane.showInputDialog("이름 입력: ");
//			int sGrade = Integer.parseInt(JOptionPane.showInputDialog("학년 입력: "));
//			String sDept = JOptionPane.showInputDialog("학과 입력: ");
//			
//			
//			String insertSQL = "INSERT INTO aban.student (id, name, grade, dept) "
//					+ "VALUES('" +sId + "', '" + sName + "'," +  sGrade + ", '" + sDept + "')";
//			stmt.executeUpdate(insertSQL);
			
			// update
			String updateSQL = "UPDATE student SET "
					+ "grade=3 "
					+ "where id='1111111'";
			stmt.executeUpdate(updateSQL);
			
			// delete
			String deleteSQL = "DELETE FROM student where dept='컴퓨터정보'" ;
			stmt.executeUpdate(deleteSQL);
			
			
			// select 
			String selectSQL = "SELECT * FROM student";
			ResultSet rs = stmt.executeQuery(selectSQL);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString(2);
				int grade = rs.getInt("grade");
				String dept = rs.getString(4);
				
				System.out.println(id + " : " + name + " : " + grade + " : " + dept);
			}
			
			
			
			System.out.println("OK");
		} 
		catch (ClassNotFoundException e)
		{
			System.out.println("드라이버 로딩 오류!");
			e.printStackTrace();
		} catch (SQLException e)
		{
			System.out.println("DB 접속 오류 혹은 SQL 오류");
			e.printStackTrace();
		}

	}

}
