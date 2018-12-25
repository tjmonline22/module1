import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai3_5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai3_5 frame = new Bai3_5();
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
	public Bai3_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImage = new JLabel("New label");
		lblImage.setBounds(180, 17, 221, 205);
		contentPane.add(lblImage);
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon myImageIcon= new ImageIcon("src/images/Frog.jpg");
				lblImage.setIcon(myImageIcon);
			}
		});
		btn1.setIcon(new ImageIcon("src/images/Frog.jpg"));
		btn1.setBounds(6, 0, 117, 89);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon myImageIcon= new ImageIcon("src/images/iMacPro5.jpg");
				lblImage.setIcon(myImageIcon);
			}
		});
		btn2.setIcon(new ImageIcon("src/images/iMacPro5.jpg"));
		btn2.setBounds(6, 90, 117, 61);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setBounds(6, 163, 117, 71);
		contentPane.add(btn3);
	}
}
