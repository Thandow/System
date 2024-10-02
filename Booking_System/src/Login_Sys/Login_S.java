package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Travelling_Ticket.Travelling;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login_S {

	private JFrame frame;
	private final JLabel loginsystem = new JLabel("Login System");
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
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
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 827, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		loginsystem.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 20));
		loginsystem.setBounds(332, 28, 160, 59);
		frame.getContentPane().add(loginsystem);
		
		JLabel lblusername = new JLabel("UserName");
		lblusername.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		lblusername.setBounds(148, 146, 89, 33);
		frame.getContentPane().add(lblusername);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		lblNewLabel_2.setBounds(148, 238, 69, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		username = new JTextField();
		username.setBounds(419, 152, 170, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JButton login = new JButton("Login");
		login.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Password = password.getText();
				String Username = username.getText();
				
				if (Password.contains("Doll") || Username.contains("Millz")) {
					password.setText(null);
					username.setText(null);
					
					Travelling info = new Travelling();
					Travelling.main(null);
				}
				else if (Username.isEmpty() || Password.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill in the details");
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid details", "error message", JOptionPane.ERROR_MESSAGE);
					password.setText(null);
					username.setText(null);
				}
			}
		});
		login.setBounds(148, 336, 89, 23);
		frame.getContentPane().add(login);
		
		JButton reset = new JButton("Reset");
		reset.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText(null);
				password.setText(null);
			}
		});
		reset.setBounds(378, 336, 89, 23);
		frame.getContentPane().add(reset);
		
		JButton exit = new JButton("Exit");
		exit.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 16));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Confirm if you want to exit", "Login System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		exit.setBounds(599, 336, 89, 23);
		frame.getContentPane().add(exit);
		
		password = new JPasswordField();
		password.setBounds(419, 244, 170, 20);
		frame.getContentPane().add(password);
	}
}
