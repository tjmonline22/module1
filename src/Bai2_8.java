import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai2_8 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2_8 frame = new Bai2_8();
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
	public Bai2_8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your height(m)");
		lblNewLabel.setBounds(56, 32, 101, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblYourWeightkg = new JLabel("Your weight(kg)");
		lblYourWeightkg.setBounds(56, 75, 101, 16);
		contentPane.add(lblYourWeightkg);
		
		JLabel lblBmi = new JLabel("0");
		lblBmi.setBackground(Color.GREEN);
		lblBmi.setOpaque(true);
		lblBmi.setBounds(215, 172, 72, 52);
		contentPane.add(lblBmi);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 70, 130, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(157, 27, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCompute = new JButton("Compute BMI");
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCompute.setBounds(112, 132, 117, 29);
		contentPane.add(btnCompute);
	}
}
