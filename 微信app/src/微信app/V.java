package ΢��app;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import sun.misc.BASE64Decoder;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

// ���ǵ�΢�ſͻ���
public class Weixin
{
    // ���г�������
    public static void main(String[] args) throws IOException
    {
        // 1����һ���ͻ��� - Mike��ʦ�ͻ�(���ó�ʱʱ�䣬���ĵ�)
        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(1, TimeUnit.MINUTES).readTimeout(1, TimeUnit.MINUTES).build();
        // 2����һ������ - Mike�����󣬵����
        Request request = new Request.Builder().url("https://login.wx.qq.com/jslogin?appid=wx782c26e4c19acffb&redirect_uri=https%3A%2F%2Fwx.qq.com%2Fcgi-bin%2Fmmwebwx-bin%2Fwebwxnewloginpage&fun=new&lang=en_US&_=16087284576511").build();
        // 3�������󣬵õ���Ӧ - Mike��ǰ̨Ҫ��....
        Response response = client.newCall(request).execute();
        // 4�õ���Ӧ���� - ���Mike��200�飬û���⣬���򡭡�
        if (response.code() == 200)
        {
            // ��200��OK���ṩ�������
            String content = response.body().string();
            System.out.println(content);
            // ��ȡ��Ҫ�����ݣ��Ȼᷢ���µ����󣬵õ���ά�롭��
            String uuid = content.substring(content.indexOf("\"") + 1, content.lastIndexOf("\""));
            
            // ͨ��uuid��������õ���ά��
            request = new Request.Builder().url("https://login.weixin.qq.com/qrcode/" + uuid).build();
            response = client.newCall(request).execute();
            // ��ά����ͼƬ��������stream����
            ImageIcon image = new ImageIcon(response.body().bytes());
            
            // ��ʾ��ά�뵽����
            JLabel labelImage = new JLabel(image);
            JLabel labelText = new JLabel("ɨһɨ��¼΢��");
            labelText.setFont(new Font("΢���ź�", Font.BOLD, 24));
            labelText.setHorizontalAlignment(JLabel.CENTER);
            JFrame frame = new JFrame();
            frame.setTitle("΢�ſͻ���");
            frame.setSize(600, 800);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(labelImage);
            frame.getContentPane().add(labelText, BorderLayout.SOUTH);
            frame.setVisible(true);
            
            // �������������ж��Ƿ���ɨ��
            request = new Request.Builder().url("https://login.wx.qq.com/cgi-bin/mmwebwx-bin/login?loginicon=true&uuid=" + uuid + "&tip=0&r=1883368322&_=1608729141228").build();
            response = client.newCall(request).execute();
            content = response.body().string();
            // ����õ�����Ӧ����408��˵��ûɨ��������������
            while (content.contains("408"))
            {
                response = client.newCall(request).execute();
                content = response.body().string();
            }
            // ˵���Ѿ�ɨ�룬�ȴ�ȷ��- 201 - �õ���ͷ��
            content = content.substring(content.indexOf(",") + 1, content.lastIndexOf("'"));
            labelImage.setIcon(new ImageIcon(new BASE64Decoder().decodeBuffer(content)));
            labelText.setText("�����ֻ��ϵ��ȷ�ϵ�¼");
        }
        else
        {
            System.out.println("��磬����û�а����ͣ����������");
        }
    }
}
