
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate {
  // Table 생성
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Driver 생성( 자동으로 객체가 생성되고, DriverManager에게 등록)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. Connection 생성
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE",
				"lge","lge");
		//3. 쿼리, 쿼리수행객체 생성
		//String q2="drop"
		String q="create table Employee ( snum int  primary key,"
				+" sname varchar2(30), salary int, img varchar2(30))";
		Statement st=con.createStatement();
		//4. 쿼리 수행
		boolean rs=st.execute(q);//all-return:true-ResultSet이 오면/false- ResultSet이 아니면
		//ResultSet rs=st.executeQuery(q);//Select
		//int rs=st.executeUpdate(q);//insert,update,delete
		//5. 결과처리
		System.out.println("Table 생성 작업 완료~~");
		//6. 자원반납
		st.close();
		con.close();

	}

}
