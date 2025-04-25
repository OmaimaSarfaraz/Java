package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_LAB5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_LAB5 frame = new GUI_LAB5();
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
	public GUI_LAB5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t = new JTextField();
		t.setBounds(170, 10, 96, 20);
		contentPane.add(t);
		t.setColumns(10);
		
		t1 = new JTextField();
		t1.setBounds(170, 58, 96, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Number 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(45, 13, 115, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Number 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(45, 61, 115, 14);
		contentPane.add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setBounds(170, 153, 96, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,c;
				a=Integer.parseInt(t.getText());
				b=Integer.parseInt(t1.getText());
				c=(a>b)?a:b;
				t2.setText(String.valueOf(c));
				if (t.getText().equals(t1.getText())) {
					JOptionPane.showMessageDialog(null, "Both Are Equal");
				} 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(140, 106, 156, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(57, 156, 63, 14);
		contentPane.add(lblNewLabel_2);
	}

}
