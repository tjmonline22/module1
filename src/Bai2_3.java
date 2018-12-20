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

public class Bai2_3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtChuoi1;
	private JTextField txtChuoi2;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_3 frame = new Bai2_3();
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
	public Bai2_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tìm kiếm chuỗi");
		lblNewLabel.setBounds(111, 42, 186, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblChuoi1 = new JLabel("Nhập chuỗi 1:");
		lblChuoi1.setBounds(45, 88, 88, 16);
		contentPane.add(lblChuoi1);
		
		JLabel lblChuoi2 = new JLabel("Nhập chuỗi 2:");
		lblChuoi2.setBounds(45, 127, 88, 16);
		contentPane.add(lblChuoi2);
		
		JLabel lblKetQua = new JLabel("Kết quả:");
		lblKetQua.setBounds(45, 172, 88, 16);
		contentPane.add(lblKetQua);
		
		txtChuoi1 = new JTextField();
		txtChuoi1.setBounds(156, 83, 130, 26);
		contentPane.add(txtChuoi1);
		txtChuoi1.setColumns(10);
		
		txtChuoi2 = new JTextField();
		txtChuoi2.setBounds(156, 122, 130, 26);
		contentPane.add(txtChuoi2);
		txtChuoi2.setColumns(10);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(156, 167, 130, 26);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chuoi1 = txtChuoi1.getText();
				String chuoi2 = txtChuoi2.getText();
				boolean ketQua;
				ketQua = chuoi1.contains(chuoi2);
				if (ketQua) txtKetQua.setText("Có");
				else txtKetQua.setText("Không");
			}
		});
		btnTimKiem.setBounds(156, 214, 117, 29);
		contentPane.add(btnTimKiem);
	}

}
