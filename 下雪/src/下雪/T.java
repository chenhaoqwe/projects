package ��ѩ;
import javax.swing.JFrame;
import java.awt.*;

public class T extends JFrame implements Runnable {
    int y;
    public static void main(String[] args) {
        System.out.println("��ӭ�ۿ�����ĵ�һ��ѩ");
        new T();
    }
    public T(){
        setTitle("2020���һ��ѩ");//����
        setSize(1000,1000);//���ڴ�С
        setVisible(true);//��������п�ʼ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���н���
        new Thread( this).start ();
    }
    public void paint(Graphics g){//����
        super.paint(g);
        g.drawImage(Toolkit.getDefaultToolkit().getImage("E:\\html\\s\\΢��ͼƬ_202012081528013.jpg"),0,0,this);
        g.setColor(Color.red);
        g.drawString("*",100,y);
        g.drawString("*",200,y);
        g.drawString("*",300,y);
        g.drawString("*",400,y);
        g.drawString("*",500,y);
        g.drawString("*",600,y);





    }

    @Override
    public void run() {
        while (true){
            try {
                y=y+50;
                Thread.sleep(500);//�����Ǻ���
            } catch (Exception e) {
                e.printStackTrace( );
            }
        }

    }
}
