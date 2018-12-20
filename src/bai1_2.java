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

public class bai1_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtSoNguyenThu1;
	private JTextField txtSoNguyenThu2;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai1_2 frame = new bai1_2();
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
	public bai1_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSoNguyenThu1 = new JLabel("Số nguyên thứ nhất:");
		lblSoNguyenThu1.setBounds(19, 42, 145, 16);
		contentPane.add(lblSoNguyenThu1);
		
		JLabel lblSoNguyenThu2 = new JLabel("Số nguyên thứ hai:");
		lblSoNguyenThu2.setBounds(19, 93, 120, 16);
		contentPane.add(lblSoNguyenThu2);
		
		JLabel lblKetQua = new JLabel("Tổng");
		lblKetQua.setBounds(65, 152, 61, 16);
		contentPane.add(lblKetQua);
		
		txtSoNguyenThu1 = new JTextField();
		txtSoNguyenThu1.setBounds(176, 37, 130, 26);
		contentPane.add(txtSoNguyenThu1);
		txtSoNguyenThu1.setColumns(10);
		
		txtSoNguyenThu2 = new JTextField();
		txtSoNguyenThu2.setBounds(176, 88, 130, 26);
		contentPane.add(txtSoNguyenThu2);
		txtSoNguyenThu2.setColumns(10);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(176, 147, 130, 26);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
		
		JButton btnTinhTong = new JButton("Tổng");
		btnTinhTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtSoNguyenThu1.getText());
				int b = Integer.parseInt(txtSoNguyenThu2.getText());
				int tong = a + b;
				txtKetQua.setText(String.valueOf(tong));
			}
		});
		btnTinhTong.setBounds(178, 206, 117, 29);
		contentPane.add(btnTinhTong);
	}

}
