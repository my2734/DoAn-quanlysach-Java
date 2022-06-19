package qlSach;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


import java.awt.SystemColor;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class QuanLySach extends JFrame {
	private JTextField txtMaSach;
	private JTextField txtTieuDe;
	private JTextField txtTacGia;
	private JTextField txtNamXuatBan;
	private JTextField txtGiaTien;
	private JTextField txtMaXuatBan;
	private JTextField txtSoLuong;
	private JTable tableSach;
	private JTextField txtMaXuatBan1;
	private JTextField txtTenXuatBan;
	private JTable tableNhaXuatBan;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLySach frame = new QuanLySach();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuanLySach() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1205, 706);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1338, 671);
		getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		tabbedPane.addTab("QUẢN LÝ SÁCH", new ImageIcon("C:\\Users\\Ngoc My\\eclipse-workspace\\doAn\\sqSach\\src\\qlSach\\img\\87-876167_icon-book-note-dairy-book-book-book-book-b-biểu-tượng-cuốn (2).png"), panel, null);
		tabbedPane.setBackgroundAt(0, SystemColor.inactiveCaption);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Sách: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(52, 24, 163, 17);
		panel.add(lblNewLabel_1);
		
		txtMaSach = new JTextField();
		txtMaSach.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMaSach.setBounds(100, 54, 250, 29);
		panel.add(txtMaSach);
		txtMaSach.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tiêu Đề:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(52, 94, 163, 17);
		panel.add(lblNewLabel_1_1);
		
		txtTieuDe = new JTextField();
		txtTieuDe.setColumns(10);
		txtTieuDe.setBounds(100, 124, 250, 30);
		panel.add(txtTieuDe);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tác Giả:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(52, 164, 163, 17);
		panel.add(lblNewLabel_1_1_1);
		
		txtTacGia = new JTextField();
		txtTacGia.setColumns(10);
		txtTacGia.setBounds(100, 194, 250, 30);
		panel.add(txtTacGia);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Năm Xuất Bản:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(52, 234, 163, 17);
		panel.add(lblNewLabel_1_1_1_1);
		
		txtNamXuatBan = new JTextField();
		txtNamXuatBan.setColumns(10);
		txtNamXuatBan.setBounds(100, 264, 250, 30);
		panel.add(txtNamXuatBan);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Giá Tiền:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBounds(52, 304, 163, 17);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		txtGiaTien = new JTextField();
		txtGiaTien.setColumns(10);
		txtGiaTien.setBounds(100, 334, 250, 30);
		panel.add(txtGiaTien);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Mã Xuất Bản:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1_1.setBounds(52, 374, 163, 17);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		txtMaXuatBan = new JTextField();
		txtMaXuatBan.setColumns(10);
		txtMaXuatBan.setBounds(100, 404, 250, 30);
		panel.add(txtMaXuatBan);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Số Lượng:");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(52, 444, 163, 17);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(100, 474, 250, 30);
		panel.add(txtSoLuong);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(409, 63, 832, 301);
		panel.add(scrollPane);
		
		tableSach = new JTable();
		tableSach.setBackground(new Color(176, 224, 230));
		tableSach.setForeground(new Color(0, 0, 0));
		tableSach.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 s\u00E1ch", "Ti\u00EAu \u0111\u1EC1", "T\u00E1c gi\u1EA3", "N\u0103m xu\u1EA5t b\u1EA3n", "Gi\u00E1 ti\u1EC1n", "M\u00E3 xu\u1EA5t b\u1EA3n", "S\u1ED1 l\u01B0\u1EE3ng"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Long.class, Long.class, String.class, Long.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableSach.getColumnModel().getColumn(0).setPreferredWidth(50);
		tableSach.getColumnModel().getColumn(1).setPreferredWidth(170);
		tableSach.getColumnModel().getColumn(2).setPreferredWidth(120);
		tableSach.getColumnModel().getColumn(3).setPreferredWidth(120);
		tableSach.getColumnModel().getColumn(4).setPreferredWidth(120);
		tableSach.getColumnModel().getColumn(5).setPreferredWidth(120);
		tableSach.getColumnModel().getColumn(6).setPreferredWidth(120);
		scrollPane.setViewportView(tableSach);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ SÁCH");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(646, 0, 337, 35);
		panel.add(lblNewLabel);
		
		JButton btnThmSchMi = new JButton("Thêm sách mới");
		btnThmSchMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maSach = txtMaSach.getText();
				String tieuDe = txtTieuDe.getText();
				String tacGia = txtTacGia.getText();
				Long namXuatBan = Long.parseLong(txtNamXuatBan.getText());
				Long giaTien = Long.parseLong(txtGiaTien.getText());
				String maXuatBan = txtMaXuatBan.getText();
				Long soLuong = Long.parseLong(txtSoLuong.getText());
				sach s = new sach(maSach,tieuDe,tacGia,namXuatBan,giaTien,maXuatBan,soLuong);
				updateSach.insertSach(s);
				
				ArrayList<sach> sachList = new ArrayList<sach>();
				updateSach.loadDataSach(sachList);
				DefaultTableModel model = new DefaultTableModel();
				tableSach.getModel();
				model = (DefaultTableModel)tableSach.getModel();
				model.setRowCount(0);
				for(sach s1 : sachList) {
					model.addRow(new Object[] {
							s1.maSach,s1.getTieuDe(),s1.getTacGia(),s1.getNamXuatBan(),s1.getGiaTien(),s1.getMaXuatBan(),s1.getSoLuong()
					});
				}
				
				ArrayList<nhaXuatBan> nhaXuatBanList = new ArrayList<nhaXuatBan>();
				updateNhaXuatBan.loadDataNXB(nhaXuatBanList);
				DefaultTableModel model3 = new DefaultTableModel();
				tableNhaXuatBan.getModel();
				model3 = (DefaultTableModel) tableNhaXuatBan.getModel();
				model3.setRowCount(0);
				for(nhaXuatBan n : nhaXuatBanList) {
					model3.addRow(new Object[] {
							n.getMaXuatBan(),n.getTenXuatBan()
					});
				}
				
				JOptionPane.showMessageDialog(null, "Thêm sách mới thành công");
			}
		});
		btnThmSchMi.setForeground(Color.BLACK);
		btnThmSchMi.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThmSchMi.setBackground(SystemColor.activeCaption);
		btnThmSchMi.setBounds(409, 404, 178, 35);
		panel.add(btnThmSchMi);
		
		JButton btnXaSch = new JButton("Xóa sách");
		btnXaSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maSach = txtMaSach.getText();
				updateSach.deleteSach(maSach);
				
				
				ArrayList<sach> sachList = new ArrayList<sach>();
				updateSach.loadDataSach(sachList);
				DefaultTableModel model = new DefaultTableModel();
				tableSach.getModel();
				model = (DefaultTableModel)tableSach.getModel();
				model.setRowCount(0);
				for(sach s2 : sachList) {
					model.addRow(new Object[] {
							s2.maSach,s2.getTieuDe(),s2.getTacGia(),s2.getNamXuatBan(),s2.getGiaTien(),s2.getMaXuatBan(),s2.getSoLuong()
					});
				}
				
				ArrayList<nhaXuatBan> nhaXuatBanList = new ArrayList<nhaXuatBan>();
				updateNhaXuatBan.loadDataNXB(nhaXuatBanList);
				DefaultTableModel model3 = new DefaultTableModel();
				tableNhaXuatBan.getModel();
				model3 = (DefaultTableModel) tableNhaXuatBan.getModel();
				model3.setRowCount(0);
				for(nhaXuatBan n : nhaXuatBanList) {
					model3.addRow(new Object[] {
							n.getMaXuatBan(),n.getTenXuatBan()
					});
				}
				
				JOptionPane.showMessageDialog(null, "Xóa sách thành công");
			}
		});
		btnXaSch.setForeground(Color.BLACK);
		btnXaSch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXaSch.setBackground(SystemColor.activeCaption);
		btnXaSch.setBounds(646, 404, 178, 35);
		panel.add(btnXaSch);
		
		JButton btnCpNhtSch = new JButton("Cập nhật sách");
		btnCpNhtSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maSach = txtMaSach.getText();
				String tieuDe = txtTieuDe.getText();
				String tacGia = txtTacGia.getText();
				Long namXuatBan = Long.parseLong(txtNamXuatBan.getText());
				Long giaTien = Long.parseLong(txtGiaTien.getText());
				String maXuatBan = txtMaXuatBan.getText();
				Long soLuong = Long.parseLong(txtSoLuong.getText());
				sach s = new sach(maSach,tieuDe,tacGia,namXuatBan,giaTien,maXuatBan,soLuong);
				updateSach.updateSach(s);
				
				ArrayList<sach> sachList = new ArrayList<sach>();
				updateSach.loadDataSach(sachList);
				DefaultTableModel model = new DefaultTableModel();
				tableSach.getModel();
				model = (DefaultTableModel)tableSach.getModel();
				model.setRowCount(0);
				for(sach s3 : sachList) {
					model.addRow(new Object[] {
							s3.maSach,s3.getTieuDe(),s3.getTacGia(),s3.getNamXuatBan(),s3.getGiaTien(),s3.getMaXuatBan(),s3.getSoLuong()
					});
				}
				
				ArrayList<nhaXuatBan> nhaXuatBanList = new ArrayList<nhaXuatBan>();
				updateNhaXuatBan.loadDataNXB(nhaXuatBanList);
				DefaultTableModel model3 = new DefaultTableModel();
				tableNhaXuatBan.getModel();
				model3 = (DefaultTableModel) tableNhaXuatBan.getModel();
				model3.setRowCount(0);
				for(nhaXuatBan n : nhaXuatBanList) {
					model3.addRow(new Object[] {
							n.getMaXuatBan(),n.getTenXuatBan()
					});
				}
				
				JOptionPane.showMessageDialog(null, "Cập nhật sách thành công");
			}
		});
		btnCpNhtSch.setForeground(Color.BLACK);
		btnCpNhtSch.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCpNhtSch.setBackground(SystemColor.activeCaption);
		btnCpNhtSch.setBounds(409, 478, 178, 35);
		panel.add(btnCpNhtSch);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaSach.setText("");
				txtTieuDe.setText("");
				txtTacGia.setText("");
				txtNamXuatBan.setText("");
				txtGiaTien.setText("");
				txtMaXuatBan.setText("");
				txtSoLuong.setText("");
			}
		});
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBackground(SystemColor.activeCaption);
		btnClear.setBounds(646, 478, 178, 35);
		panel.add(btnClear);
		
		JButton btnLoadDLiu = new JButton("Sắp xếp năm xuất bản");
		btnLoadDLiu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<sach> sachList = new ArrayList<sach>();
				updateSach.loadDataSach(sachList);
				updateSach.sortNamXuatBan(sachList);
				DefaultTableModel model = new DefaultTableModel();
				tableSach.getModel();
				model = (DefaultTableModel)tableSach.getModel();
				model.setRowCount(0);
				for(sach s : sachList) {
					model.addRow(new Object[] {
							s.maSach,s.getTieuDe(),s.getTacGia(),s.getNamXuatBan(),s.getGiaTien(),s.getMaXuatBan(),s.getSoLuong()
					});
				}
			}
		});
		btnLoadDLiu.setForeground(Color.BLACK);
		btnLoadDLiu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLoadDLiu.setBackground(new Color(255, 235, 205));
		btnLoadDLiu.setBounds(877, 404, 224, 35);
		panel.add(btnLoadDLiu);
		
		JButton btnThmNhnVin_5 = new JButton("Sắp xếp theo giá tiền");
		btnThmNhnVin_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<sach> sachList = new ArrayList<sach>();
				updateSach.loadDataSach(sachList);
				updateSach.sortGiaTien(sachList);
				DefaultTableModel model1 = new DefaultTableModel();
				tableSach.getModel();
				model1 = (DefaultTableModel)tableSach.getModel();
				model1.setRowCount(0);
				for(sach s : sachList) {
					model1.addRow(new Object[] {
							s.maSach,s.getTieuDe(),s.getTacGia(),s.getNamXuatBan(),s.getGiaTien(),s.getMaXuatBan(),s.getSoLuong()
					});
				}
			}
		});
		btnThmNhnVin_5.setForeground(Color.BLACK);
		btnThmNhnVin_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThmNhnVin_5.setBackground(new Color(255, 235, 205));
		btnThmNhnVin_5.setBounds(877, 478, 224, 35);
		panel.add(btnThmNhnVin_5);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("QUẢN LÝ NHÀ XUẤT BẢN", new ImageIcon("C:\\Users\\Ngoc My\\eclipse-workspace\\doAn\\sqSach\\src\\qlSach\\img\\images (2) (1).jpg"), panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mã Xuất Bản");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(201, 92, 163, 17);
		panel_1.add(lblNewLabel_1_2);
		
		txtMaXuatBan1 = new JTextField();
		txtMaXuatBan1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMaXuatBan1.setColumns(10);
		txtMaXuatBan1.setBounds(201, 130, 250, 29);
		panel_1.add(txtMaXuatBan1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Tên Xuất Bản");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2_1.setBounds(201, 180, 163, 17);
		panel_1.add(lblNewLabel_1_2_1);
		
		txtTenXuatBan = new JTextField();
		txtTenXuatBan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTenXuatBan.setColumns(10);
		txtTenXuatBan.setBounds(201, 218, 250, 29);
		panel_1.add(txtTenXuatBan);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(546, 121, 483, 229);
		panel_1.add(scrollPane_1);
		
		tableNhaXuatBan = new JTable();
		tableNhaXuatBan.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"M\u00E3 xu\u1EA5t b\u1EA3n", "T\u00EAn xu\u1EA5t b\u1EA3n"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableNhaXuatBan.getColumnModel().getColumn(0).setPreferredWidth(200);
		tableNhaXuatBan.getColumnModel().getColumn(1).setPreferredWidth(280);
		scrollPane_1.setViewportView(tableNhaXuatBan);
		
		JLabel lblQunLNh = new JLabel("QUẢN LÝ NHÀ XUẤT BẢN");
		lblQunLNh.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblQunLNh.setBounds(465, 23, 337, 35);
		panel_1.add(lblQunLNh);
		
		JButton btnThmNhnVin_5_1 = new JButton("Thêm nhà xuất bản");
		btnThmNhnVin_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maXuatBan = txtMaXuatBan1.getText();
				String tenXuatBan = txtTenXuatBan.getText();
				nhaXuatBan n = new nhaXuatBan(maXuatBan,tenXuatBan);
				updateNhaXuatBan.insertNXB(n);
				
				
				
				
				ArrayList<nhaXuatBan> nhaXuatBanList = new ArrayList<nhaXuatBan>();
				updateNhaXuatBan.loadDataNXB(nhaXuatBanList);
				
				DefaultTableModel model3 = new DefaultTableModel();
				tableNhaXuatBan.getModel();
				model3 = (DefaultTableModel) tableNhaXuatBan.getModel();
				model3.setRowCount(0);
				for(nhaXuatBan n1 : nhaXuatBanList) {
					model3.addRow(new Object[] {
							n1.getMaXuatBan(),n1.getTenXuatBan()
					});
				}
					
				JOptionPane.showMessageDialog(null, "Thêm nhà xuất bản thành công");
			}
		});		
		btnThmNhnVin_5_1.setForeground(Color.BLACK);
		btnThmNhnVin_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThmNhnVin_5_1.setBackground(SystemColor.activeCaption);
		btnThmNhnVin_5_1.setBounds(134, 421, 178, 35);
		panel_1.add(btnThmNhnVin_5_1);
		
		JButton btnThmNhnVin_5_2 = new JButton("Xóa nhà xuất bản");
		btnThmNhnVin_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maXuatBan = txtMaXuatBan1.getText();
				updateNhaXuatBan.deleteNXB(maXuatBan);
				
				
				ArrayList<nhaXuatBan> nhaXuatBanList = new ArrayList<nhaXuatBan>();
				updateNhaXuatBan.loadDataNXB(nhaXuatBanList);
				
				DefaultTableModel model3 = new DefaultTableModel();
				tableNhaXuatBan.getModel();
				model3 = (DefaultTableModel) tableNhaXuatBan.getModel();
				model3.setRowCount(0);
				for(nhaXuatBan n2 : nhaXuatBanList) {
					model3.addRow(new Object[] {
							n2.getMaXuatBan(),n2.getTenXuatBan()
					});
				}
				
				
				ArrayList<sach> sachList = new ArrayList<sach>();
				updateSach.loadDataSach(sachList);
				DefaultTableModel model1 = new DefaultTableModel();
				tableSach.getModel();
				model1 = (DefaultTableModel)tableSach.getModel();
				model1.setRowCount(0);
				for(sach s : sachList) {
					model1.addRow(new Object[] {
							s.maSach,s.getTieuDe(),s.getTacGia(),s.getNamXuatBan(),s.getGiaTien(),s.getMaXuatBan(),s.getSoLuong()
					});
				}
				
				JOptionPane.showMessageDialog(null, "Xóa nhà xuất bản thành công");
			}
		});
		btnThmNhnVin_5_2.setForeground(Color.BLACK);
		btnThmNhnVin_5_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThmNhnVin_5_2.setBackground(SystemColor.activeCaption);
		btnThmNhnVin_5_2.setBounds(402, 421, 178, 35);
		panel_1.add(btnThmNhnVin_5_2);
		
		JButton btnThmNhnVin_5_3 = new JButton("Cập nhật thông tin");
		btnThmNhnVin_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String maXuatBan = txtMaXuatBan1.getText();
				String tenXuatBan = txtTenXuatBan.getText();
				nhaXuatBan n = new nhaXuatBan(maXuatBan,tenXuatBan);
				updateNhaXuatBan.updateNXB(n);
				
				ArrayList<nhaXuatBan> nhaXuatBanList = new ArrayList<nhaXuatBan>();
				updateNhaXuatBan.loadDataNXB(nhaXuatBanList);
				DefaultTableModel model3 = new DefaultTableModel();
				tableNhaXuatBan.getModel();
				model3 = (DefaultTableModel) tableNhaXuatBan.getModel();
				model3.setRowCount(0);
				for(nhaXuatBan n3 : nhaXuatBanList) {
					model3.addRow(new Object[] {
							n3.getMaXuatBan(),n3.getTenXuatBan()
					});
				}
				
				ArrayList<sach> sachList = new ArrayList<sach>();
				updateSach.loadDataSach(sachList);
				DefaultTableModel model1 = new DefaultTableModel();
				tableSach.getModel();
				model1 = (DefaultTableModel)tableSach.getModel();
				model1.setRowCount(0);
				for(sach s : sachList) {
					model1.addRow(new Object[] {
							s.maSach,s.getTieuDe(),s.getTacGia(),s.getNamXuatBan(),s.getGiaTien(),s.getMaXuatBan(),s.getSoLuong()
					});
				}
				JOptionPane.showMessageDialog(null, "Cập nhật nhà xuất bản thành công");
			}
		});
		btnThmNhnVin_5_3.setForeground(Color.BLACK);
		btnThmNhnVin_5_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThmNhnVin_5_3.setBackground(SystemColor.activeCaption);
		btnThmNhnVin_5_3.setBounds(670, 421, 178, 35);
		panel_1.add(btnThmNhnVin_5_3);
		
		JButton btnThmNhnVin_5_4 = new JButton("Clear");
		btnThmNhnVin_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaXuatBan1.setText("");
				txtTenXuatBan.setText("");
			}
		});
		btnThmNhnVin_5_4.setForeground(Color.BLACK);
		btnThmNhnVin_5_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnThmNhnVin_5_4.setBackground(SystemColor.activeCaption);
		btnThmNhnVin_5_4.setBounds(938, 421, 178, 35);
		panel_1.add(btnThmNhnVin_5_4);
		
		ArrayList<nhaXuatBan> nhaXuatBanList = new ArrayList<nhaXuatBan>();
		updateNhaXuatBan.loadDataNXB(nhaXuatBanList);
		DefaultTableModel model3 = new DefaultTableModel();
		tableNhaXuatBan.getModel();
		model3 = (DefaultTableModel) tableNhaXuatBan.getModel();
		model3.setRowCount(0);
		for(nhaXuatBan n : nhaXuatBanList) {
			model3.addRow(new Object[] {
					n.getMaXuatBan(),n.getTenXuatBan()
			});
		}
		
		ArrayList<sach> sachList = new ArrayList<sach>();
		updateSach.loadDataSach(sachList);
		DefaultTableModel model1 = new DefaultTableModel();
		tableSach.getModel();
		model1 = (DefaultTableModel)tableSach.getModel();
		model1.setRowCount(0);
		for(sach s : sachList) {
			model1.addRow(new Object[] {
					s.maSach,s.getTieuDe(),s.getTacGia(),s.getNamXuatBan(),s.getGiaTien(),s.getMaXuatBan(),s.getSoLuong()
			});
		}
		
		
		
		
	}
}
