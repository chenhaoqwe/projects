package dai;
 
 
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 
import javax.swing.JButton;//��ť
import javax.swing.JFrame;//��������
import javax.swing.JLabel;//ָ������λ��
import javax.swing.JPasswordField;//���������
import javax.swing.JTextField;//һ�������������������༭�����ı���
 
 
public class aa extends JFrame{
JTextField txtname=new JTextField();
JPasswordField txtpass=new JPasswordField();
JButton bl=new JButton("��¼");
JButton bg=new JButton("�ر�");
 
//�����޲ι���������Ҫ�ķ������ڹ�������,Ȼ����main���������
public aa(){
setBounds(25,25,250,250);
Container c = getContentPane();
c.setLayout(new GridLayout(4,2,10,10));
c.add(new JLabel("�û���"));
c.add(txtname);
c.add(new JLabel("����"));
c.add(txtpass);
c.add(bl);
c.add(bg);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
//ע�⣺�˴��������ڲ���
bg.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
System.exit(0);
}
});
 
              //ע�⣺�˴��������ڲ���
bl.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
String name = txtname.getText();
String pass = txtpass.getText();
if(name.equals("tom")&&pass.equals("123")){
System.out.println("��½�ɹ�");
}else{
System.out.println("��¼ʧ��");
}
}
 
});
 
}
public static void main(String[] args) {
new aa();
}
}
