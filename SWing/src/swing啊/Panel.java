package swing啊;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Panel extends JPanel{
	public Image image;
	
	//无参数构造方法
	public Panel(){
		this.image=Toolkit.getDefaultToolkit().getImage("E:\\html\\图片\\1.png");
	}
	public void paintComponent(Graphics g)
	{	//调用父类
	 super.paintComponents(g);
	
	//绘制背景图
	g.drawImage(this.image, 0, 0, 200, 200,null);

}
}
