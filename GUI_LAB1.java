package Forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_LAB1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t;
	private JTextField t2;
	private JTextField t1;
	private JTextField res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_LAB1 frame = new GUI_LAB1();
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
	public GUI_LAB1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t = new JTextField();
		t.setBounds(180, 11, 96, 20);
		contentPane.add(t);
		t.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(180, 86, 96, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		t1 = new JTextField();
		t1.setBounds(180, 44, 96, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		res = new JTextField();
		res.setBounds(180, 179, 96, 20);
		contentPane.add(res);
		res.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Basic Salary");
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		lblNewLabel.setBounds(68, 14, 92, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bonus");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(68, 47, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Deductions");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(68, 89, 81, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Net Salary");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(68, 182, 81, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,c,d;
				a=Integer.parseInt(t.getText());
				b=Integer.parseInt(t1.getText());
				c=Integer.parseInt(t2.getText());
				d=a+b-c;
				res.setText(String.valueOf(d));
				//add_class c1=new add_class();
				//res.setText(String.valueOf(c1.add(Integer.parseInt(t.getText()), Integer.parseInt(t1.getText()), Integer.parseInt(t2.getText()))));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(128, 131, 106, 23);
		contentPane.add(btnNewButton);
	}
}
