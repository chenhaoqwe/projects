package swing��;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Panel extends JPanel{
	public Image image;
	
	//�޲������췽��
	public Panel(){
		this.image=Toolkit.getDefaultToolkit().getImage("E:\\html\\ͼƬ\\1.png");
	}
	public void paintComponent(Graphics g)
	{	//���ø���
	 super.paintComponents(g);
	
	//���Ʊ���ͼ
	g.drawImage(this.image, 0, 0, 200, 200,null);

}
}
