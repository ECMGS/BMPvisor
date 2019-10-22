package ecmgs.bmpvisor;

import ecmgs.bmpvisor.gui.MainWindow;

public class Main {

	public static void main(String[] args) {
		String path = "C:\\Users\\eucan\\Desktop\\SCAN0003.bmp";//JOptionPane.showInputDialog("Path of the image");
		
		MainWindow window = new MainWindow(path);
		
		window.showWindow();
	}

}
