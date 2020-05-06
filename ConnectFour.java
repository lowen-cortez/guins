/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.awt.Color;
import java.awt.Dimension;


import java.awt.Toolkit;


import javax.swing.JFrame;



public class ConnectFour extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public ConnectFourPanel pan;
	public Dimension dim;
	int locX;
	int locY;
	public ConnectFour() throws InterruptedException{
		
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		locX=(int) dim.getWidth()*4/12;
		locY=(int) dim.getHeight()*4/12;
		pan = new ConnectFourPanel();
		this.setTitle("Guins4Connect");
		this.setSize(400,520);
		this.setLocation(locX, locY);
		this.add(pan);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setFocusable(true);
		this.setResizable(false);
	}
	
	
	
	public static void main(String[] args) throws InterruptedException{
		new ConnectFour();
	}


}
