package project1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;

public class city4 extends JFrame {

	private JPanel contentPane;

	private String newPolicemanName;
	ArrayList<CityHall> CityHallArray = new ArrayList<CityHall>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					city4 frame = new city4();
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
	public city4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add people to your CityHall");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(54, 11, 206, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(68, 53, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnNext = new JButton("Go to School");
		btnNext.setBounds(180, 53, 104, 23);
		contentPane.add(btnNext);
		
		JButton btnNewButton = new JButton(" Show CityHall details ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//stuff here 
				for ( int i =0; i<CityHallArray.size();i++)
				{
					JOptionPane.showMessageDialog(null, "Name: "+ CityHallArray.get(i).getPoliceName());
				}
			}
		});
		btnNewButton.setBounds(99, 87, 166, 23);
		contentPane.add(btnNewButton);
		

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				//here
				City2 cityobj2 = new City2();
				cityobj2.setVisible(true);
			}
		});
		
		
		btnAdd.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg1 ) { 
			
				
				//newPolicemanName = textField.getText();
				newPolicemanName = JOptionPane.showInputDialog("Name");
				
				//add person to cityHall  array
				CityHall newPersonCityHall = new CityHall (newPolicemanName);
				CityHallArray.add(newPersonCityHall);
				
			}
			});	
	}

}
