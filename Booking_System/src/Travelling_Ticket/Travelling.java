package Travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Travelling {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-56,159
	 */
	private final JTextField textField = new JTextField();
	private JTextField tax1;
	private JTextField subtotal1;
	private JTextField total1;
	private JTextField from;
	private JTextField to;
	private JTextField time;
	private JTextField date;
	private JTextField ticketnumber;
	private JTextField class1;
	private JTextField ticket;
	private JTextField category;
	private JTextField price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
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
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Booking System");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(337, 21, 176, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket type");
		lblNewLabel_1.setBounds(125, 50, 86, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lbltax = new JLabel("Tax");
		lbltax.setBounds(17, 222, 49, 14);
		frame.getContentPane().add(lbltax);
		
		JRadioButton oneway = new JRadioButton("One way ticket");
		oneway.setBounds(141, 81, 111, 14);
		frame.getContentPane().add(oneway);
		
		JRadioButton standard = new JRadioButton("Standard");
		standard.setBounds(17, 77, 111, 23);
		frame.getContentPane().add(standard);
		
		JRadioButton economy = new JRadioButton("Economy");
		economy.setBounds(17, 117, 111, 23);
		frame.getContentPane().add(economy);
		
		JRadioButton retun = new JRadioButton("Return");
		retun.setBounds(141, 118, 140, 20);
		frame.getContentPane().add(retun);
		
		JRadioButton child = new JRadioButton("Child");
		child.setBounds(311, 117, 111, 23);
		frame.getContentPane().add(child);
		
		JRadioButton adult = new JRadioButton("Adult");
		adult.setBounds(311, 82, 111, 23);
		frame.getContentPane().add(adult);
		
		JRadioButton firstclass = new JRadioButton("First Class");
		firstclass.setBounds(17, 154, 111, 23);
		frame.getContentPane().add(firstclass);
		
		JComboBox destination = new JComboBox();
		destination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Johannesburg", "Cape Town", "Pretoria", "Durban"}));
		destination.setBounds(145, 154, 125, 22);
		frame.getContentPane().add(destination);
		
		JLabel lblNewLabel_2_1 = new JLabel("Total");
		lblNewLabel_2_1.setBounds(17, 295, 49, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblnewlabel = new JLabel("SubTotal");
		lblnewlabel.setBounds(17, 259, 49, 14);
		frame.getContentPane().add(lblnewlabel);
		
		JButton total = new JButton("Total");
		total.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double tax = 15.00;
				double keight = 20.18;
				double kten = 20.43;
				double ktwelve = 45.39;
				double Ktwenty = 54.67;
				double totalC, eco = 3.85, fclass = 5.60;
				
				if ((standard.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * keight)/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", keight + totalC);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Oneway");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * kten)/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", kten + totalC);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Oneway");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = (tax * ktwelve)/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", ktwelve + totalC);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Oneway");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Pretoria")) {
					totalC = (tax * Ktwenty)/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", Ktwenty + totalC);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Oneway");
					category.setText("One");
				}
				
				else if ((standard.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * (keight * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (keight + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Return");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * (kten * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (kten + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Return");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = (tax * (ktwelve * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (ktwelve + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Return");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Pretoria")) {
					totalC = (tax * (Ktwenty * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (Ktwenty + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Return");
					category.setText("One");
				}
				
				else if ((standard.isSelected()) || (oneway.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * keight )/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", keight + totalC - 14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (oneway.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * kten )/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", kten + totalC - 14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (oneway.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = (tax * ktwelve )/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", ktwelve + totalC - 14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (oneway.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Pretoria")) {
					totalC = (tax * Ktwenty )/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", Ktwenty + totalC - 14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("oneway");
					category.setText("One");
				}
				
				else if ((standard.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * (keight * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (keight + totalC * 2) - 14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Return");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * (kten * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (kten + totalC * 2) - 14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Return");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("JOhannesburg")) {
					totalC = (tax * (ktwelve * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (ktwelve + totalC * 2) - 14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Return");
					category.setText("One");
				}
				else if ((standard.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Pretoria")) {
					totalC = (tax * (Ktwenty * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (Ktwenty + totalC * 2) - 14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("STD");
					ticket.setText("Return");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * (keight + eco))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight + eco);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", keight + eco + totalC);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * (kten + eco))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten + eco);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", keight + totalC + eco);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = (tax * (ktwelve + eco))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve + eco);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", ktwelve + totalC + eco);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Pretoria")) {
					totalC = (tax * (Ktwenty + eco))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty + eco);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", Ktwenty + totalC + eco);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * (keight * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (keight + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * (kten * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (kten + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = (tax * (ktwelve * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (ktwelve + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Pretoria")) {
					totalC = (tax * (Ktwenty * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (Ktwenty + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * (keight * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", ((keight + totalC) * 2)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * (kten * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", ((kten + totalC) * 2)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = (tax * (ktwelve * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", ((ktwelve + totalC) * 2)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * (Ktwenty * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", ((Ktwenty + totalC) * 2)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (oneway.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = ((tax * keight + eco))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight + eco);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (keight + eco + totalC)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (oneway.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = ((tax * kten + eco))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten + eco);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (kten + eco + totalC)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (oneway.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = ((tax * ktwelve + eco))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve + eco);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (ktwelve + eco + totalC)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((economy.isSelected()) || (oneway.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Pretoria")) {
					totalC = ((tax * Ktwenty + eco))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty + eco);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (Ktwenty + eco + totalC)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("ECO");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * (keight + fclass))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight + fclass);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", keight + fclass + totalC);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * (kten + fclass))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten + fclass);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", kten + fclass + totalC);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = (tax * (ktwelve + fclass))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve + fclass);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", ktwelve + fclass + totalC);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (oneway.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * (Ktwenty + fclass))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty + fclass);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", Ktwenty + fclass + totalC);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * (keight * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (keight + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * (kten * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (kten + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = (tax * (ktwelve * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (ktwelve + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (adult.isSelected()) || destination.getSelectedItem().equals("Pretoria")) {
					totalC = (tax * (Ktwenty * 2))/100;
					String sTax = String.format("R%.2f", totalC);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (Ktwenty + totalC) * 2);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = ((tax * keight + fclass))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight + fclass);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (keight + totalC + fclass)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = ((tax * kten + fclass))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten + fclass);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (kten + totalC + fclass)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = ((tax * ktwelve + fclass))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve + fclass);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (ktwelve + totalC + fclass)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Pretoria")) {
					totalC = ((tax * Ktwenty + fclass))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty + fclass);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (Ktwenty + totalC + fclass)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("oneway");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Cape Town")) {
					totalC = (tax * (keight * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", keight * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (keight + totalC * 2)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Durban")) {
					totalC = (tax * (kten * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", kten * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (kten + totalC * 2)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Johannesburg")) {
					totalC = (tax * (ktwelve * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", ktwelve * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (ktwelve + totalC * 2)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("return");
					category.setText("One");
				}
				else if ((firstclass.isSelected()) || (retun.isSelected()) || (child.isSelected()) || destination.getSelectedItem().equals("Pretoria")) {
					totalC = (tax * (Ktwenty * 2))/100;
					String sTax = String.format("R%.2f", totalC - 14);
					tax1.setText(sTax);
					String SubTotal = String.format("R%.2f", Ktwenty * 2);
					subtotal1.setText(SubTotal);
					String Total = String.format("R%.2f", (Ktwenty + totalC * 2)-14);
					total1.setText(Total);
					price.setText(Total);
					class1.setText("FCLASS");
					ticket.setText("return");
					category.setText("One");
				}
				
			}
		});
		total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Time
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				time.setText(tTime.format(timer.getTime()));
				
				//Date
				SimpleDateFormat tDate = new SimpleDateFormat("dd-MMM-yyyy");
				date.setText(tDate.format(timer.getTime()));
				
				to.setText("Pretoria*");
				from.setText((String) destination.getSelectedItem()+ "*");
				
				//Random number generator
				int num1;
				String str1= "";
				num1 = 1325 + (int) (Math.random()*4328);
				str1 += num1 + 1325;
				ticketnumber.setText(str1);
			}
		});
		
		total.setBounds(54, 435, 89, 23);
		frame.getContentPane().add(total);
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tax1.setText(null);
				subtotal1.setText(null);
				total1.setText(null);
				standard.setSelected(false);
				economy.setSelected(false);
				firstclass.setSelected(false);
				oneway.setSelected(false);
				retun.setSelected(false);
				adult.setSelected(false);
				child.setSelected(false);
				destination.setSelectedItem("Destination");
				from.setText(null);
				to.setText(null);
				time.setText(null);
				date.setText(null);
				ticketnumber.setText(null);
				price.setText(null);
				category.setText(null);
				ticket.setText(null);
				class1.setText(null);
			}
		});
		reset.setBounds(384, 435, 89, 23);
		frame.getContentPane().add(reset);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Booking systems", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION);
				System.exit(0);
			}
		});
		exit.setBounds(753, 435, 89, 23);
		frame.getContentPane().add(exit);
		
		tax1 = new JTextField();
		tax1.setBounds(141, 219, 96, 20);
		frame.getContentPane().add(tax1);
		tax1.setColumns(10);
		
		subtotal1 = new JTextField();
		subtotal1.setColumns(10);
		subtotal1.setBounds(141, 255, 96, 20);
		frame.getContentPane().add(subtotal1);
		
		total1 = new JTextField();
		total1.setColumns(10);
		total1.setBounds(141, 295, 96, 20);
		frame.getContentPane().add(total1);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(651, 86, 49, 14);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(651, 133, 49, 14);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(651, 241, 49, 14);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(651, 187, 49, 14);
		frame.getContentPane().add(lblTime);
		
		from = new JTextField();
		from.setColumns(10);
		from.setBounds(746, 80, 96, 20);
		frame.getContentPane().add(from);
		
		to = new JTextField();
		to.setColumns(10);
		to.setBounds(746, 130, 96, 20);
		frame.getContentPane().add(to);
		
		time = new JTextField();
		time.setColumns(10);
		time.setBounds(746, 184, 96, 20);
		frame.getContentPane().add(time);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(746, 238, 96, 20);
		frame.getContentPane().add(date);
		
		JLabel lblTicketNumber = new JLabel("Ticket Number");
		lblTicketNumber.setBounds(651, 295, 86, 14);
		frame.getContentPane().add(lblTicketNumber);
		
		ticketnumber = new JTextField();
		ticketnumber.setColumns(10);
		ticketnumber.setBounds(746, 292, 96, 20);
		frame.getContentPane().add(ticketnumber);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setBounds(463, 86, 49, 14);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setBounds(463, 187, 49, 14);
		frame.getContentPane().add(lblTicket);
		
		class1 = new JTextField();
		class1.setColumns(10);
		class1.setBounds(463, 130, 96, 20);
		frame.getContentPane().add(class1);
		
		ticket = new JTextField();
		ticket.setColumns(10);
		ticket.setBounds(463, 238, 96, 20);
		frame.getContentPane().add(ticket);
		
		category = new JTextField();
		category.setColumns(10);
		category.setBounds(463, 349, 96, 20);
		frame.getContentPane().add(category);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(463, 295, 49, 14);
		frame.getContentPane().add(lblCategory);
		
		price = new JTextField();
		price.setBounds(746, 349, 96, 20);
		frame.getContentPane().add(price);
		price.setColumns(10);
		
		JLabel p = new JLabel("Price");
		p.setBounds(651, 355, 49, 14);
		frame.getContentPane().add(p);
	}
}
