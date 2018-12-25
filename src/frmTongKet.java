import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
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
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class frmTongKet extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoTen;
	private JTextField txtTBHK1;
	private JTextField txtTBHK2;
	private JTable tblHocSinh;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable tblKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTongKet frame = new frmTongKet();
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
	public frmTongKet() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(160, 18, 173, 26);
		contentPane.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		JLabel lblHVTn = new JLabel("Họ và tên");
		lblHVTn.setBounds(29, 23, 79, 16);
		contentPane.add(lblHVTn);
		
		JLabel lblKhi = new JLabel("Khối lớp");
		lblKhi.setBounds(29, 55, 61, 16);
		contentPane.add(lblKhi);
		
		JLabel lblNewLabel = new JLabel("Điểm TB HK1");
		lblNewLabel.setBounds(29, 83, 101, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblimTbHk = new JLabel("Điểm TB HK2");
		lblimTbHk.setBounds(29, 111, 101, 16);
		contentPane.add(lblimTbHk);
		
		JComboBox cbbKhoi = new JComboBox();
		cbbKhoi.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		cbbKhoi.setBounds(160, 51, 101, 27);
		contentPane.add(cbbKhoi);
		
		txtTBHK1 = new JTextField();
		txtTBHK1.setBounds(160, 78, 130, 26);
		contentPane.add(txtTBHK1);
		txtTBHK1.setColumns(10);
		
		txtTBHK2 = new JTextField();
		txtTBHK2.setBounds(160, 106, 130, 26);
		contentPane.add(txtTBHK2);
		txtTBHK2.setColumns(10);
		
		tblHocSinh = new JTable();
		tblHocSinh.setBounds(29, 232, 398, -68);
		contentPane.add(tblHocSinh);
		
		JButton btnAdd = new JButton("Thêm mới");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoten = txtHoTen.getText();
				int khoi = Integer.parseInt(cbbKhoi.getSelectedItem().toString()); 
				double tbhk1 = Double.parseDouble(txtTBHK1.getText());
				double tbhk2 = Double.parseDouble(txtTBHK2.getText());
				try (DataOutputStream out = new DataOutputStream(
						new BufferedOutputStream(new FileOutputStream("src/Bai4/tongketnamhoc.txt", true)))) {
						out.writeUTF(hoten);
						out.writeInt(khoi);
						out.writeDouble(tbhk1);
						out.writeDouble(tbhk2);
						JOptionPane.showMessageDialog(rootPane, "Kết quả của học sinh đã được ghi."); 
						out.close();  
						} catch (FileNotFoundException ex) {
							Logger.getLogger(frmTongKet.class.getName()).log(Level.SEVERE,
									null, ex);
						} catch (IOException ex) {
							Logger.getLogger(frmTongKet.class.getName()).log(Level.SEVERE, null, ex);
								}
						
			}
		});
		btnAdd.setBounds(327, 18, 117, 29);
		contentPane.add(btnAdd);
		
		JButton btnContinue = new JButton("Tiếp tục");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				txtHoTen.setText("");
				txtTBHK1.setText("");
				txtTBHK2.setText("");
			
			}
		});
		btnContinue.setBounds(327, 50, 117, 29);
		contentPane.add(btnContinue);
		
		JButton btnOpen = new JButton("Đọc danh sách");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String hoten;
				double tbhk1; 
				double tbhk2; 
				double tbcn; 
				int khoi;
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("Họ và tên"); 
				model.addColumn("Khối"); 
				model.addColumn("TB HK1"); 
				model.addColumn("TB HK2"); 
				model.addColumn("TB cả năm");
				try (DataInputStream in = new DataInputStream(new 
						BufferedInputStream(new FileInputStream("src/tongketnamhoc.txt")))){
					while (true) {
						hoten = in.readUTF();
						khoi = in.readInt();
						tbhk1 = in.readDouble();
						tbhk2 = in.readDouble();
						tbcn = (tbhk1 + tbhk2 * 2) / 3;
						DecimalFormat df = new DecimalFormat("###.##");
						tbcn = Double.parseDouble(df.format(tbcn));
						model.addRow(new Object[]{hoten, khoi, tbhk1, tbhk2, tbcn});
					}
				}catch (EOFException e) {
				}catch (FileNotFoundException ex) { Logger.getLogger(frmTongKet.class.getName()).log(Level.SEVERE, null, ex);
				} catch (IOException ex) {
					Logger.getLogger(frmTongKet.class.getName()).log(Level.SEVERE, null, ex);
				}
				tblKetQua.setModel(model);
				}
			
		});
		btnOpen.setBounds(327, 78, 117, 29);
		contentPane.add(btnOpen);
		
		JButton btnReport = new JButton("Thống kê");
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String hoten;
				double tbhk1; 
				double tbhk2; 
				double tbcn; 
				int khoi;
				int soHSGioi = 0;
				int soHSKha = 0;
				int soHSTBKhaTB = 0;
				int soHSYeuKem = 0;
				try (DataInputStream in = new DataInputStream(new 
						BufferedInputStream(new FileInputStream("src/tongketnamhoc.txt")))) {
					while (true) {
						hoten = in.readUTF();
						khoi = in.readInt();
						tbhk1 = in.readDouble(); tbhk2 = in.readDouble();
						tbcn = (tbhk1 + tbhk2 * 2) / 3; if (tbcn >= 8) {
						soHSGioi++;
						} else if (tbcn >= 7 && tbcn < 8) {
						soHSKha++;
						} else if (tbcn >= 5 && tbcn < 7) {
						soHSTBKhaTB++;
						} else {
						soHSYeuKem++; 
						}
					}
				}catch (EOFException e) {
				}catch (FileNotFoundException ex) {
					Logger.getLogger(frmTongKet.class.getName()).log(Level.SEVERE, null, ex);
				} catch (IOException ex) {
					Logger.getLogger(frmTongKet.class.getName()).log(Level.SEVERE, null, ex);
				}
				String ketQua = "Số HS giỏi: " + soHSGioi + "\n Số HS khá: " + soHSKha + "\n Số HS TB khá & TB: " + soHSTBKhaTB + "\n Số HS yếu & kém: " + soHSYeuKem;
				JOptionPane.showMessageDialog(rootPane, ketQua, "Thống kê", 1);
			}
		});
		btnReport.setBounds(327, 111, 117, 29);
		contentPane.add(btnReport);
		
		tblKetQua = new JTable();
		tblKetQua.setBounds(55, 238, 153, -74);
		contentPane.add(tblKetQua);
		
	}
}
