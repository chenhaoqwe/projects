package 下雪;
import javax.swing.JFrame;
import java.awt.*;

public class T extends JFrame implements Runnable {
    int y;
    public static void main(String[] args) {
        System.out.println("欢迎观看冬天的第一场雪");
        new T();
    }
    public T(){
        setTitle("2020年第一场雪");//标题
        setSize(1000,1000);//窗口大小
        setVisible(true);//程序的运行开始
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//运行结束
        new Thread( this).start ();
    }
    public void paint(Graphics g){//画笔
        super.paint(g);
        g.drawImage(Toolkit.getDefaultToolkit().getImage("E:\\html\\s\\微信图片_202012081528013.jpg"),0,0,this);
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
                Thread.sleep(500);//这里是毫秒
            } catch (Exception e) {
                e.printStackTrace( );
            }
        }

    }
}
