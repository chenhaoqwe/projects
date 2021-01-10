package 飞机大战;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;



/*
 * 玩家
 */

public class Player {
	public MyPanel mypanel;
	public int width=100;
	public int height=100;
	public int x;
	public int y;
	//绘制自动切换
	//存放
	public int attact=1;//设置玩家的大力 为等级
	
	public Image[] images=new Image[]{
			Toolkit.getDefaultToolkit().getImage("E:\\游戏图片\\1.png"),
	       
	};
	//存储当前图片下标
	public int imagindex=0;
	public Player(MyPanel mypanel){
		this.mypanel=mypanel;
		this.x=(Xiaojiejie.frameWidth-this.width)/2;
		this.y=Xiaojiejie.frameHeight-this.height*2;
	}
	//绘制飞机
	public void drawSelf(Graphics g)
	{
		g.drawImage(this.images[imagindex], x, y,width,height,null);
	    if(this.mypanel.timer%50==0){
	    	imagindex++;
	    	if(this.imagindex==this.images.length)
	    		this.imagindex=0;
	    }
	
	}
}