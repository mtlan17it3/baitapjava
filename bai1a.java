package baitapapplet;
import java.applet.*;
import java.awt.*;
import java.awt.Graphics;

import javax.swing.JOptionPane;
public class bai1 extends Applet {
	int number;
	public void init()
	{
		String nhap;
		nhap=JOptionPane.showInputDialog("enter integer");
		number=Integer.parseInt(nhap);
		
	}
	public void paint(Graphics e)
	{
		for(int i=1;i<=number;i++)
		
		e.drawString(""+i+"", i*30, 100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
