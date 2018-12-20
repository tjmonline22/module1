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

public class Bai2_4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtChuoiSb;
	private JTextField txtChuoiSb1;
	private JTextField txtChuoiSb2;
	private JTextField txtViTri;
	private JTextField txtBatDau;
	private JTextField txtKetThuc;
	private JTextField txtaResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_4 frame = new Bai2_4();
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
	public Bai2_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChuoisb = new JLabel("Chuỗi sb");
		lblChuoisb.setBounds(27, 18, 68, 16);
		contentPane.add(lblChuoisb);
		
		txtChuoiSb = new JTextField();
		txtChuoiSb.setBounds(135, 13, 130, 26);
		contentPane.add(txtChuoiSb);
		txtChuoiSb.setColumns(10);
		
		JLabel lblChuoisb1 = new JLabel("Chuỗi sb1");
		lblChuoisb1.setBounds(27, 61, 68, 16);
		contentPane.add(lblChuoisb1);
		
		txtChuoiSb1 = new JTextField();
		txtChuoiSb1.setBounds(135, 56, 130, 26);
		contentPane.add(txtChuoiSb1);
		txtChuoiSb1.setColumns(10);
		
		JLabel lblChuoisb2 = new JLabel("Chuỗi sb2");
		lblChuoisb2.setBounds(27, 101, 68, 16);
		contentPane.add(lblChuoisb2);
		
		txtChuoiSb2 = new JTextField();
		txtChuoiSb2.setBounds(135, 96, 130, 26);
		contentPane.add(txtChuoiSb2);
		txtChuoiSb2.setColumns(10);
		
		JLabel lblViTri = new JLabel("Vị trí chèn");
		lblViTri.setBounds(27, 144, 79, 16);
		contentPane.add(lblViTri);
		
		txtViTri = new JTextField();
		txtViTri.setBounds(135, 139, 130, 26);
		contentPane.add(txtViTri);
		txtViTri.setColumns(10);
		
		JLabel lblViTriDau = new JLabel("Vị trí đầu");
		lblViTriDau.setBounds(27, 186, 68, 16);
		contentPane.add(lblViTriDau);
		
		txtBatDau = new JTextField();
		txtBatDau.setBounds(135, 181, 130, 26);
		contentPane.add(txtBatDau);
		txtBatDau.setColumns(10);
		
		JLabel lblViTriCuoi = new JLabel("Vị trí cuối");
		lblViTriCuoi.setBounds(27, 231, 79, 16);
		contentPane.add(lblViTriCuoi);
		
		txtKetThuc = new JTextField();
		txtKetThuc.setBounds(135, 226, 130, 26);
		contentPane.add(txtKetThuc);
		txtKetThuc.setColumns(10);
		
		JLabel lblKetQua = new JLabel("Kết quả");
		lblKetQua.setBounds(34, 303, 61, 16);
		contentPane.add(lblKetQua);
		
		txtaResult = new JTextField();
		txtaResult.setBounds(135, 298, 245, 198);
		contentPane.add(txtaResult);
		txtaResult.setColumns(10);
		
		JButton btnXuLy = new JButton("Xử lý chuỗi");
		btnXuLy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sb = txtChuoiSb.getText(); 
				String sb1 = txtChuoiSb1.getText(); 
				String sb2 = txtChuoiSb2.getText();
				int viTri = Integer.parseInt(txtViTri.getText());
				int batDau = Integer.parseInt(txtBatDau.getText()); 
				int ketThuc = Integer.parseInt(txtKetThuc.getText());
				String ketQua = "Kết quả:";
				StringBuilder str = new StringBuilder(); 
				str.append(sb);
				ketQua += "\n Chuỗi sb: " + str;
				ketQua += "\n Chiều dài: " + str.length(); 
				str.append(sb1);
				ketQua += "\n Chuỗi sau khi nối sb1: " + str;
				ketQua += "\n Chiều dài: " + str.length();
				str.insert(viTri, sb2);
				ketQua += "\n Sau khi chèn sb2 vào vị trí " + viTri + ": \n" + str; 
				str.delete(batDau, ketThuc);
				ketQua += "\n Sau khi xóa: \n" + str; 
				str.reverse();
				ketQua += "\n Sau khi đảo ngược: \n" + str;
				txtaResult.setText(ketQua);
			}
		});
		btnXuLy.setBounds(135, 261, 117, 29);
		contentPane.add(btnXuLy);
		
		
	}

}
