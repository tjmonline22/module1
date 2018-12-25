import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai6_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaCD;
	private JTextField txtTenCD;
	private JTextField txtCaSi;
	private JTextField txtSoBaiHat;
	private JTextField txtGiaThanh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai6_2 frame = new Bai6_2();
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
	
	public class CD { 
		public CD() {
		}
		String maCD;
		String tenCD;
		String caSi;
		int soBaiHat;
		double giaThanh;
		public CD(String maCD, String tenCD, String caSi, int soBaiHat, double giaThanh) {
			this.maCD = maCD; 	
			this.tenCD = tenCD; 
			this.caSi = caSi; 
			this.soBaiHat = soBaiHat; 
			this.giaThanh = giaThanh;
		}
		public String getMaCD() {
			return maCD; 
		}
		public void setMaCD(String maCD) { 
			this.maCD = maCD;
		}
		public String getTenCD() {
			return tenCD; 
		}
		public void setTenCD(String tenCD) { 
			this.tenCD = tenCD;
		}
		public String getCaSi() {
			return caSi;
		}
		public void setCaSi(String caSi) {
			this.caSi = caSi; 
		}
		public int getSoBaiHat() { 
			return soBaiHat;
		}
		public void setSoBaiHat(int soBaiHat) {
			this.soBaiHat = soBaiHat; 
		}
		public double getGiaThanh() { 
			return giaThanh;
		}
		public void setGiaThanh(double giaThanh) {
			this.giaThanh = giaThanh; 
		}
		} 
		
	public double tong = 0; 
	String chuoiCD = "";
		
	public Bai6_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMCd = new JLabel("Mã CD");
		lblMCd.setBounds(6, 6, 61, 16);
		contentPane.add(lblMCd);
		
		txtMaCD = new JTextField();
		txtMaCD.setBounds(75, 1, 73, 26);
		contentPane.add(txtMaCD);
		txtMaCD.setColumns(10);
		
		JLabel lblTnCd = new JLabel("Tên CD");
		lblTnCd.setBounds(174, 6, 55, 16);
		contentPane.add(lblTnCd);
		
		txtTenCD = new JTextField();
		txtTenCD.setBounds(232, 1, 221, 26);
		contentPane.add(txtTenCD);
		txtTenCD.setColumns(10);
		
		JLabel lblCaS = new JLabel("Ca sĩ");
		lblCaS.setBounds(6, 34, 55, 16);
		contentPane.add(lblCaS);
		
		txtCaSi = new JTextField();
		txtCaSi.setBounds(56, 29, 92, 26);
		contentPane.add(txtCaSi);
		txtCaSi.setColumns(10);
		
		JLabel lblSBiHt = new JLabel("Số bài hát");
		lblSBiHt.setBounds(160, 34, 75, 16);
		contentPane.add(lblSBiHt);
		
		txtSoBaiHat = new JTextField();
		txtSoBaiHat.setBounds(242, 29, 37, 26);
		contentPane.add(txtSoBaiHat);
		txtSoBaiHat.setColumns(10);
		
		JLabel lblGiThnh = new JLabel("Giá Thành");
		lblGiThnh.setBounds(291, 34, 75, 16);
		contentPane.add(lblGiThnh);
		
		txtGiaThanh = new JTextField();
		txtGiaThanh.setBounds(369, 29, 103, 26);
		contentPane.add(txtGiaThanh);
		txtGiaThanh.setColumns(10);
		
		JTextArea txtaKetQua = new JTextArea();
		txtaKetQua.setEditable(false);
		txtaKetQua.setBounds(41, 158, 382, 197);
		contentPane.add(txtaKetQua);
		
		JButton btnGhi = new JButton("Thêm mới");
		btnGhi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGhi.setBounds(110, 81, 117, 29);
		contentPane.add(btnGhi);
		
		JButton btnTiep = new JButton("Tiếp tục");
		btnTiep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CD cd = new CD(txtMaCD.getText(), txtTenCD.getText(), txtCaSi.getText(),
						Integer.parseInt(txtSoBaiHat.getText()),Double.parseDouble( txtGiaThanh.getText()));
						chuoiCD += cd.getMaCD() + " - " + cd.getTenCD() + " - " + cd.getCaSi() + " - " + cd.getSoBaiHat() + " - " + cd.getGiaThanh() + "\n";
						tong += cd.giaThanh;
						txtaKetQua.setText(chuoiCD + "\n Tổng giá thành = " + tong );
			}
		});
		btnTiep.setBounds(249, 81, 117, 29);
		contentPane.add(btnTiep);
	}

}
