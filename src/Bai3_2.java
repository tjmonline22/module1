import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Bai3_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtTen;
	private JTextField txtDtdd;
	private JTextField fchHinhAnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai3_2 frame = new Bai3_2();
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
	public Bai3_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thêm mới liên hệ");
		lblNewLabel.setBounds(50, 22, 146, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ tên");
		lblNewLabel_1.setBounds(50, 56, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ĐTDD");
		lblNewLabel_2.setBounds(50, 92, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hình ảnh");
		lblNewLabel_3.setBounds(50, 143, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		txtTen = new JTextField();
		txtTen.setBounds(144, 50, 130, 26);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		txtDtdd = new JTextField();
		txtDtdd.setBounds(144, 87, 130, 26);
		contentPane.add(txtDtdd);
		txtDtdd.setColumns(10);
		
		fchHinhAnh = new JTextField();
		fchHinhAnh.setBounds(144, 138, 130, 26);
		contentPane.add(fchHinhAnh);
		fchHinhAnh.setColumns(10);
		
		JLabel lblHinhAnh = new JLabel("");
		lblHinhAnh.setBounds(330, 60, 93, 48);
		contentPane.add(lblHinhAnh);
		
		
		JButton btnThem = new JButton("Thêm liên hệ");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ten = txtTen.getText();
				String dtdd = txtDtdd.getText();
				if (!dtdd.matches("^\\d+(\\.\\d+)?")) {
					JOptionPane.showMessageDialog(null, "số điện thoại sai");
					txtDtdd.setText("");
				}
				if (!ten.matches("^\\D+(\\.\\D+)?")) {
					JOptionPane.showMessageDialog(null, "tên không hợp lệ");
					txtTen.setText("");
				}
			}
			});
		btnThem.setBounds(136, 193, 117, 29);
		contentPane.add(btnThem);
		
		JButton btnFileChoose = new JButton("...");
		btnFileChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				int returnValue = jfc.showOpenDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc.getSelectedFile();
					fchHinhAnh.setText(selectedFile.getAbsolutePath());
				
				ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath()); 
				lblHinhAnh.setIcon(icon);
		
				}
			}
		});
		btnFileChoose.setBounds(286, 138, 38, 29);
		contentPane.add(btnFileChoose);
		
		
		}
}
		
	
