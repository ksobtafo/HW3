package project1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class city3 extends JFrame {

	private JPanel contentPane;

	//school variable 
	private ArrayList<School> SchoolArray = new ArrayList<School>();
	private String newName;
	private int newAge;
	private String strNewAge;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					city3 frame = new city3();
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
	public city3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddPeopleTo = new JLabel("Add people to your school ");
		lblAddPeopleTo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddPeopleTo.setBounds(58, 32, 188, 14);
		contentPane.add(lblAddPeopleTo);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(33, 97, 89, 23);
		contentPane.add(btnAdd);
		
		btnAdd.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg1 ) { 
			
				
				//newName = textField.getText();
				//strNewAge= textField_1.getText();
				newName = JOptionPane.showInputDialog("Name");
				strNewAge = JOptionPane.showInputDialog("Age");
				newAge = Integer.parseInt(strNewAge);
				
				//add person to school array
				School newPersonSchool = new School (newName, newAge);
				SchoolArray.add(newPersonSchool);
				
			}
			});	
		
		JButton btnNext = new JButton("Go to CityHall");
		btnNext.setBounds(162, 97, 110, 23);
		contentPane.add(btnNext);
		
		JButton btnShowMyschoolDetails = new JButton("Show mySchool details ");
		btnShowMyschoolDetails.setBounds(73, 132, 149, 23);
		contentPane.add(btnShowMyschoolDetails);
		
		btnShowMyschoolDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//stuff here 
				for ( int i =0; i<SchoolArray.size();i++)
				{
					if (SchoolArray.get(i).GetAge()>19)
					{
						
						JOptionPane.showMessageDialog(null, "Name: "+ SchoolArray.get(i).GetName()+" is a teacher, and is "+ SchoolArray.get(i).GetAge());
					}
					else 
					JOptionPane.showMessageDialog(null, "Name: "+ SchoolArray.get(i).GetName()+" is a student, and is "+ SchoolArray.get(i).GetAge()) ;
				}
			}
		});
		
		
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				//here
				City2 cityobj2 = new City2();
				cityobj2.setVisible(true);
			}
		});
		
	}
}
