package Swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ASMD extends JFrame {

	private JPanel contentPane;
	private JTextField fs;
	private JTextField sn;
	private JTextField re;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASMD frame = new ASMD();
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
	public ASMD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1st Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(22, 23, 90, 25);
		contentPane.add(lblNewLabel);
		
		fs = new JTextField();
		fs.setBounds(126, 23, 166, 25);
		contentPane.add(fs);
		fs.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("2nd Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(22, 64, 90, 25);
		contentPane.add(lblNewLabel_1);
		
		sn = new JTextField();
		sn.setColumns(10);
		sn.setBounds(126, 59, 166, 25);
		contentPane.add(sn);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(22, 100, 90, 25);
		contentPane.add(lblNewLabel_2);
		
		re = new JTextField();
		re.setColumns(10);
		re.setBounds(126, 95, 166, 25);
		contentPane.add(re);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m,s;
				n=Integer.parseInt(fs.getText());
				m=Integer.parseInt(sn.getText());
				s=n+m;
				re.setText(Integer.toString(s));
			}
		});
		btnNewButton.setBounds(87, 131, 101, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSubtraction = new JButton("Subtraction");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m,s;
				n=Integer.parseInt(fs.getText());
				m=Integer.parseInt(sn.getText());
				s=n-m;
				re.setText(Integer.toString(s));
			}
		});
		btnSubtraction.setBounds(215, 131, 101, 23);
		contentPane.add(btnSubtraction);
		
		JButton btnMultiplication = new JButton("Multiplication");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int m,n,s;
				n=Integer.parseInt(fs.getText());
				m=Integer.parseInt(sn.getText());
				s=n*m;
				re.setText(Integer.toString(s));
			}
		});
		btnMultiplication.setBounds(87, 177, 101, 23);
		contentPane.add(btnMultiplication);
		
		JButton btnDivision = new JButton("Division");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				float n,m,s;
				n=Float.parseFloat(fs.getText());
				m=Float.parseFloat(sn.getText());
				s=n/m;
				re.setText(Float.toString(s));
			}
		});
		btnDivision.setBounds(215, 177, 101, 23);
		contentPane.add(btnDivision);
	}

}
