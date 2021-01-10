package 飞机大战;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Bullt {
	public MyPanel mypanel;
	public int width=8;;
	public int height=8;
	public int x;
	public int y;
	// 创建画类型的数组 用来存储子弹
	public Image[] image = new Image[] {
			Toolkit.getDefaultToolkit().getImage("E:\\游戏图片\\3.png"),
			Toolkit.getDefaultToolkit().getImage("E:\\游戏图片\\4.png"),
			Toolkit.getDefaultToolkit().getImage("E:\\游戏图片\\5.png") };

	public Bullt(MyPanel mypanel){
		this.mypanel=mypanel;
	}
	public int index=0;
	
	//画子弹
	public void drawSelf(Graphics g){
		 g.drawImage(this.image[index], x, y, width, height,null);
	      if(this.mypanel.timer%1==0){
	    	  index++;
	    	  if(index==this.image.length)
	    		  index=0;
	    	  y--;//子弹的列坐标
	    	  if(y<0)
	    		  //从面板中移除子弹
	    		   this.mypanel.bullt.remove(this);//当子弹移除
	      }
	
	
	
	}

}
