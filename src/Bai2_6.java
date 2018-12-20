import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Dialog.ModalExclusionType;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai2_6 extends JFrame {

	private JPanel contentPane;
	private JTextField txtThang;
	private JTextField txtNamȺ;
	private JTextField txtKetQua;
	private JTextField txtNam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_6 frame = new Bai2_6();
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
	public Bai2_6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTinhngay = new JLabel("Tính số  ngày theo tháng");
		lblTinhngay.setBounds(71, 30, 193, 16);
		contentPane.add(lblTinhngay);
		
		JLabel lblNewLabel = new JLabel("Nhập tháng");
		lblNewLabel.setBounds(38, 58, 84, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập năm");
		lblNewLabel_1.setBounds(38, 99, 84, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả");
		lblNewLabel_2.setBounds(38, 138, 84, 16);
		contentPane.add(lblNewLabel_2);
		
		txtThang = new JTextField();
		txtThang.setBounds(134, 58, 130, 26);
		contentPane.add(txtThang);
		txtThang.setColumns(10);
		
		txtNam = new JTextField();
		txtNam.setBounds(134, 94, 130, 26);
		contentPane.add(txtNam);
		txtNam.setColumns(10);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(134, 133, 130, 26);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int thang = Integer.parseInt(txtThang.getText());
			int nam = Integer.parseInt(txtNam.getText());
			int ketQua;
			switch (thang) {
				case 1: case 3: case 5: case 6: case 8: case 10: case 12:  
					ketQua = 31;
					txtKetQua.setText(String.valueOf(ketQua));
					break;
				case 2:
					if (((nam % 4) == 0) && ((nam % 100) == 0) || (nam % 400) == 0 ) {
						ketQua = 29;
						txtKetQua.setText(String.valueOf(ketQua));
						break;
					} else {
					  ketQua = 28;
					  txtKetQua.setText(String.valueOf(ketQua));
					  break;	
					}
				default: 
					ketQua = 30;
					txtKetQua.setText(String.valueOf(ketQua));
				
			}
			} 	
			});
		btnTinh.setBounds(113, 178, 117, 29);
		contentPane.add(btnTinh);
		
	}
}
