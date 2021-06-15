package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBClass {
	private String url = "jdbc:oracle:thin:@210.108.48.214:1521:xe";
	private String id = "jsp";
	private String pwd = "1234";
	public DBClass() {
		try {
			//오라클 관련된 기능을 사용하기 위해서 제일 먼저 처리해 줘야한다
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void getMember() {
		String sql = "select * from newst";
		try {
			// DB와 연결시켜주며 연결된 객체를 얻어온다.
			Connection con = DriverManager.getConnection(url,id,pwd);
			//연결된 객체를 이용해서 쿼리문을 전송할 수 있는 전송 객체를 얻어온다
			PreparedStatement ps = con.prepareStatement(sql);
			//executeQuery : 데이터를 수신할때 사용 (select)
			ResultSet rs = ps.executeQuery();
			//데이터 수신이 필요 없을 경우 사용(select 제외한 모든것)
			//ps.executeUpdate();
			System.out.println("아이디\t이름\t나이");
			System.out.println("-------------------------------");
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("age"));
				System.out.println("======================");
			}
			/*
			System.out.println(rs.next());
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age"));
			
			System.out.println(rs.next());
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age"));
			
			System.out.println(rs.next());
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getInt("age"));
			
			System.out.println(rs.next());
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saveMember(Member m) {
		//String sql = "insert into newst values(?,?,?)";
		String sql = "insert into newst(id, name, age) values(?,?,?)";
		try {
			Connection con = DriverManager.getConnection(url,id,pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, m.getId());
			ps.setString(2, m.getName());
			ps.setInt(3, m.getAge());
			ps.executeQuery();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int modifyMember(Member m) {
		String sql = "update newst set name=?, age=? where id=?";
		//String sql = "update newst set name='"+m.getName()+"', age="+m.getAge()+
		//										" where id='"+m.getId()+"'";
		int result = 0;
		try {
			Connection con = DriverManager.getConnection(url,id,pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, m.getName());	
			ps.setInt(2, m.getAge());	
			ps.setString(3, m.getId());	
			result = ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int deleteMember(String id) {
	//	String sql = "delete from newst where id=?";
		String sql = "delete from newst where id='"+id+"'";
		int result = 0;
		try {
			Connection con = DriverManager.getConnection(url,this.id,pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			//ps.setString(1, id);
			result = ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}


