package javaarray;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai2 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai2 window = new bai2();
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
	public bai2() {
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
		
		JLabel lblNhpMng = new JLabel("nh\u00E2p m\u1EA3ng");
		lblNhpMng.setBounds(20, 34, 96, 14);
		frame.getContentPane().add(lblNhpMng);
		
		t1 = new JTextField();
		t1.setBounds(126, 31, 113, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(43, 108, 113, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(205, 108, 113, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton btnSNhNht = new JButton("s\u1ED1 nh\u1ECF nh\u1EA5t");
		btnSNhNht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chuoimang=t1.getText();
				String []a=chuoimang.split(",");
				Integer []x=new Integer[a.length];
				for(int i=0;i<a.length;i++)
					x[i]=Integer.parseInt(a[i]);
				int min=x[0];
				{
				for(int i=0;i<a.length;i++)
				if(x[i]<min)
					min=x[i];
			}
				String ketqua=Integer.toString(min);
				t2.setText(ketqua);
					
			}
		});
		btnSNhNht.setBounds(43, 176, 113, 23);
		frame.getContentPane().add(btnSNhNht);
		
		JButton btnSLnNht = new JButton("s\u1ED1 l\u1EDBn nh\u1EA5t");
		btnSLnNht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String chuoimang=t1.getText();
				String a[]=chuoimang.split("[,]");
				Integer x[]=new Integer[a.length];
				for(int i=0;i<a.length;i++)
					x[i]=Integer.parseInt(a[i]);
				int max=x[0];
				{
					for(int i=0;i<a.length;i++)
						if(x[i]>max)
						{
							max=x[i];
						}
				}
				t3.setText(String.valueOf(max));
				
			}
		});
		btnSLnNht.setBounds(205, 176, 113, 23);
		frame.getContentPane().add(btnSLnNht);
	}
}
