package blockBreaker;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class Block extends Rectangle{
	Image pic;
	int dx = 3;
	int dy = -3;
	boolean destroyed = false;
	Rectangle left, right;
	boolean powerup = false;
	
	// create blocks 
	Block(int x, int y, int width, int height, String image){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		left = new Rectangle(x-1,y,1,height);
		right = new Rectangle(x+width+1,y,1,height); 
		pic = Toolkit.getDefaultToolkit().getImage(image);
	}
	
	public void draw (Graphics g, Component c){
		if(!destroyed){
		g.drawImage(pic, x, y, width, height, c);
		}
	}
}
