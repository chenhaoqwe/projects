package 飞机大战;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class Xiaojiejie extends JFrame{
	
	public static int frameWidth=460;
	
	public static int frameHeight=768;
	
	public MyPanel mypanel;//面板
	
	public Frame framemouse;//鼠标监听器
	public Xiaojiejie(){
		
		//标题
		super("飞机大战");
		// 获得屏幕的分辨率
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// 设置窗口的大小和位置
		setBounds((int) (screenSize.getWidth() - frameWidth) / 2, 0,
				frameWidth, frameHeight);

		// 布局
		setLayout(null);
		// 显示窗口
		setVisible(true);
		// 设置窗口关闭
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
		//创建一个Mypanel 对象
		this.mypanel=new MyPanel();
	   
		//设置对象和大小
		this.mypanel.setBounds(0, 0,frameWidth, frameHeight);
		//将组件添加到窗口中
		this.add(this.mypanel);
		//设置监听器
		Set();
	}
	public void Set(){
		this.framemouse=new Frame();
		this.framemouse.xiaijieje=this;
		this.addMouseListener(this.framemouse);
	}
}
