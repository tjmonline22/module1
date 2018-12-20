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

public class Bai2_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtGiaTriA;
	private JTextField txtNhapb;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_1 frame = new Bai2_1();
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
	public Bai2_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGPT = new JLabel("Giải phương trình ax +b = 0");
		lblGPT.setBounds(74, 32, 194, 16);
		contentPane.add(lblGPT);
		
		JLabel lblNhapa = new JLabel("Nhập a:");
		lblNhapa.setBounds(74, 75, 61, 16);
		contentPane.add(lblNhapa);
		
		JLabel lblNhapb = new JLabel("Nhập b:");
		lblNhapb.setBounds(74, 119, 61, 16);
		contentPane.add(lblNhapb);
		
		txtGiaTriA = new JTextField();
		txtGiaTriA.setBounds(138, 70, 130, 26);
		contentPane.add(txtGiaTriA);
		txtGiaTriA.setColumns(10);
		
		txtNhapb = new JTextField();
		txtNhapb.setBounds(138, 114, 130, 26);
		contentPane.add(txtNhapb);
		txtNhapb.setColumns(10);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setBounds(74, 164, 61, 16);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(138, 159, 130, 26);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float giaTriA = Integer.parseInt(txtGiaTriA.getText());
				float giaTriB = Integer.parseInt(txtNhapb.getText());
				float x = - (giaTriB / giaTriA);
				txtKetQua.setText(String.valueOf(x));
			}
		});
		btnTinh.setBounds(74, 214, 117, 29);
		contentPane.add(btnTinh);
		
		JButton btnNhapLai = new JButton("Nhập lại");
		btnNhapLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtGiaTriA.setText(null);
				txtNhapb.setText(null);
				txtKetQua.setText(null);
			}
		});
		btnNhapLai.setBounds(193, 214, 117, 29);
		contentPane.add(btnNhapLai);
	}

}
