package �ɻ���ս;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JPanel;


import javax.swing.JPanel;
public class MyPanel extends JPanel {

	//�洢����ͼƬ
	public Image bgImage;
	
	public int timer=0;
	
	public int top=0;
	
	public FjThread  fjthread;
	
	public Player player;
	//�����洢���е��ӵ�
	public ArrayList<Bullt> bullt=new  ArrayList<Bullt>();
	public MyPanel(){
		this.bgImage=Toolkit.getDefaultToolkit().getImage("E:\\��ϷͼƬ\\6.jpg");
	    
		this.player=new Player(this);
		this. fjthread=new FjThread(this); 
	    
	    this. fjthread.start();
	    
	}

	//������
	public void paintComponent(Graphics g)
	{	//���ø���
	 super.paintComponents(g);
	
	//���Ʊ���ͼ
	g.drawImage(this.bgImage, 0, top-this.bgImage.getHeight(this), this.bgImage.getWidth(this), this.bgImage.getHeight(this),null);
	g.drawImage(this.bgImage, 0,top, this.bgImage.getWidth(this), this.bgImage.getHeight(this),null);
	
	timer++;
	if(timer==10000)
		timer=0;
	//ʵ��ͼƬ���¹���
	if(timer%10==0){
		top++;
		if(top>=this.bgImage.getHeight(this))
		top=0;
	}
	//�������
	this.player.drawSelf(g);
	
		// �����ӵ�
		if (timer % 10 == 0) {
			// �����μ���ҵĻ���
			if(this.player.attact==1)
			{
				//�����ӵ�
				Bullt bullt =new Bullt(this);
				bullt.x=this.player.x+this.player.width/2-bullt.width/2;
			    bullt.y=this.player.y;
			    //����arraylist
			    this.bullt.add(bullt);
			
			}
			else if(this.player.attact==2){
				
				Bullt bullt1 =new Bullt(this);
				bullt1.x=this.player.x+this.player.width/2-bullt1.width/2;
			    bullt1.y=this.player.y-15;
			    //����arraylist
			    this.bullt.add(bullt1);

				Bullt bullt2 =new Bullt(this);
				bullt2.x=this.player.x+this.player.width/2-bullt2.width-5;
			    bullt2.y=this.player.y-15;
			    //����arraylist
			    this.bullt.add(bullt2);

				Bullt bullt3 =new Bullt(this);
				bullt3.x=this.player.x+this.player.width/2+bullt3.width+5;
			    bullt3.y=this.player.y-15;
			    //����arraylist
			    this.bullt.add(bullt3);
			}
			else if(this.player.attact==3){

				Bullt bullt1 =new Bullt(this);
				bullt1.x=this.player.x+this.player.width/2-bullt1.width/2;
			    bullt1.y=this.player.y-15;
			    //����arraylist
			    this.bullt.add(bullt1);

				Bullt bullt2 =new Bullt(this);
				bullt2.x=this.player.x+this.player.width/2-bullt2.width-5;
			    bullt2.y=this.player.y-15;
			    //����arraylist
			    this.bullt.add(bullt2);

				Bullt bullt3 =new Bullt(this);
				bullt3.x=this.player.x+this.player.width/2+bullt3.width+5;
			    bullt3.y=this.player.y-15;
			    //����arraylist
			    this.bullt.add(bullt3);

				Bullt bullt4 =new Bullt(this);
				bullt4.x=this.player.x+this.player.width/2-bullt4.width*2-5;
			    bullt4.y=this.player.y-15;
			    //����arraylist
			    this.bullt.add(bullt4);

				Bullt bullt5 =new Bullt(this);
				bullt5.x=this.player.x+this.player.width/2+bullt5.width*2+5;
			    bullt5.y=this.player.y-15;
			    //����arraylist
			    this.bullt.add(bullt5);
			}
		}
		
		for(int i=0;i<bullt.size();i++){
			this.bullt.get(i).drawSelf(g);
			
		}
	}
}
