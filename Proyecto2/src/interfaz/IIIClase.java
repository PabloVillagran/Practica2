package interfaz;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class IIIClase extends Vagon{
	final int CANTIDAD_PASAJEROS = 10;
	int x = getBlock(), y=getRow();
	Canvas canvas;
	
	public IIIClase(Canvas canvas) {
		super(canvas);
	}
	
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(185,122,87));
		g2d.drawRect(x+9, y+71, 96, 46);
		g2d.setColor(Color.GRAY);
		g2d.drawOval(x+13, y+105, 20, 20);
		g2d.drawOval(x+81, y+105, 20, 20);
		g2d.setColor(Color.LIGHT_GRAY);
		int[]x1={x,x+114,x+105,x+9},y1={y+71,y+71,y+60,y+60};
		g2d.drawPolygon(x1,y1,4);
	}
}
