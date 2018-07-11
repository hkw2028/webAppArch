package kr.jaen.spring.di;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements ICustomerDao {
	
	public void add(Customer c) {
		Connection con = null;
		PreparedStatement ps = null;
		String q = "Insert into customer2(num, name, address, img) values(?,?,?,?)";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(q);

			ps.setInt(1, c.getNum());
			ps.setString(2, c.getName());
			ps.setString(3, c.getAddress());
			ps.setString(4, c.getImg());

			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("데이터 저장 실패");
			e.printStackTrace();
		} finally {
			DBUtil.close(ps);
			DBUtil.close(con);
		}
	}

	public Customer search(int num) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Customer c = null;
		String q = "Select num, name, address  from customer2  where num=?";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(q);

			ps.setInt(1, num);
			rs = ps.executeQuery();
			if (rs.next()) {
				c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			System.out.println("검색 실패");
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(ps);
			DBUtil.close(con);
		}
		return c;
	}

	public List<Customer> search() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<Customer> list = new ArrayList<>();
		String q = "Select num, name, address from customer2";
		try {
			con = DBUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(q);
			while (rs.next()) {
				Customer c = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
				list.add(c);
			} // end while
		} catch (SQLException e) {
			System.out.println(" 전체 검색 실패");
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(st);
			DBUtil.close(con);

		}

		return list;
	}

	public void update(int num, String address) {
		Connection con = null;
		PreparedStatement ps = null;
		String q = "Update customer2 set address=? where num=?";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(q);

			ps.setString(1, address);
			ps.setInt(2, num);

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(ps);
			DBUtil.close(con);
		}
	}

	public void delete(int num) {
		Connection con = null;
		PreparedStatement ps = null;
		String q = "Delete from customer2 where num=?";
		try {
			con = DBUtil.getConnection();
			ps = con.prepareStatement(q);
			ps.setInt(1, num);

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(ps);
			DBUtil.close(con);
		}
	}
}
