package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLayeredPane;

public class home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final JButton btnNewButton = new JButton("\u0421\u0443\u0433\u0430\u043B\u0430\u0430\u0433 \u0448\u0430\u043B\u0433\u0430\u0445");
	int min=10000000;
	int max=99999999;
	int guess;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(228, 0, 290, 315);
		getContentPane().add(panel);
		panel.setLayout(null);
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(201, 0, 298, 293);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\Lottery\\icons\\choose-lottery-numbers_49_-_Copy_50.png"));
		lblNewLabel_1.setBounds(-49, -148, 834, 588);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("\u0422\u0430\u043D\u044C\u0434 \u0430\u043C\u0436\u0438\u043B\u0442 \u0445\u04AF\u0441\u044C\u0435");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(33, 64, 158, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\u0421\u0443\u0433\u0430\u043B\u0430\u0430\u043D\u044B \u0434\u0443\u0433\u0430\u0430\u0440:");
		lblNewLabel_2.setBounds(33, 109, 132, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(33, 134, 144, 20);
	
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int winning = (int)(Math.random()*(max-min+1)+min);
					textField_1.setText(String.valueOf(winning));
					guess= Integer.parseInt(textField.getText());
					if(winning==guess){
						JOptionPane.showMessageDialog(null, "Та азтан боллоо баяр хүргэе.");
					}else {
						JOptionPane.showMessageDialog(null, "Харамсалтай байна. Дахин оролдоно уу.");
					}
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Та сугалааны дугаарааа оруулна уу.",
						    "Анхааруулга",
						    JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(33, 165, 144, 20);
		contentPane.add(btnNewButton);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1, 1);
		contentPane.add(layeredPane);
		
		textField_1 = new JTextField();
		textField_1.setBounds(33, 221, 144, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Шагналын сугалаа:");
		lblNewLabel_3.setBounds(33, 196, 144, 14);
		contentPane.add(lblNewLabel_3);
		
		
	}
}
