import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai7_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtHeSoLuong;
	private JTextField txtLuong;
	private JTextField txtThongSo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai7_2 frame = new Bai7_2();
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
	public class NhanVien {
		final double LUONGCOBAN = 1550000;
		double hesoLuong;

		public NhanVien(double hesoLuong) {
			this.hesoLuong = hesoLuong;
		}

		public double getHesoLuong() {
			return hesoLuong;
		}

		public void setHesoLuong(double hesoLuong) {
			this.hesoLuong = hesoLuong;
		}

		public double tinhLuong() {
			return this.LUONGCOBAN * this.hesoLuong;
		}
	}

	public class HanhChinh extends NhanVien {
		double phuCap;

		public HanhChinh(double phuCap, double hesoLuong) {
			super(hesoLuong);
			this.phuCap = phuCap;
		}

		public double getPhuCap() {
			return phuCap;
		}

		public void setPhuCap(double phuCap) {
			this.phuCap = phuCap;
		}

		@Override
		public double tinhLuong() {
			return super.tinhLuong() + this.phuCap;
		}
	}

	public class KyThuat extends NhanVien {
		double soDuAn;

		public KyThuat(double soDuAn, double hesoLuong) {
			super(hesoLuong);
			this.soDuAn = soDuAn;
		}

		public double getSoDuAn() {
			return soDuAn;
		}

		public void setSoDuAn(double phuCap) {
			this.soDuAn = soDuAn * 1000000;
		}

		@Override
		public double tinhLuong() {
			return super.tinhLuong() + this.soDuAn;
		}
	}

	public class KinhDoanh extends NhanVien {
		double soSanPham;

		public KinhDoanh(double soSanPham, double hesoLuong) {
			super(hesoLuong);
			this.soSanPham = soSanPham;
		}

		public double getSoSanPham() {
			return soSanPham;
		}

		public void setSoSanPham(double soSanPham) {
			this.soSanPham = soSanPham * 20000;
		}

		@Override
		public double tinhLuong() {
			return super.tinhLuong() + this.soSanPham;
		}
	}

	public class lanhDao extends NhanVien {
		public lanhDao(double hesoLuong) {
			super(hesoLuong);
		}

		@Override
		public double tinhLuong() {
			return super.tinhLuong() * 1.1;
		}
	}

	public Bai7_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Loại NV");
		lblNewLabel.setBounds(35, 25, 61, 16);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Hệ số lương");
		lblNewLabel_1.setBounds(35, 63, 112, 16);
		contentPane.add(lblNewLabel_1);

		txtHeSoLuong = new JTextField();
		txtHeSoLuong.setBounds(153, 60, 130, 26);
		contentPane.add(txtHeSoLuong);
		txtHeSoLuong.setColumns(10);

		JLabel lblLng = new JLabel("Lương");
		lblLng.setBounds(35, 211, 61, 16);
		contentPane.add(lblLng);

		txtLuong = new JTextField();
		txtLuong.setEditable(false);
		txtLuong.setBounds(159, 206, 130, 26);
		contentPane.add(txtLuong);
		txtLuong.setColumns(10);

		JLabel lblThongSo = new JLabel("");
		lblThongSo.setBounds(35, 147, 78, 16);
		contentPane.add(lblThongSo);

		txtThongSo = new JTextField();
		txtThongSo.setBounds(153, 142, 130, 26);
		contentPane.add(txtThongSo);
		txtThongSo.setColumns(10);

		JComboBox<String> cbbLoaiNV = new JComboBox<String>();
		cbbLoaiNV.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Hành chính", "Kỹ thuật", "Kinh doanh", "Lãnh đạo" }));
		cbbLoaiNV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (cbbLoaiNV.getSelectedIndex()) {
				case 0: // hanh chinh
					lblThongSo.setText("Phu cap");
					break;
				case 1: // ky thuat
					lblThongSo.setText("Số dự án ");
					break;
				case 2: // kinh doanh
					lblThongSo.setText("Số sản phẩm");
					break;
				case 3: // lanh dao
					lblThongSo.setText("");
				}
			}
		});
		cbbLoaiNV.setBounds(153, 21, 149, 27);
		contentPane.add(cbbLoaiNV);

		JButton tbnTinhLuong = new JButton("Tính lương");
		tbnTinhLuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double hesoLuong = Double.parseDouble(txtHeSoLuong.getText());
				int thongSo = Integer.parseInt(txtThongSo.getText());
				switch (cbbLoaiNV.getSelectedIndex()) {
				case 0: // hanh chinh
					HanhChinh hc = new HanhChinh(thongSo, hesoLuong);
					txtLuong.setText(String.valueOf(hc.tinhLuong()));
					break;
				case 1: // ky thuat
					KyThuat kt = new KyThuat(thongSo, hesoLuong);
					txtLuong.setText(String.valueOf(kt.tinhLuong()));
					break;
				case 2: // kinh doanh
					KinhDoanh kd = new KinhDoanh(thongSo, hesoLuong);
					txtLuong.setText(String.valueOf(kd.tinhLuong()));
					break;
				case 3: // lanh dao
					lanhDao ld = new lanhDao(hesoLuong);
					txtLuong.setText(String.valueOf(ld.tinhLuong()));
					break;
				}
			}
		});

		tbnTinhLuong.setBounds(166, 180, 117, 29);
		contentPane.add(tbnTinhLuong);
	}

}
