import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author user
 *
 */
public class MyPanel2 extends JPanel {
@Override
public void paint(Graphics g){
	super.paint(g);
	g.setColor(Color.red);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); 
	int x = 100;
	int y = 100;
	/*int x2 = 200;
	int y2 = 50;
	g.drawRoundRect(10,100,100,50,50,50	);
	g.drawOval(10,150,100,50);
	g.drawArc(10, 200, 100, 50, 120, 180);
	while (y2 < 150){
	g.drawLine(x1, y1, x2, y2);
	y2 = y2 + 10;
	y1 = y1 - 3;}
	g.setFont(new Font("Courier", Font.BOLD + Font.ITALIC,16));
	g.setColor(Color.RED);
	g.drawString("Hello World!", 100, 50);*/
	g.drawOval(x, y, 210, 210);
	g.drawOval(x+40, y+40, 130, 130);
	g.drawLine(x+105, y+105,  x+170, y+105);
	g.drawLine(x+105, y+105, x+105, y+170);
	g.drawLine(x+105, y+105, x+40, y+105);
	g.drawLine(x+105, y+105, x+105, y+40);
}
}
