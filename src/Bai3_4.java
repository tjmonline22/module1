import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class Bai3_4 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai3_4 frame = new Bai3_4();
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
	public Bai3_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnBai = new JMenu("bai 1");
		menuBar.add(mnBai);
		
		JMenu mnBai_1 = new JMenu("bai 2");
		menuBar.add(mnBai_1);
		
		JMenu mnBai_2 = new JMenu("bai 3");
		menuBar.add(mnBai_2);
		
		JMenu mnBai_3 = new JMenu("bai 4");
		menuBar.add(mnBai_3);
		
		JMenu mnBai_4 = new JMenu("bai 5");
		menuBar.add(mnBai_4);
		
		JMenu mnBai_5 = new JMenu("bai 6");
		menuBar.add(mnBai_5);
		
		JMenu mnBai_6 = new JMenu("bai 7");
		menuBar.add(mnBai_6);
	}
}
