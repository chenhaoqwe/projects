package swing��;

import javax.swing.JFrame;

public class Test extends JFrame{
	//
	public Panel panel;
	//�޲����Ĺ�����
	public Test(){
		setSize(1000,1000);//���ڴ�С
		setTitle("2020��һ��ѩ");//��������
		setVisible(true);//�ɼ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���
		//�������
		panel=new Panel();
		//�������ӵ���ǰ������ڵ�λ��
		panel.setBounds(200, 200,200, 200);
		//���
		add(this.panel);
		setLayout(null);
	}
public static void main(String[] args) {
	Test t1=new Test();
	
}
}
