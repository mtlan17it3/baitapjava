package javaarray;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai5 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai5 window = new bai5();
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
	public bai5() {
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
		lblNhpMng.setBounds(41, 39, 65, 14);
		frame.getContentPane().add(lblNhpMng);
		
		JLabel lblKtQu = new JLabel("k\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(41, 124, 65, 14);
		frame.getContentPane().add(lblKtQu);
		
		t1 = new JTextField();
		t1.setBounds(177, 27, 115, 41);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(177, 111, 115, 41);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnSpXp = new JButton("s\u1EAFp x\u1EBFp");
		btnSpXp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chuoimang=t1.getText();
				String []a=chuoimang.split(",");
				Integer []x=new Integer[a.length];
				for(int i=0;i<a.length;i++) {
					x[i]=Integer.parseInt(a[i]);
				}
				for(int i=0;i<a.length-1;i++)
					for(int j=i+1;j<a.length;j++)
						if(x[i]>x[j])
						{
							int t=x[i];
							x[i]=x[j];
							x[j]=t;
						}
				for(int i=0;i<a.length;i++)
					System.out.println(a[i]+" ");
			}
		});
		btnSpXp.setBounds(103, 193, 89, 23);
		frame.getContentPane().add(btnSpXp);
	}

}
