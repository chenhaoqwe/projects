package 飞机大战;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JPanel;


import javax.swing.JPanel;
public class MyPanel extends JPanel {

	//存储背景图片
	public Image bgImage;
	
	public int timer=0;
	
	public int top=0;
	
	public FjThread  fjthread;
	
	public Player player;
	//创建存储所有的子弹
	public ArrayList<Bullt> bullt=new  ArrayList<Bullt>();
	public MyPanel(){
		this.bgImage=Toolkit.getDefaultToolkit().getImage("E:\\游戏图片\\6.jpg");
	    
		this.player=new Player(this);
		this. fjthread=new FjThread(this); 
	    
	    this. fjthread.start();
	    
	}

	//画背景
	public void paintComponent(Graphics g)
	{	//调用父类
	 super.paintComponents(g);
	
	//绘制背景图
	g.drawImage(this.bgImage, 0, top-this.bgImage.getHeight(this), this.bgImage.getWidth(this), this.bgImage.getHeight(this),null);
	g.drawImage(this.bgImage, 0,top, this.bgImage.getWidth(this), this.bgImage.getHeight(this),null);
	
	timer++;
	if(timer==10000)
		timer=0;
	//实现图片向下滚动
	if(timer%10==0){
		top++;
		if(top>=this.bgImage.getHeight(this))
		top=0;
	}
	//绘制玩家
	this.player.drawSelf(g);
	
		// 绘制子弹
		if (timer % 10 == 0) {
			// 根据梦见玩家的火力
			if(this.player.attact==1)
			{
				//创建子弹
				Bullt bullt =new Bullt(this);
				bullt.x=this.player.x+this.player.width/2-bullt.width/2;
			    bullt.y=this.player.y;
			    //存入arraylist
			    this.bullt.add(bullt);
			
			}
			else if(this.player.attact==2){
				
				Bullt bullt1 =new Bullt(this);
				bullt1.x=this.player.x+this.player.width/2-bullt1.width/2;
			    bullt1.y=this.player.y-15;
			    //存入arraylist
			    this.bullt.add(bullt1);

				Bullt bullt2 =new Bullt(this);
				bullt2.x=this.player.x+this.player.width/2-bullt2.width-5;
			    bullt2.y=this.player.y-15;
			    //存入arraylist
			    this.bullt.add(bullt2);

				Bullt bullt3 =new Bullt(this);
				bullt3.x=this.player.x+this.player.width/2+bullt3.width+5;
			    bullt3.y=this.player.y-15;
			    //存入arraylist
			    this.bullt.add(bullt3);
			}
			else if(this.player.attact==3){

				Bullt bullt1 =new Bullt(this);
				bullt1.x=this.player.x+this.player.width/2-bullt1.width/2;
			    bullt1.y=this.player.y-15;
			    //存入arraylist
			    this.bullt.add(bullt1);

				Bullt bullt2 =new Bullt(this);
				bullt2.x=this.player.x+this.player.width/2-bullt2.width-5;
			    bullt2.y=this.player.y-15;
			    //存入arraylist
			    this.bullt.add(bullt2);

				Bullt bullt3 =new Bullt(this);
				bullt3.x=this.player.x+this.player.width/2+bullt3.width+5;
			    bullt3.y=this.player.y-15;
			    //存入arraylist
			    this.bullt.add(bullt3);

				Bullt bullt4 =new Bullt(this);
				bullt4.x=this.player.x+this.player.width/2-bullt4.width*2-5;
			    bullt4.y=this.player.y-15;
			    //存入arraylist
			    this.bullt.add(bullt4);

				Bullt bullt5 =new Bullt(this);
				bullt5.x=this.player.x+this.player.width/2+bullt5.width*2+5;
			    bullt5.y=this.player.y-15;
			    //存入arraylist
			    this.bullt.add(bullt5);
			}
		}
		
		for(int i=0;i<bullt.size();i++){
			this.bullt.get(i).drawSelf(g);
			
		}
	}
}
