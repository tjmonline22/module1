import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai3_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTen;
	private JTextField txtDtdd;
	private JTextField txtHinhAnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai3_1 frame = new Bai3_1();
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
	public Bai3_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThngTinLin = new JLabel("Thông tin liên hệ");
		lblThngTinLin.setBounds(39, 6, 134, 16);
		contentPane.add(lblThngTinLin);
		
		JLabel lblHoten = new JLabel("Họ tên");
		lblHoten.setBounds(23, 34, 61, 16);
		contentPane.add(lblHoten);
		
		JLabel lblDtdd = new JLabel("DTDD");
		lblDtdd.setBounds(23, 62, 61, 16);
		contentPane.add(lblDtdd);
		
		txtTen = new JTextField();
		txtTen.setBounds(96, 29, 130, 26);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		txtDtdd = new JTextField();
		txtDtdd.setBounds(96, 57, 130, 26);
		contentPane.add(txtDtdd);
		txtDtdd.setColumns(10);
		
		JLabel lblHnhnh = new JLabel("Hình ảnh");
		lblHnhnh.setBounds(23, 90, 61, 16);
		contentPane.add(lblHnhnh);
		
		txtHinhAnh = new JTextField();
		txtHinhAnh.setBounds(96, 85, 130, 26);
		contentPane.add(txtHinhAnh);
		txtHinhAnh.setColumns(10);
		
		JLabel label = new JLabel("Họ tên");
		label.setBounds(23, 160, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("DTDD");
		label_1.setBounds(23, 187, 61, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Hình ảnh");
		label_2.setBounds(23, 210, 61, 16);
		contentPane.add(label_2);
		
		JLabel lblHienThiTen = new JLabel("");
		lblHienThiTen.setBounds(105, 164, 107, 16);
		contentPane.add(lblHienThiTen);
		
		JLabel lblHienThiDtdd = new JLabel("");
		lblHienThiDtdd.setBounds(105, 187, 107, 16);
		contentPane.add(lblHienThiDtdd);
		
		JLabel lblHinhAnh = new JLabel("");
		lblHinhAnh.setBounds(115, 210, 134, 51);
		contentPane.add(lblHinhAnh);
		
		JButton btnHienThi = new JButton("Hiển thị");
		btnHienThi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ten = txtTen.getText();
				String dtdd = txtDtdd.getText();
				String hinh = txtHinhAnh.getText();
				if (dtdd.matches("^\\d+(\\.\\d+)?")) {
					lblHienThiDtdd.setText(dtdd);
				} else {
					JOptionPane.showMessageDialog(null, "số điện thoại sai");
					txtDtdd.setText("");
				}
				if (ten.matches("^\\D+(\\.\\D+)?")) {
					lblHienThiTen.setText(ten);
				} else {
					JOptionPane.showMessageDialog(null, "tên không hợp lệ");
					txtTen.setText("");
				};
				ImageIcon icon = new ImageIcon(hinh); 
				lblHinhAnh.setIcon(icon);
			}
		});
		btnHienThi.setBounds(95, 123, 117, 29);
		contentPane.add(btnHienThi);
		
	}
}
