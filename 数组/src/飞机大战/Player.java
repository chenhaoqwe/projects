package �ɻ���ս;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;



/*
 * ���
 */

public class Player {
	public MyPanel mypanel;
	public int width=100;
	public int height=100;
	public int x;
	public int y;
	//�����Զ��л�
	//���
	public int attact=1;//������ҵĴ��� Ϊ�ȼ�
	
	public Image[] images=new Image[]{
			Toolkit.getDefaultToolkit().getImage("E:\\��ϷͼƬ\\1.png"),
	       
	};
	//�洢��ǰͼƬ�±�
	public int imagindex=0;
	public Player(MyPanel mypanel){
		this.mypanel=mypanel;
		this.x=(Xiaojiejie.frameWidth-this.width)/2;
		this.y=Xiaojiejie.frameHeight-this.height*2;
	}
	//���Ʒɻ�
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