package images;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class frmNhatKy extends JFrame {

	private JPanel contentPane;
	private JTextField txtNgay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmNhatKy frame = new frmNhatKy();
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
	public frmNhatKy() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNgygi = new JLabel("Ngày-giờ");
		lblNgygi.setBounds(162, 6, 76, 16);
		contentPane.add(lblNgygi);
		
		JTextArea txtaNoiDung = new JTextArea();
		txtaNoiDung.setBounds(146, 45, 287, 212);
		contentPane.add(txtaNoiDung);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		txtNgay.setText(dateFormat.format(date)); 
		txtaNoiDung.setEditable(true); 
		txtaNoiDung.setText("");
		
		txtNgay = new JTextField();
		txtNgay.setBounds(233, 1, 200, 26);
		contentPane.add(txtNgay);
		txtNgay.setColumns(10);
		
		JButton btnOpen = new JButton("Đọc");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String nhatKy = "";
				String ngay;
				String noiDung;
				try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/daily.txt")))) {
				while (true) {
				ngay = in.readUTF();
				noiDung = in.readUTF();
				nhatKy += ngay + "\n" + noiDung + "\n\n";
				}
				} catch (EOFException e) {
				} catch (IOException ex) { 
					Logger.getLogger(frmNhatKy.class.getName()).log(Level.SEVERE, null, ex);
				} 
				txtaNoiDung.setText(nhatKy); txtaNoiDung.setEditable(false);
			}
		});
		btnOpen.setBounds(6, 40, 117, 59);
		contentPane.add(btnOpen);
		
		JButton btnNew = new JButton("Viết");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				Date date = new Date(); txtNgay.setText(dateFormat.format(date)); 
				txtaNoiDung.setEditable(true); 
				txtaNoiDung.setText("");
			}
		});
		btnNew.setBounds(6, 111, 117, 56);
		contentPane.add(btnNew);
		
		JButton btnSave = new JButton("GHi");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ngay = txtNgay.getText();
				String noiDung = txtaNoiDung.getText();
				try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream (new FileOutputStream("src/daily.txt", true)))) {
				out.writeUTF(ngay);
				out.writeUTF(noiDung); JOptionPane.showMessageDialog(rootPane, "Nhật ký đa được ghi.");
				out.close();
				} catch (FileNotFoundException ex) { 
					Logger.getLogger(frmNhatKy.class.getName()).log(Level.SEVERE, null, ex);
				} catch (IOException ex) { 
					Logger.getLogger(frmNhatKy.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
		btnSave.setBounds(6, 179, 117, 64);
		contentPane.add(btnSave);
	}

}
