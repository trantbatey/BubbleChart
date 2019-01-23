/**
 * 
 */

import javax.swing.*;

/**
 * @author Trant
 *    The program will generate and display a packed bubble chart; 
 *    it will draw a circle for each line with a radius corresponding to 
 *    the value from that line, all the circles together in one bunch, 
 *    touching each other but not overlapping.
 */
public class BubbleChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Setup drawing area
		JFrame f = new JFrame("Bubble Chart");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BChart bc = new BChart();
		f.add(bc);
		f.setSize(400, 400);
		f.setVisible(true);
		

	}

}
