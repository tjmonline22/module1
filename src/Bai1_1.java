import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai1_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai1_1 frame = new Bai1_1();
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
	public Bai1_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblHoTen = new JLabel("Nhập họ tên");
		lblHoTen.setBounds(43, 80, 88, 16);
		contentPane.add(lblHoTen);

		
		
		textField = new JTextField();
		textField.setBounds(130, 80, 175, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCauChao = new JLabel("");
		lblCauChao.setBounds(43, 125, 307, 16);
		contentPane.add(lblCauChao);
		
		JButton btnXuat = new JButton("Xuất lời chào");
		btnXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCauChao.setText("Chào bạn " + textField.getText() + ", chào mừng bạn đến với ngôn ngủ lập trình java" );
			}
		});
		btnXuat.setBounds(130, 144, 117, 29);
		contentPane.add(btnXuat);
	}
}
