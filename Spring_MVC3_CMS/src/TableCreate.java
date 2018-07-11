
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableCreate {
  // Table ����
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Driver ����( �ڵ����� ��ü�� �����ǰ�, DriverManager���� ���)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. Connection ����
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE",
				"lge","lge");
		//3. ����, �������ఴü ����
		//String q2="drop"
		String q="create table Customer2 ( num int  primary key,"
				+" name varchar2(30), address varchar2(100), img varchar2(30))";
		Statement st=con.createStatement();
		//4. ���� ����
		boolean rs=st.execute(q);//all-return:true-ResultSet�� ����/false- ResultSet�� �ƴϸ�
		//ResultSet rs=st.executeQuery(q);//Select
		//int rs=st.executeUpdate(q);//insert,update,delete
		//5. ���ó��
		System.out.println("Table 생성 성공~~");
		//6. �ڿ��ݳ�
		st.close();
		con.close();

	}

}
