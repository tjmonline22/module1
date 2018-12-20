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

public class Bai2_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtGiaTriX;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_2 frame = new Bai2_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private Long tinhGiaiThua(int x){ 
		Long kq = 1l;				
		
		if(x < 0){
		return -1l;
		}
		for(int i = 1; i <= x; i++){ kq = kq * i;
		}
		
		return kq; 
	} 
	/**
	 * Create the frame.
	 */
	public Bai2_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tính gia thừa của x");
		lblNewLabel.setBounds(74, 30, 169, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập x:");
		lblNewLabel_1.setBounds(69, 77, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblKetQua = new JLabel("Kết Quả:");
		lblKetQua.setBounds(69, 123, 80, 16);
		contentPane.add(lblKetQua);
		
		txtGiaTriX = new JTextField();
		txtGiaTriX.setBounds(179, 72, 130, 26);
		contentPane.add(txtGiaTriX);
		txtGiaTriX.setColumns(10);
		
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(txtGiaTriX.getText());
				Long  ketQua = tinhGiaiThua(x);
				txtKetQua.setText(String.valueOf(ketQua));
			}
			
		});
		btnTinh.setBounds(96, 175, 117, 29);
		contentPane.add(btnTinh);
		
		JButton btnNhapLai = new JButton("Nhập lại");
		btnNhapLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtGiaTriX.setText(null);
				txtKetQua.setText(null);
			}
		});
		btnNhapLai.setBounds(248, 175, 117, 29);
		contentPane.add(btnNhapLai);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(179, 118, 130, 26);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}

}
