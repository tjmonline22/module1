import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Bai6_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTuSo1;
	private JTextField txtMauSo1;
	private JTextField txtTuSo2;
	private JTextField txtMauSo2;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai6_1 frame = new Bai6_1();
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
	public class PhanSo { 
		int tuSo;
		int mauSo;
		public PhanSo(int tuSo, int mauSo) {
			this.tuSo = tuSo;
			this.mauSo = mauSo; 
			}
		public PhanSo() {
		}
		public int getTuSo() {
			return tuSo; 
		}
		public void setTuSo(int tuSo) { 
			this.tuSo = tuSo;
		}
		
		public int getMauSo() {
			return mauSo;
		}
		public void setMauSo(int mauSo) {
			this.mauSo = mauSo; 
		}
	}
	
	private PhanSo tinhTong(PhanSo phanSo1, PhanSo phanSo2){ 
		int kqTuSo = phanSo1.getTuSo() * phanSo2.getMauSo()
			+ phanSo2.getTuSo() * phanSo1.getMauSo();
		int kqMauSo = phanSo1.getMauSo() * phanSo2.getMauSo();
		PhanSo kq = new PhanSo(kqTuSo, kqMauSo);
		return kq; 
		}
	
	private PhanSo tinhHieu(PhanSo phanSo1, PhanSo phanSo2){ 
		int kqTuSo = phanSo1.getTuSo() * phanSo2.getMauSo()
			- phanSo2.getTuSo() * phanSo1.getMauSo();
		int kqMauSo = phanSo1.getMauSo() * phanSo2.getMauSo();
		PhanSo kq = new PhanSo(kqTuSo, kqMauSo);
		return kq; 
		}
	
	private PhanSo tinhTich(PhanSo phanSo1, PhanSo phanSo2){
		int kqTuSo = phanSo1.getTuSo() * phanSo2.getTuSo();
		int kqMauSo = phanSo1.getMauSo() * phanSo2.getMauSo();
		PhanSo kq = new PhanSo(kqTuSo, kqMauSo);
		return kq; 
		}
	
	private PhanSo tinhThuong(PhanSo phanSo1, PhanSo phanSo2){ 
		int kqTuSo = phanSo1.getTuSo() * phanSo2.getMauSo(); 
		int kqMauSo = phanSo1.getMauSo() * phanSo2.getTuSo();
		PhanSo kq = new PhanSo(kqTuSo, kqMauSo); 
		return kq;
	}
	
	private PhanSo tinh(String phepToan, PhanSo phanSo1, PhanSo phanSo2){
		
		if("+".equals(phepToan)){
		return tinhTong(phanSo1, phanSo2);
		}else if("-".equals(phepToan)){
		return tinhHieu(phanSo1, phanSo2);
		}else if("*".equals(phepToan)){
		return tinhTich(phanSo1, phanSo2);
		}else if("/".equals(phepToan)){
		return tinhThuong(phanSo1, phanSo2);
		}
		return null; 
		}
	
	
	public Bai6_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Phân số 1");
		lblNewLabel.setBounds(71, 6, 72, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phân số 2");
		lblNewLabel_1.setBounds(283, 6, 80, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tử số:");
		lblNewLabel_2.setBounds(6, 35, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("Tử số:");
		label.setBounds(224, 34, 61, 16);
		contentPane.add(label);
		
		JLabel lblMuS = new JLabel("Mẫu số:");
		lblMuS.setBounds(6, 63, 61, 16);
		contentPane.add(lblMuS);
		
		JLabel label_1 = new JLabel("Mẫu số:");
		label_1.setBounds(224, 62, 61, 16);
		contentPane.add(label_1);
		
		txtTuSo1 = new JTextField();
		txtTuSo1.setBounds(68, 30, 72, 26);
		contentPane.add(txtTuSo1);
		txtTuSo1.setColumns(10);
		
		txtMauSo1 = new JTextField();
		txtMauSo1.setColumns(10);
		txtMauSo1.setBounds(68, 58, 72, 26);
		contentPane.add(txtMauSo1);
		
		txtTuSo2 = new JTextField();
		txtTuSo2.setColumns(10);
		txtTuSo2.setBounds(283, 30, 72, 26);
		contentPane.add(txtTuSo2);
		
		txtMauSo2 = new JTextField();
		txtMauSo2.setColumns(10);
		txtMauSo2.setBounds(283, 58, 72, 26);
		contentPane.add(txtMauSo2);
		
		JLabel lblNewLabel_3 = new JLabel("Kết quả");
		lblNewLabel_3.setBounds(17, 131, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(81, 126, 72, 26);
		contentPane.add(txtKetQua);
		
		JComboBox cbbPhepTinh = new JComboBox();
		cbbPhepTinh.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
		cbbPhepTinh.setBounds(152, 35, 60, 27);
		contentPane.add(cbbPhepTinh);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int tuSo1 = Integer.parseInt(txtTuSo1.getText());
				int mauSo1 = Integer.parseInt(txtMauSo1.getText());
				PhanSo ps1 = new PhanSo(tuSo1, mauSo1);
				int tuSo2 = Integer.parseInt(txtTuSo2.getText());
				int mauSo2 = Integer.parseInt(txtMauSo2.getText());
				PhanSo ps2 = new PhanSo(tuSo2, mauSo2);
				String pheptoan = cbbPhepTinh.getSelectedItem().toString();
				txtKetQua.setText(String.valueOf((tinh(pheptoan, ps1, ps2).tuSo+" / "+tinh(pheptoan, ps1, ps2).mauSo)));
			}
		});
		btnTinh.setBounds(66, 181, 117, 29);
		contentPane.add(btnTinh);
		
		JButton btnLamLai = new JButton("Làm lại");
		btnLamLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTuSo1.setText("");
				txtTuSo2.setText("");
				txtMauSo1.setText("");
				txtMauSo2.setText("");
			}
		});
		btnLamLai.setBounds(195, 181, 117, 29);
		contentPane.add(btnLamLai);
		
	}
}
