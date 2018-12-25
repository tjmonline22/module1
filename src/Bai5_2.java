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

public class Bai5_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtTong;
	private JTextField txtX;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5_2 frame = new Bai5_2();
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
	public Bai5_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhpN = new JLabel("Nhập n:");
		lblNhpN.setBounds(40, 6, 61, 16);
		contentPane.add(lblNhpN);
		
		JLabel lblNewLabel = new JLabel("Mảng được phát sinh");
		lblNewLabel.setBounds(40, 63, 135, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblTng = new JLabel("Tổng mảng");
		lblTng.setBounds(40, 147, 96, 16);
		contentPane.add(lblTng);
		
		txtX = new JTextField();
		txtX.setBounds(187, 30, 130, 26);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập x\u0000:");
		lblNewLabel_1.setBounds(40, 35, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		txtN = new JTextField();
		txtN.setBounds(187, 6, 130, 26);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JTextArea txtMang = new JTextArea();
		txtMang.setEditable(false);
		txtMang.setBounds(187, 63, 193, 66);
		contentPane.add(txtMang);
		
		txtTong = new JTextField();
		txtTong.setEditable(false);
		txtTong.setBounds(187, 142, 130, 26);
		contentPane.add(txtTong);
		txtTong.setColumns(10);
		
		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(187, 175, 193, 66);
		contentPane.add(txtKetQua);
		
		JButton btnTinhTong = new JButton("Tìm kiếm");
		btnTinhTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtN.getText());
				int x = Integer.parseInt(txtX.getText());
				int[] mang = mang(n);
				txtMang.setText(mangChuoi(mang));
				txtTong.setText(String.valueOf(tong(mang)));
				String kq = "";
				int tim = timX(x, mang);
				kq += (tim == -1)? "Không tìm thấy" : "Tìm thấy tại vị trí " + tim;
				kq += "\n";
				kq += (xLonHon(x, mang))? "X lớn hơn tất cả" : "X không lớn hơn tất cả";
				kq += "\n";
				kq += "X nhỏ hơn: " + xNhoHon(x, mang);
				txtKetQua.setText(kq); 
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
			
			private int timX(int x, int[] mang){ 
				int vitri = -1;
				for(int i = 0; i <mang.length; i++){ 
					if(x==mang[i]){
						vitri = i;
						break; 
					}
				}
				return vitri; 
			}
			
			private boolean xLonHon(int x, int[] mang ){ 
				boolean flag = true;
				for(int i : mang){
					if (x <= i) { 
						flag = false;
						break; 
						}
				}
				return flag; 
				}
	
			private String xNhoHon(int x, int[] mang){ 
				String kq = "";
				for(int i : mang){
					if(x < i ) kq += i + " ";
			}
				return kq; 
			}
		});
		
		JLabel lblKtQaTm = new JLabel("Kết qủa tìm kiếm");
		lblKtQaTm.setBounds(40, 175, 107, 16);
		contentPane.add(lblKtQaTm);
			
		btnTinhTong.setBounds(187, 243, 117, 29);
		contentPane.add(btnTinhTong);
	}
}
