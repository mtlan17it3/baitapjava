package javaarray;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai1 {

	private JFrame frame;
	private JTextField txmang;
	private JTextField txkq;
	private JTextField txn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai1 window = new bai1();
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
	public bai1() {
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
		lblNhpMng.setBounds(28, 41, 62, 14);
		frame.getContentPane().add(lblNhpMng);
		
		JLabel lblKtQu = new JLabel("k\u1EBFt qu\u1EA3");
		lblKtQu.setBounds(28, 120, 62, 14);
		frame.getContentPane().add(lblKtQu);
		JButton btnKimTra = new JButton("ki\u1EC3m tra");
		btnKimTra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chuoimang=txmang.getText();
				String []a=chuoimang.split(",");
				Integer []x=new Integer[a.length];
				for(int i=0;i<a.length;i++)
					x[i]=Integer.parseInt(a[i]);
				int n=Integer.parseInt(txn.getText());
				
				boolean found=Array(n,x);
				//txkq.setText(String.valueOf(x));
				
			if(found)
	            txkq.setText(String.valueOf("true!!!"));
	        else
	        	txkq.setText(String.valueOf("false!!!"));
	    }
	
		});
		btnKimTra.setBounds(125, 187, 89, 23);
		frame.getContentPane().add(btnKimTra);
		
		txmang = new JTextField();
		txmang.setBounds(125, 38, 86, 20);
		frame.getContentPane().add(txmang);
		txmang.setColumns(10);
		
		txkq = new JTextField();
		txkq.setBounds(125, 117, 86, 20);
		frame.getContentPane().add(txkq);
		txkq.setColumns(10);
		
		txn = new JTextField();
		txn.setBounds(125, 76, 86, 20);
		frame.getContentPane().add(txn);
		txn.setColumns(10);
		
		JLabel lblNhpN = new JLabel("nh\u1EADp n");
		lblNhpN.setBounds(28, 79, 46, 14);
		frame.getContentPane().add(lblNhpN);
	}
	public static boolean Array(int n, Integer[] x) {
	    boolean t = false;
	    for (int i = 0; i < x.length; i++) {
	        if(x[i] == n) {
	            t = true;
	            break;
	        }
	    }
	    return t;
	}
}
