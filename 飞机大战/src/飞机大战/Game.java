package �ɻ���ս;

import javax.swing.JFrame;

import �ɻ���ս.GamePanel;

public class Game {

    public static void main(String[] args) {
        JFrame j = new JFrame(); //��������
        GamePanel g = new GamePanel(); //��������
        j.add(g); //��ӻ���
        j.setSize(400, 650);
        j.setTitle("PlaneWar"); //���ñ���
        j.setLocationRelativeTo(null); //���þ���
        j.setDefaultCloseOperation(3); //Ĭ�Ϲر�
        j.setVisible(true); //���ڿɼ���
        g.Move(); //����Move����
        j.addMouseListener(g); //��Ӽ�����
        j.addMouseMotionListener(g);

    }

}