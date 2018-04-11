package javaarray;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai3 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField txkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai3 window = new bai3();
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
	public bai3() {
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
		
		JLabel lblNhpMngTh = new JLabel("nh\u1EADp m\u1EA3ng th\u1EE9 nh\u1EA5t");
		lblNhpMngTh.setBounds(30, 39, 98, 24);
		frame.getContentPane().add(lblNhpMngTh);
		
		JLabel lblNhpMngTh_1 = new JLabel("nh\u1EADp m\u1EA3ng th\u1EE9 hai");
		lblNhpMngTh_1.setBounds(30, 138, 98, 34);
		frame.getContentPane().add(lblNhpMngTh_1);
		
		t1 = new JTextField();
		t1.setBounds(183, 28, 108, 47);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(183, 138, 108, 47);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnKtQu = new JButton("k\u1EBFt qu\u1EA3");
		btnKtQu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chuoimang1=t1.getText();
				String []a=chuoimang1.split(",");
				Integer []x=new Integer[a.length];
				for(int i=0;i<a.length;i++)
					x[i]=Integer.parseInt(a[i]);
				String chuoimang2=t2.getText();
				String []a1=chuoimang2.split(",");
				Integer []x1=new Integer[a1.length];
				for(int j=0;j<a1.length;j++)
					x1[j]=Integer.parseInt(a1[j]);
				for(int i=0;i<a.length;i++)
					for(int j=0;j<a1.length;j++)
						if(x[i]==x1[j])
						{
							//System.out.println(x[i]);//tim duoc nhieu so giong nhau
							
							txkq.setText(String.valueOf(x[i]));//tim duoc 1 so giong nhau
						}
			
			}
		});
		btnKtQu.setBounds(73, 214, 89, 23);
		frame.getContentPane().add(btnKtQu);
		
		txkq = new JTextField();
		txkq.setBounds(319, 90, 86, 20);
		frame.getContentPane().add(txkq);
		txkq.setColumns(10);
	}
}
