package baitapapplet;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai4 extends JApplet {
	private JTextField t1;
	int t=0;

	/**
	 * Create the applet.
	 */
	public bai4() {
		getContentPane().setLayout(null);
		
		JLabel lblNhp = new JLabel("nh\u1EADp");
		lblNhp.setBounds(66, 81, 46, 14);
		getContentPane().add(lblNhp);
		
		t1 = new JTextField();
		t1.setBounds(182, 78, 86, 20);
		getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnon = new JButton("\u0111o\u00E1n");
		btnon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(t1.getText()); 
				
				t++;
				if(n>=1&&n<=9) {
					if(t<4) {
						if(n==7) {
							JOptionPane.showConfirmDialog(null, "congratulations", "thông báo", JOptionPane.CANCEL_OPTION);
						}
						if(n>7) {
							JOptionPane.showConfirmDialog(null, "bạn nhập số vào lớn hơn số cần tìm", "thông báo", JOptionPane.CANCEL_OPTION);
						}
						if(n<7) {
							JOptionPane.showConfirmDialog(null, "bạn nhập số vào nhỏ hơn số cần tìm", "thông báo", JOptionPane.CANCEL_OPTION);
						}
						}
						else {
							t1.setEditable(false);
							JOptionPane.showConfirmDialog(null, "bạn bạn đã nhập quá 3 lần", "thông báo", JOptionPane.CANCEL_OPTION);
						}
						}
			}
		});
		btnon.setBounds(113, 143, 89, 23);
		getContentPane().add(btnon);

	}

}
