package qlSach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class updateNhaXuatBan {
	public static void deleteNXB(String maXuatBan) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql_deleteNXB = "delete from nhaXuatBan where maXuatBan = ?";
		String sql_delectSach ="delete from sach where maXuatBan = ?";
		try {
			//1 xoa sach có mã là maXuatBan 
			PreparedStatement ptmt_deleteSach = conn.prepareStatement(sql_delectSach);
			ptmt_deleteSach.setString(1, maXuatBan);
			int deleteSach = ptmt_deleteSach.executeUpdate();
			System.out.println(deleteSach);
			
			PreparedStatement ptmt_deleteNXB = conn.prepareStatement(sql_deleteNXB);
			ptmt_deleteNXB.setString(1, maXuatBan);
			int deleteNXB = ptmt_deleteNXB.executeUpdate();
			System.out.println(deleteNXB);
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertNXB(nhaXuatBan n) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql = "insert into nhaXuatBan values(?,?)";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, n.getMaXuatBan());
			ptmt.setString(2, n.getTenXuatBan());
			
			int rs = ptmt.executeUpdate();
			System.out.println("inset thanh cong");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updateNXB(nhaXuatBan n) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql = "update nhaXuatBan set tenXuatBan = ? where maXuatBan = ?";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, n.getTenXuatBan());
			ptmt.setString(2, n.getMaXuatBan());
			
			int rs = ptmt.executeUpdate();
			System.out.println("update thanh cong");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void loadDataNXB(ArrayList<nhaXuatBan> nhaXuatBanList) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql = "select * from nhaXuatBan";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery(sql);
			while(rs.next()) {
				String maXuatBan = rs.getString("maXuatBan");
				String tenXuatBan = rs.getString("tenXuatBan");
				System.out.println(maXuatBan + " "+tenXuatBan);
				nhaXuatBan n = new nhaXuatBan(maXuatBan,tenXuatBan);
				nhaXuatBanList.add(n);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		nhaXuatBan b = new nhaXuatBan("N019","Nha Van Hoa");
		updateNXB(b);
	}
}
