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

public class Bai5_3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai5_3 frame = new Bai5_3();
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
	public Bai5_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập n(dòng)");
		lblNewLabel.setBounds(30, 6, 96, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập m(cột)");
		lblNewLabel_1.setBounds(30, 38, 96, 16);
		contentPane.add(lblNewLabel_1);
		
		txtN = new JTextField();
		txtN.setBounds(138, 1, 130, 26);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		txtM = new JTextField();
		txtM.setBounds(138, 33, 130, 26);
		contentPane.add(txtM);
		txtM.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Mảng được phát sinh");
		lblNewLabel_2.setBounds(6, 97, 138, 16);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtMang = new JTextArea();
		txtMang.setWrapStyleWord(true);
		txtMang.setEditable(false);
		txtMang.setBounds(146, 97, 174, 67);
		contentPane.add(txtMang);
		
		JLabel lblNewLabel_3 = new JLabel("Kết quả xử lý");
		lblNewLabel_3.setBounds(6, 177, 109, 16);
		contentPane.add(lblNewLabel_3);
		
		JTextArea txtKetQua = new JTextArea();
		txtKetQua.setWrapStyleWord(true);
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(143, 176, 177, 96);
		contentPane.add(txtKetQua);
		
		JButton btnXuLy = new JButton("Xử lý倀");
		btnXuLy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtN.getText());
				int m = Integer.parseInt(txtM.getText());
				int[][] mang = mang(n, m);
				int[] mangKQ = xulyMangHaiChieu(mang);
				float tbchan = (float) mangKQ[2] / mangKQ[0];
				float tble = (float) mangKQ[3] / mangKQ[1];
				String kq = "";
				kq += "Số phần tử chẵn = " + mangKQ[0] + "\n";
				kq += "Số phần tử lẻ = " + mangKQ[1] + "\n";
				kq += "Trung bình chẵn = " + String.format("%.2f", tbchan) + "\n"; 
				kq += "Trung bình lẻ = " + String.format("%.2f", tble) + "\n";
				kq += "GT max = " + mangKQ[4] + "\n";
				kq += "GT min = " + mangKQ[5] + "\n";
				txtMang.setText(mangChuoi(mang));
				txtKetQua.setText(kq); 
				}
			private int[][] mang(int n, int m) { 
				int[][] mang = new int[n][m]; 
				Random random = new Random();
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						mang[i][j] = random.nextInt(100); 
					}
				}
				return mang; 
			}
			
			private String mangChuoi(int[][] mang) { 
				String chuoi = "";
				for (int i = 0; i < mang.length; i++) {
					for (int j = 0; j < mang[i].length; j++) {
						chuoi += mang[i][j] + " "; 
						}
						chuoi += "\n"; 		
				}
				return chuoi; 
				}
			
			private int[] xulyMangHaiChieu(int[][] mang) { 
				int[] mangKQ = new int[6];
				int soPTchan = 0;
				int soPTle = 0;	
				int tongchan = 0;
				int tongle = 0;
				int max = mang[0][0]; int min = mang[0][0];
				for (int i = 0; i < mang.length; i++) {
				for (int j = 0; j < mang[i].length; j++) {
				if (mang[i][j] % 2 == 0) { soPTchan++;
				tongchan += mang[i][j];
				}
				if (mang[i][j] % 2 != 0) {
				soPTle++;
				tongle += mang[i][j]; }
				if (max < mang[i][j]) { max = mang[i][j];
				}
				if (min > mang[i][j]) {
				min = mang[i][j]; }
				} }
				mangKQ[0] = soPTchan; 
				mangKQ[1] = soPTle; 
				mangKQ[2] = tongchan; 
				mangKQ[3] = tongle;
				mangKQ[4] = max; 
				mangKQ[5] = min; 
				return mangKQ;

			}
		});
		btnXuLy.setBounds(136, 56, 117, 29);
		contentPane.add(btnXuLy);
	}

}
