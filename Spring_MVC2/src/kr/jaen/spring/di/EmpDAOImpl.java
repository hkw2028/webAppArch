package kr.jaen.spring.di;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.jaen.spring.di.DBUtil;
import kr.jaen.spring.di.EmpDAO;
import kr.jaen.spring.di.Employee;
@Repository("dao")
public class EmpDAOImpl implements EmpDAO {

	@Override
	public void save(Employee e) throws SQLException{
		System.out.println("save :"+e);
		Connection con=null;
		PreparedStatement ps=null;
		String sql="insert into Employee (snum, sname, salary) values(?,?,?)";
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement(sql);
			ps.setInt(1, e.getSnum());
			ps.setString(2, e.getSname());
			ps.setInt(3, e.getSalary());
			ps.executeUpdate();
		}finally{
			DBUtil.close(ps);
			DBUtil.close(con);
		}
		
	}
	/* (non-Javadoc)
	 * @see com.scsa.spring.di.EmpDAO#search()
	 */
	@Override
	public ArrayList<Employee> search() throws SQLException{
		ArrayList<Employee> list=new ArrayList<>();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="Select * from Employee";
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				Employee e=new Employee();
				e.setSnum(rs.getInt("snum"));
				e.setSname(rs.getString("sname"));
				e.setSalary(rs.getInt("salary"));
				list.add(e);
			}
		}finally{
			DBUtil.close(ps);
			DBUtil.close(con);
		}		
		return list;
	}
	/* (non-Javadoc)
	 * @see com.scsa.spring.di.EmpDAO#search(int)
	 */
	@Override
	public Employee search(int snum) throws SQLException{
		Employee e=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="Select * from Employee where snum=?";
		try{
			con=DBUtil.getConnection();
			ps=con.prepareStatement(sql);
			ps.setInt(1, snum);
			rs=ps.executeQuery();
			if(rs.next()){
				 e=new Employee();
				e.setSnum(rs.getInt("snum"));
				e.setSname(rs.getString("sname"));
				e.setSalary(rs.getInt("salary"));			
			}
		}finally{
			DBUtil.close(ps);
			DBUtil.close(con);
		}		
		return e;
	}
}
