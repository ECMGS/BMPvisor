package ecmgs.bmpvisor.gui;

import java.awt.Dimension;

import javax.swing.JFrame;

import ecmgs.jbmp.Jbmp;

public class MainWindow extends JFrame {
	
	Dimension size;
	
	Jbmp img;
	
	public MainWindow(String path) {
		
		// Setting up variables
		img = new Jbmp(path);
		size = img.getSize();
		
		// Setting up the window
		this.setSize(size);
		this.setTitle(path +" - BMPvisor");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
