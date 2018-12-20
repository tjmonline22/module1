import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.naming.InsufficientResourcesException;
import javax.print.CancelablePrintJob;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.concurrent.LinkedBlockingDeque;
import java.awt.event.ActionEvent;

public class Bai2_7 extends JFrame {

	private JPanel contentPane;
	private JTextField txtYear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_7 frame = new Bai2_7();
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
	public Bai2_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Year of birth");
		lblNewLabel.setBounds(37, 38, 78, 16);
		contentPane.add(lblNewLabel);
		
		txtYear = new JTextField();
		txtYear.setBounds(133, 33, 130, 26);
		contentPane.add(txtYear);
		txtYear.setColumns(10);
		
		JLabel lblCan = new JLabel("Can");
		lblCan.setBounds(165, 138, 36, 16);
		contentPane.add(lblCan);
		
		JLabel lblChi = new JLabel("Chi");
		lblChi.setBounds(202, 138, 61, 16);
		contentPane.add(lblChi);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int year;
		        String can = "", chi = "";
		        year = Integer.parseInt(txtYear.getText());
		         
		        // Xác định Can
		        switch (year % 10) {
		            case 0:
		                can = "Canh";
		                break;
		            case 1:
		                can = "Tân";
		                break;
		            case 2:
		                can = "Nhâm";
		                break;
		            case 3:
		                can = "Quý";
		                break;
		            case 4:
		                can = "Giáp";
		                break;
		            case 5:
		                can = "Ất";
		                break;
		            case 6:
		                can = "Bính";
		                break;
		            case 7:
		                can = "Đinh";
		                break;
		            case 8:
		                can = "Mậu";
		                break;
		            case 9:
		                can = "Kỷ";
		                break;
		        }
		         
		        // Xác định Chi
		        switch (year % 12) {
		            case 0:
		                chi = "Thân";
		                break;
		            case 1:
		                chi = "Dậu";
		                break;
		            case 2:
		                chi = "Tuất";
		                break;
		            case 3:
		                chi = "Hợi";
		                break;
		            case 4:
		                chi = "Tý";
		                break;
		            case 5:
		                chi = "Sửu";
		                break;
		            case 6:
		                chi = "Dần";
		                break;
		            case 7:
		                chi = "Mẹo";
		                break;
		            case 8:
		                chi = "Thìn";
		                break;
		            case 9:
		                chi = "Tỵ";
		                break;
		            case 10:
		                chi = "Ngọ";
		                break;
		            case 11:
		                chi = "Mùi";
		                break;
		        }
		         
			lblCan.setText(can);
			lblChi.setText(chi);
			}
			
		});
		btnNewButton.setBounds(146, 79, 117, 29);
		contentPane.add(btnNewButton);
		
		
	}

}
