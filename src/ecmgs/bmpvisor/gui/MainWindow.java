package ecmgs.bmpvisor.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
		this.setResizable(false);
		
		MainWindowPanel panel = new MainWindowPanel(img);
		
		this.add(panel);
	}
	
	// Shows the window
	public void showWindow() {
		this.setVisible(true);
	}
	
}

class MainWindowPanel extends JPanel {
	
	Jbmp img;
	
	// Constructor
	public MainWindowPanel(Jbmp img) {
		this.img = img;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		Dimension size = img.getSize();
		
		int[][][] imgRAW = img.getImage();
		
		System.out.println(imgRAW[2][2][2]);
		
		for (int y = 0; y < size.height; y++) {
			
			for (int x = 0; x < size.width; x++) {
				g2D.setColor(new Color(imgRAW[x][y][0],imgRAW[x][y][1],imgRAW[x][y][2]));
				g2D.fillRect(x, y, 1, 1);
			}
			
		}
		
	}
	
}