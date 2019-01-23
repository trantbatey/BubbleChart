
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BChart extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillOval(50, 50, 100, 100);
	}
}
