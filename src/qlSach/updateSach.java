package qlSach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Result;

public class updateSach {
	public static void deleteSach(String maSach) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql = "delete from sach where maSach = ?";
		String sql_selectSach = "select * from sach where maSach =?";
		
		
		try {
			PreparedStatement ptmt_selectNXB = conn.prepareCall(sql_selectSach);
			ptmt_selectNXB.setString(1, maSach);
			ResultSet maSachList = ptmt_selectNXB.executeQuery();
			String maXuatBan="";
			while(maSachList.next()) {
				maXuatBan = maSachList.getString("maXuatBan");
			}
			
			System.out.println(maXuatBan);
			
			String sql_selectMaXuatBan_Sach = "select * from sach where maXuatBan = ?";
			PreparedStatement ptmt_selectMaXuatBan_Sach = conn.prepareStatement(sql_selectMaXuatBan_Sach);
			ptmt_selectMaXuatBan_Sach.setString(1, maXuatBan);
			
			ResultSet listMaXuatBan = ptmt_selectMaXuatBan_Sach.executeQuery();
			int countMaXuatBan = 0;
			
			while(listMaXuatBan.next()) {
				countMaXuatBan++;
				System.out.println(countMaXuatBan);
			}
			if(countMaXuatBan==1) {
				updateNhaXuatBan.deleteNXB(maXuatBan);
			}
					
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, maSach);
			int rs = ptmt.executeUpdate();
			System.out.println(rs);
			System.out.println("Xoa thanh cong");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertSach(sach s) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql1 = "insert into sach values(?,?,?,?,?,?,?)";
		String sql2 = "select * from nhaXuatBan where maXuatBan = ?";
		try {
			PreparedStatement ptmt2 = conn.prepareStatement(sql2);
			System.out.println(s.getMaXuatBan());
			ptmt2.setString(1, s.getMaXuatBan());
			ResultSet resultList =ptmt2.executeQuery();
			int i=0;
			//0 khong ton tai
			//1 ton tai
			while(resultList.next()) {
				i=1;
			}
			System.out.println(i);
			if(i == 0) { //Khong ton tai 
				String sql3 = "insert into nhaXuatBan values(?,?)";
				PreparedStatement ptmt3 = conn.prepareStatement(sql3);
				ptmt3.setString(1,s.getMaXuatBan());
				ptmt3.setString(2,"Nhà xuất bản");
				
				int insertNXB = ptmt3.executeUpdate();
				System.out.println(insertNXB);
				
				if(insertNXB == 1) {
					System.out.println("them thanh cong nha xuat ban");					
				}
			}//da ton tai nha xuat ban
			
			
			PreparedStatement ptmt = conn.prepareStatement(sql1);
			ptmt.setString(1, s.maSach);
			ptmt.setString(2, s.getTieuDe());
			ptmt.setString(3, s.getTacGia());
			ptmt.setLong(4, s.getNamXuatBan());
			ptmt.setLong(5, s.getGiaTien());
			ptmt.setString(6, s.getMaXuatBan());
			ptmt.setLong(7, s.getSoLuong());
			int insertSach = ptmt.executeUpdate();
			if(insertSach ==1) {
				System.out.println("Them thanh cong sach");
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void updateSach(sach s) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql_updateSach = "update Sach set tieuDe = ?, tacGia = ?, namXuatBan = ?, giaTien = ?, maXuatBan = ?, soLuong = ? where maSach = ?";
		String sql_selectNXB = "select * from nhaXuatBan where maXuatBan = ?";
		
		try {
			PreparedStatement ptmt_selectNXB = conn.prepareStatement(sql_selectNXB);
			ptmt_selectNXB.setString(1,s.getMaXuatBan());
			int i = 0;
			ResultSet listMaXuatBan = ptmt_selectNXB.executeQuery();
			String maXuatBanMoi=new String();
			while(listMaXuatBan.next()) {
				i=1;
			}
				//1 ton tai
				//0 khong ton tai
				if(i==0) {//khong ton tai NXB
					String sql3 = "insert into nhaXuatBan values(?,?)";
					PreparedStatement ptmt3 = conn.prepareStatement(sql3);
					ptmt3.setString(1,s.getMaXuatBan());
					ptmt3.setString(2,"Nhà xuất bản");
					
					int insertNXB = ptmt3.executeUpdate();
					System.out.println(insertNXB);
					
					if(insertNXB == 1) {
						System.out.println("them thanh cong nha xuat ban");					
					}	
				}
			PreparedStatement ptmt_updateSach = conn.prepareStatement(sql_updateSach);
			
			ptmt_updateSach.setString(1, s.getTieuDe());
			ptmt_updateSach.setString(2, s.getTacGia());
			ptmt_updateSach.setLong(3, s.getNamXuatBan());
			ptmt_updateSach.setLong(4, s.getGiaTien());
			ptmt_updateSach.setString(5, s.getMaXuatBan());
			ptmt_updateSach.setLong(6, s.getSoLuong());
			ptmt_updateSach.setString(7, s.maSach);
			int insertSach = ptmt_updateSach.executeUpdate();
			if(insertSach ==1) {
				System.out.println("Update thanh cong sach");
			}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void loadDataSach(ArrayList<sach> sachList) {
		Connection conn = JDBCConnection.getJDBCConnection();
		String sql = "select * from sach";
		try {
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ResultSet rs = ptmt.executeQuery();
			while(rs.next()) {
				String maSach = rs.getString("maSach");
				String tieuDe = rs.getString("tieuDe");
				String tacGia = rs.getString("tacGia");
				Long namXuatBan = rs.getLong("namXuatBan");
				Long giaTien = rs.getLong("giaTien");
				String maXuatBan = rs.getString("maXuatBan");
				Long soLuong = rs.getLong("soLuong");
				System.out.println(maSach +" " +soLuong);
				sach s = new sach(maSach,tieuDe,tacGia,namXuatBan,giaTien,maXuatBan,soLuong);
				sachList.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sortNamXuatBan(ArrayList<sach> sachList) {
		Collections.sort(sachList, new Comparator<sach>() {
			@Override
			public int compare(sach o1, sach o2) {
				// TODO Auto-generated method stub
				if(o1.getNamXuatBan() > o2.getNamXuatBan()) return 1;
				else if(o1.getNamXuatBan() < o2.getNamXuatBan()) return -1;
				else return 0;
			}
			
		});
	}
	
	public static void sortGiaTien(ArrayList<sach> sachList) {
		Collections.sort(sachList, new Comparator<sach>() {

			@Override
			public int compare(sach o1, sach o2) {
				if(o1.getGiaTien() > o2.getGiaTien()) {
					return 1;
				}
				else if(o1.getGiaTien() < o2.getGiaTien()) {
					return -1;
				}else return 0;
			}
			
		});
	}
	
	
	public static void main(String[] args) {
		
		
	}
}
