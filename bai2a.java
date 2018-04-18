package baitapapplet;
import java.applet.*;
import java.awt.Graphics;

import javax.swing.JOptionPane;
public class bai2 extends Applet{
	int n;
	public void init()
	{
		String nhap;
		nhap=JOptionPane.showInputDialog("nhap n");
		n=Integer.parseInt(nhap);
		
	}
	public void paint(Graphics g)
	{
		/*for(int i=1;i<=n;i++)
		for(int j=1;j<=i*2-1;j++)
		g.drawString("*",100,i*15);	*/
		String nhap="";
		for(int i = 1 ;i<=n;i++) {
			nhap = nhap + "*";
			g.drawString(nhap, 100, i*15);
	}

	}
}
