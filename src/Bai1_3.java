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

public class Bai1_3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtSoLuong뀀;
	private JTextField txtDonGia;
	private JTextField txtThanhTien;
	private JTextField txtSoLuong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai1_3 frame = new Bai1_3();
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
	public Bai1_3() {
		setTitle("Tính giá trị hoá đơn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTnhGiTr = new JLabel("Tính giá trị hoá đơn");
		lblTnhGiTr.setBounds(90, 22, 141, 16);
		contentPane.add(lblTnhGiTr);
		
		JLabel lblSoLuong = new JLabel("Số lượng:");
		lblSoLuong.setBounds(39, 68, 61, 16);
		contentPane.add(lblSoLuong);
		
		JLabel lblDonGia = new JLabel("Đơn Giá:");
		lblDonGia.setBounds(39, 106, 61, 16);
		contentPane.add(lblDonGia);
		
		JLabel lblThanhTien = new JLabel("Thành Tiền:");
		lblThanhTien.setBounds(39, 151, 80, 16);
		contentPane.add(lblThanhTien);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setBounds(128, 63, 130, 26);
		contentPane.add(txtSoLuong);
		txtSoLuong.setColumns(10);
		
		txtDonGia = new JTextField();
		txtDonGia.setBounds(128, 101, 130, 26);
		contentPane.add(txtDonGia);
		txtDonGia.setColumns(10);
		
		txtThanhTien = new JTextField();
		txtThanhTien.setEditable(false);
		txtThanhTien.setBounds(128, 141, 130, 26);
		contentPane.add(txtThanhTien);
		txtThanhTien.setColumns(10);
		
		JButton btnTinhTien = new JButton("Tính Tiền");
		btnTinhTien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int soLuong = Integer.parseInt(txtSoLuong.getText());
				int donGia = Integer.parseInt(txtDonGia.getText());
				int thanhTien = soLuong * donGia;
				txtThanhTien.setText(String.valueOf(thanhTien));
				
			}
		});
		btnTinhTien.setBounds(128, 199, 117, 29);
		contentPane.add(btnTinhTien);
		
	}

}
