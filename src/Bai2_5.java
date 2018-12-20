import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class Bai2_5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoTen;
	private JTextField txtHo;
	private JTextField txtTenDem;
	private JTextField txtTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_5 frame = new Bai2_5();
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
	public Bai2_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Họ và Tên");
		lblNewLabel.setBounds(40, 27, 74, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ");
		lblNewLabel_1.setBounds(40, 77, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tên đệm");
		lblNewLabel_2.setBounds(40, 128, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tên");
		lblNewLabel_3.setBounds(40, 180, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(126, 22, 130, 26);
		contentPane.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		txtHo = new JTextField();
		txtHo.setBounds(126, 72, 130, 26);
		contentPane.add(txtHo);
		txtHo.setColumns(10);
		
		txtTenDem = new JTextField();
		txtTenDem.setBounds(126, 123, 130, 26);
		contentPane.add(txtTenDem);
		txtTenDem.setColumns(10);
		
		txtTen = new JTextField();
		txtTen.setBounds(126, 175, 130, 26);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		JButton btnTach = new JButton("Tách họ tên");
		btnTach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoTen = txtHoTen.getText();
				String ho;
				String tenDem;
				String ten;
				StringTokenizer st = new StringTokenizer(hoTen);
				txtHo.setText(st.nextToken());
				int count = st.countTokens() - 1;
				
				for(int i = 0; i < count; i++) {
					tenDem = st.nextToken();
					tenDem = tenDem + st.nextToken() + " "; 
					txtTenDem.setText(tenDem);
				} 
				 
				txtTen.setText(st.nextToken());
				
			}
		});
		btnTach.setBounds(139, 216, 117, 29);
		contentPane.add(btnTach);
		
	}

}
