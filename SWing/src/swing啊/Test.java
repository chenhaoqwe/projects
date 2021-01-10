package swing啊;

import javax.swing.JFrame;

public class Test extends JFrame{
	//
	public Panel panel;
	//无参数的构造器
	public Test(){
		setSize(1000,1000);//窗口大小
		setTitle("2020第一场雪");//窗口名字
		setVisible(true);//可见
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口
		//创建面板
		panel=new Panel();
		//把面板添加到当前这个窗口的位置
		panel.setBounds(200, 200,200, 200);
		//添加
		add(this.panel);
		setLayout(null);
	}
public static void main(String[] args) {
	Test t1=new Test();
	
}
}
