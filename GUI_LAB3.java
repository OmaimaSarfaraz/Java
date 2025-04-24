package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_LAB3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JTextField t1 = new JTextField();
	private JTextField t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_LAB3 frame = new GUI_LAB3();
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
	public GUI_LAB3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t = new JTextField();
		t.setBounds(152, 11, 96, 20);
		contentPane.add(t);
		t.setColumns(10);
		t1.setBounds(152, 59, 96, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float a,b;
				a= Float.parseFloat(t.getText());
				b= (a * 9/5) + 32; 
				t1.setText(String.valueOf(b));
				//Convert c1=new Convert();	
				//t1.setText(String.valueOf(c1.celtofar(Float.parseFloat(t.getText()))));
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(135, 123, 128, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Celcius");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(50, 14, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fahrenheit");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(50, 62, 75, 14);
		contentPane.add(lblNewLabel_1);
	}

}
