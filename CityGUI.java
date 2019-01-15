package proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class proj {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=272,9
	 */
	private final JTextField textField = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					proj window = new proj();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public proj() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 624, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCityhall = new JButton("CityHall");
		btnCityhall.setIcon(new ImageIcon("C:\\Users\\jordan\\Desktop\\town_hall.png"));
		btnCityhall.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCityhall.setBackground(Color.GRAY);
		btnCityhall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//here
				JOptionPane.showMessageDialog(null, " 3 policemen");
			}
		});
		frame.getContentPane().add(btnCityhall, BorderLayout.WEST);
		
		JButton btnSchool = new JButton("School");
		btnSchool.setIcon(new ImageIcon("C:\\Users\\jordan\\Desktop\\school.png"));
		btnSchool.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSchool.setBackground(Color.BLUE);
		btnSchool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, " 5 Children and 2 Teachers");
			}
		});
		frame.getContentPane().add(btnSchool, BorderLayout.EAST);
	}

}
