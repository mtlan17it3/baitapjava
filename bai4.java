package javaarray;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai4 {

	private JFrame frame;
	private JTextField txmang;
	private JTextField txkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai4 window = new bai4();
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
	public bai4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNhpMng = new JLabel("nh\u1EADp m\u1EA3ng");
		lblNhpMng.setBounds(46, 40, 71, 30);
		frame.getContentPane().add(lblNhpMng);
		
		JLabel lblSum = new JLabel("sum");
		lblSum.setBounds(46, 112, 71, 30);
		frame.getContentPane().add(lblSum);
		
		txmang = new JTextField();
		txmang.setBounds(171, 40, 117, 30);
		frame.getContentPane().add(txmang);
		txmang.setColumns(10);
		
		txkq = new JTextField();
		txkq.setBounds(171, 115, 117, 30);
		frame.getContentPane().add(txkq);
		txkq.setColumns(10);
		
		JButton btnTnh = new JButton("t\u00EDnh");
		btnTnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chuoimang=txmang.getText();
				String []a=chuoimang.split(",");
				Integer []x=new Integer[a.length];
				for(int i=0;i<a.length;i++) {
					x[i]=Integer.parseInt(a[i]);
				}
				int s=0;
				for(int i=0;i<a.length;i++)
					s=s+x[i];
				txkq.setText(String.valueOf(s));
					
			}
		});
		btnTnh.setBounds(117, 193, 89, 23);
		frame.getContentPane().add(btnTnh);
	}
}
