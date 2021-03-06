package maze.model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	
	private int tileX, tileY ;
	private Image fronttrump;
	private Image backtrump;
	private Image lefttrump;
	private Image righttrump;
	
	
	public Player()
	{
		ImageIcon img = new ImageIcon("./src/pics/front.gif");
		fronttrump = img.getImage();
		img = new ImageIcon("./src/pics/back.gif");
		backtrump = img.getImage();
		img = new ImageIcon("./src/pics/left.gif");
		lefttrump = img.getImage();
		img = new ImageIcon("./src/pics/right.gif");
		righttrump = img.getImage();
		
		tileX = 1;
		tileY = 0; // starting tiles
		
	}
	
	public int settileX()
	{
		tileX = 1 ;
		return tileX;
	}
	
	public int settileY()
	{
		tileY = 0;
		return tileY;
	}
	
	public int gettileX()
	{
		return tileX;
	}
	
	public int gettileY()
	{
		return tileY;
	}
	public Image getfrontplayer()
	{
		return fronttrump;
	}
	public Image getbackplayer()
	{
		return backtrump;
	}
	public Image getleftplayer()
	{
		return lefttrump;
	}
	public Image getrightplayer()
	{
		return righttrump;
	}
	
	public void move(int dx, int dy)
	{
		
		tileX += dx ;
		tileY += dy ;
	}

}
