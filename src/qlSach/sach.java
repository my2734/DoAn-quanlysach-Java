package qlSach;

public class sach {
	String maSach;
	private String tieuDe;
	private String tacGia;
	private String maXuatBan;
	private long namXuatBan, giaTien,soLuong;
	
	public sach() {
		this.maSach = new String();
		this.tieuDe = new String();
		this.tacGia = new String();
		this.namXuatBan = 0;
		this.giaTien = 0;
		this.maXuatBan = new String();
		this.soLuong = 0;
	}
	
	public sach(String maSach, String tieuDe, String tacGia,long namXuatBan, long giaTien, String maXuatBan,long soLuong) {
		this.maSach = new String(maSach);
		this.tieuDe = new String(tieuDe);
		this.tacGia = new String(tacGia);
		this.namXuatBan = namXuatBan;
		this.giaTien = giaTien;
		this.maXuatBan = new String(maXuatBan);
		this.soLuong = soLuong;
	}
	
	public sach(sach s) {
		this.maSach = new String(s.maSach);
		this.tieuDe = new String(s.tieuDe);
		this.tacGia = new String(s.tacGia);
		this.namXuatBan = s.namXuatBan;
		this.giaTien = s.giaTien;
		this.maXuatBan = new String(maXuatBan);
		this.soLuong = soLuong;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public String getMaXuatBan() {
		return maXuatBan;
	}

	public void setMaXuatBan(String maXuatBan) {
		this.maXuatBan = maXuatBan;
	}

	public long getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(long namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public long getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(long giaTien) {
		this.giaTien = giaTien;
	}

	public long getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(long soLuong) {
		this.soLuong = soLuong;
	}

	
}
