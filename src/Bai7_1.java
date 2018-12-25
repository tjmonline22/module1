import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Bai7_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai7_1 frame = new Bai7_1();
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
	public class Animal {
		String name;
		String image;
	
		public String getName() {
			return name; 
		}
		
		public String getImage() { 
			return image;
		}
		
		public Animal() {
		}
		
		public Animal(String name, String image) {
			this.name = name;
			this.image = image; }
		
		public String sayHello() { 
			return "Hello!";
		} 
	}
	
	public class Dog extends Animal { 
		@Override
		public String sayHello() {
		return "Gâu gâu gâu"; }
		
		public Dog() {
		}
		public Dog(String name, String image) {
			super(name, image); }
		}
	
	public class Cat extends Animal { 
		@Override
		public String sayHello() {
		return "Gâu gâu gâu"; }
		
		public Cat() {
		}
		public Cat(String name, String image) {
			super(name, image); }
		}
	
	public class Pig extends Animal { 
		@Override
		public String sayHello() {
		return "Gâu gâu gâu"; }
		
		public Pig() {
		}
		public Pig(String name, String image) {
			super(name, image); }
		}
	
	
	
	public Bai7_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(32, 19, 61, 16);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(151, 14, 130, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Animal");
		lblNewLabel_1.setBounds(32, 68, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cbbAnimal = new JComboBox();
		cbbAnimal.setModel(new DefaultComboBoxModel(new String[] {"Chó", "Mèo", "Heo"}));
		cbbAnimal.setBounds(151, 64, 109, 27);
		contentPane.add(cbbAnimal);
		
		JLabel lblHello = new JLabel("");
		lblHello.setBounds(59, 183, 152, 16);
		contentPane.add(lblHello);
		
		JLabel lblImage = new JLabel("New label");
		lblImage.setBounds(342, 130, 88, 56);
		contentPane.add(lblImage);
		
		
		JButton btnSayHello = new JButton("Say Hello");
		btnSayHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String imagePath = "src/images/";
				ImageIcon img = null;
				switch (cbbAnimal.getSelectedItem().toString()) { 
				case "Dog":
				Dog d = new Dog(name, "1_dog.png"); 
				lblHello.setText(d.name + " says " + d.sayHello()); 
				img = new ImageIcon(imagePath + d.getImage()); lblImage.setIcon(img);
				break;
				
				case "Cat":
				Cat c = new Cat(name, "1_cat.png"); 
				lblHello.setText(c.name + " says " + c.sayHello()); 
				img = new ImageIcon(imagePath + c.getImage()); 
				lblImage.setIcon(img);
				break;
				default:
				Pig p = new Pig(name, "1_pig.jpg"); 
				lblHello.setText(p.name + " says " + p.sayHello()); 
				img = new ImageIcon(imagePath + p.getImage());
				lblImage.setIcon(img);
				break; 
				}
			}
		
		});
		btnSayHello.setBounds(151, 130, 117, 29);
		contentPane.add(btnSayHello);
		
		
	}

}
