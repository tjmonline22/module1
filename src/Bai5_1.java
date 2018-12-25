import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Bai5_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtTong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5_1 frame = new Bai5_1();
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
	public Bai5_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpN = new JLabel("Nhập n:");
		lblNhpN.setBounds(40, 35, 61, 16);
		contentPane.add(lblNhpN);
		
		JLabel lblNewLabel = new JLabel("Mảng được phát sinh");
		lblNewLabel.setBounds(40, 63, 135, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblTng = new JLabel("Tổng");
		lblTng.setBounds(40, 147, 61, 16);
		contentPane.add(lblTng);
		
		txtN = new JTextField();
		txtN.setBounds(180, 30, 130, 26);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JTextArea txtMang = new JTextArea();
		txtMang.setEditable(false);
		txtMang.setBounds(187, 63, 193, 66);
		contentPane.add(txtMang);
		
		txtTong = new JTextField();
		txtTong.setEditable(false);
		txtTong.setBounds(180, 142, 130, 26);
		contentPane.add(txtTong);
		txtTong.setColumns(10);
		
		JButton btnTinhTong = new JButton("Tính tổng");
		btnTinhTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtN.getText());
				int[] mang = mang(n);
				txtMang.setText(mangChuoi(mang));
				txtTong.setText(String.valueOf(tong(mang)));
			}
			private int[] mang(int n){
				int[] mang = new int[n];
				Random random = new Random();
				for(int i = 0; i < n; i++){
					mang[i] = random.nextInt(100);
					}
					return mang;
			}
			private String mangChuoi(int[] mang){ 
				String chuoi = "";
				for(int i : mang ){ 
					chuoi+=i+" ";
				}
			return chuoi; 
			}
			private int tong(int[] mang){ 
				int tong = 0;
				for(int i : mang){ 
					tong += i;
			}
			return tong; 
			}
		});
			
			
		btnTinhTong.setBounds(180, 191, 117, 29);
		contentPane.add(btnTinhTong);
	}
}
