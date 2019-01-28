package project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class City2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					City2 frame = new City2();
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
	public City2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("City Hall ");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(37, 98, 145, 37);
		contentPane.add(btnNewButton);
		
		btnNewButton.setIcon(new ImageIcon("town_hall.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//here
				city4 city3obj2 = new city4();
				city3obj2.setVisible(true);
			}
		});
		
		JButton btnSchool = new JButton("School ");
		btnSchool.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSchool.setBounds(277, 98, 147, 37);
		contentPane.add(btnSchool);
		
		btnSchool.setIcon(new ImageIcon("school.png"));
		
		//school goes to city3 frame
		btnSchool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//here
				city3 city3obj1 = new city3();
				city3obj1.setVisible(true);
			}
		});
		
		
		JLabel lblWhereDoYou = new JLabel("Where do you want to go ?");
		lblWhereDoYou.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWhereDoYou.setBounds(111, 25, 247, 23);
		contentPane.add(lblWhereDoYou);
	}
}

