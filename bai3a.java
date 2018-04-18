package baitapapplet;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai3 extends JApplet {
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Create the applet.
	 */
	public bai3() {
		getContentPane().setLayout(null);
		
		JLabel lblNhpSTh = new JLabel("nh\u1EADp s\u1ED1 th\u1EE9 nh\u1EA5t");
		lblNhpSTh.setBounds(43, 38, 110, 14);
		getContentPane().add(lblNhpSTh);
		
		t1 = new JTextField();
		t1.setBounds(223, 35, 86, 20);
		getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNhpSTh_1 = new JLabel("nh\u1EADp s\u1ED1 th\u1EE9 hai");
		lblNhpSTh_1.setBounds(43, 111, 110, 14);
		getContentPane().add(lblNhpSTh_1);
		
		t2 = new JTextField();
		t2.setBounds(223, 108, 86, 20);
		getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				Double result=Double.parseDouble(t1.getText()) +
						Double.parseDouble(t2.getText());
				t3.setText(String.valueOf(result));
			}
		});
		button.setBounds(39, 226, 89, 23);
		getContentPane().add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				Double result=Double.parseDouble(t1.getText()) -
						Double.parseDouble(t2.getText());
				t3.setText(String.valueOf(result));
			}
		});
		button_1.setBounds(185, 226, 89, 23);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				Double result=Double.parseDouble(t1.getText()) *
						Double.parseDouble(t2.getText());
				t3.setText(String.valueOf(result));
			}
		});
		button_2.setBounds(39, 277, 89, 23);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Double result=Double.parseDouble(t1.getText()) /
						Double.parseDouble(t2.getText());
				t3.setText(String.valueOf(result));
			}
		});
		button_3.setBounds(185, 277, 89, 23);
		getContentPane().add(button_3);
		
		JLabel lblKtQu = new JLabel("k\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(43, 176, 85, 14);
		getContentPane().add(lblKtQu);
		
		t3 = new JTextField();
		t3.setBounds(223, 173, 86, 20);
		getContentPane().add(t3);
		t3.setColumns(10);

	}

}
