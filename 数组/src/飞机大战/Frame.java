package 飞机大战;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Frame implements MouseListener{

	public Xiaojiejie xiaijieje;
	@Override
	//鼠标单击  监听器
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		this.xiaijieje.mypanel.player.x=e.getX()-this.xiaijieje.mypanel.player.width/2;
		this.xiaijieje.mypanel.player.y=e.getY()-this.xiaijieje.mypanel.player.height/2;  
	      
	
	
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
