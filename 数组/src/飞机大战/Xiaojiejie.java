package �ɻ���ս;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class Xiaojiejie extends JFrame{
	
	public static int frameWidth=460;
	
	public static int frameHeight=768;
	
	public MyPanel mypanel;//���
	
	public Frame framemouse;//��������
	public Xiaojiejie(){
		
		//����
		super("�ɻ���ս");
		// �����Ļ�ķֱ���
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// ���ô��ڵĴ�С��λ��
		setBounds((int) (screenSize.getWidth() - frameWidth) / 2, 0,
				frameWidth, frameHeight);

		// ����
		setLayout(null);
		// ��ʾ����
		setVisible(true);
		// ���ô��ڹر�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
		//����һ��Mypanel ����
		this.mypanel=new MyPanel();
	   
		//���ö���ʹ�С
		this.mypanel.setBounds(0, 0,frameWidth, frameHeight);
		//�������ӵ�������
		this.add(this.mypanel);
		//���ü�����
		Set();
	}
	public void Set(){
		this.framemouse=new Frame();
		this.framemouse.xiaijieje=this;
		this.addMouseListener(this.framemouse);
	}
}
