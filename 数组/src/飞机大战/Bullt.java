package �ɻ���ս;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Bullt {
	public MyPanel mypanel;
	public int width=8;;
	public int height=8;
	public int x;
	public int y;
	// ���������͵����� �����洢�ӵ�
	public Image[] image = new Image[] {
			Toolkit.getDefaultToolkit().getImage("E:\\��ϷͼƬ\\3.png"),
			Toolkit.getDefaultToolkit().getImage("E:\\��ϷͼƬ\\4.png"),
			Toolkit.getDefaultToolkit().getImage("E:\\��ϷͼƬ\\5.png") };

	public Bullt(MyPanel mypanel){
		this.mypanel=mypanel;
	}
	public int index=0;
	
	//���ӵ�
	public void drawSelf(Graphics g){
		 g.drawImage(this.image[index], x, y, width, height,null);
	      if(this.mypanel.timer%1==0){
	    	  index++;
	    	  if(index==this.image.length)
	    		  index=0;
	    	  y--;//�ӵ���������
	    	  if(y<0)
	    		  //��������Ƴ��ӵ�
	    		   this.mypanel.bullt.remove(this);//���ӵ��Ƴ�
	      }
	
	
	
	}

}
