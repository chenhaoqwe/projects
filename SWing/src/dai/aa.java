package dai;
 
 
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 
import javax.swing.JButton;//按钮
import javax.swing.JFrame;//创建界面
import javax.swing.JLabel;//指定具体位置
import javax.swing.JPasswordField;//密码的隐藏
import javax.swing.JTextField;//一个轻量级组件，它允许编辑单行文本。
 
 
public class aa extends JFrame{
JTextField txtname=new JTextField();
JPasswordField txtpass=new JPasswordField();
JButton bl=new JButton("登录");
JButton bg=new JButton("关闭");
 
//构造无参构造器把主要的方法放在构造器里,然后在main方法里面调
public aa(){
setBounds(25,25,250,250);
Container c = getContentPane();
c.setLayout(new GridLayout(4,2,10,10));
c.add(new JLabel("用户名"));
c.add(txtname);
c.add(new JLabel("密码"));
c.add(txtpass);
c.add(bl);
c.add(bg);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
//注意：此处是匿名内部类
bg.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
System.exit(0);
}
});
 
              //注意：此处是匿名内部类
bl.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
String name = txtname.getText();
String pass = txtpass.getText();
if(name.equals("tom")&&pass.equals("123")){
System.out.println("登陆成功");
}else{
System.out.println("登录失败");
}
}
 
});
 
}
public static void main(String[] args) {
new aa();
}
}
