package qlSach;

public class nhaXuatBan {
	private String maXuatBan;
	private String tenXuatBan;
	
	public nhaXuatBan() {
		this.maXuatBan = new String();
		this.tenXuatBan = new String();
	}
	
	public nhaXuatBan(String maXuatBan, String tenXuatBan) {
		this.maXuatBan = new String(maXuatBan);
		this.tenXuatBan = new String(tenXuatBan);
	}
	
	public nhaXuatBan(nhaXuatBan b) {
		this.maXuatBan = new String(b.maXuatBan);
		this.tenXuatBan = new String(b.tenXuatBan);
	}

	public String getMaXuatBan() {
		return maXuatBan;
	}

	public void setMaXuatBan(String maXuatBan) {
		this.maXuatBan = maXuatBan;
	}

	public String getTenXuatBan() {
		return tenXuatBan;
	}

	public void setTenXuatBan(String tenXuatBan) {
		this.tenXuatBan = tenXuatBan;
	}
}
