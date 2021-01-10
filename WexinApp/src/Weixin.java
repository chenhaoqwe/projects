import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import sun.misc.BASE64Decoder;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

// 我们的微信客户端
public class Weixin
{
    // 运行程序的入口
    public static void main(String[] args) throws IOException
    {
        // 1创建一个客户端 - Mike老师客户(设置超时时间，耐心点)
        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(1, TimeUnit.MINUTES).readTimeout(1, TimeUnit.MINUTES).build();
        // 2创建一个请求 - Mike有需求，到哪里？
        Request request = new Request.Builder().url("https://login.wx.qq.com/jslogin?appid=wx782c26e4c19acffb&redirect_uri=https%3A%2F%2Fwx.qq.com%2Fcgi-bin%2Fmmwebwx-bin%2Fwebwxnewloginpage&fun=new&lang=en_US&_=16087284576511").build();
        // 3发起请求，得到响应 - Mike跟前台要求....
        Response response = client.newCall(request).execute();
        // 4得到响应代码 - 如果Mike有200块，没问题，否则……
        if (response.code() == 200)
        {
            // 有200，OK，提供服务给你
            String content = response.body().string();
            System.out.println(content);
            // 提取必要的内容，等会发起新的请求，得到二维码……
            String uuid = content.substring(content.indexOf("\"") + 1, content.lastIndexOf("\""));
            
            // 通过uuid发起请求得到二维码
            request = new Request.Builder().url("https://login.weixin.qq.com/qrcode/" + uuid).build();
            response = client.newCall(request).execute();
            // 二维码是图片，存在于stream流中
            ImageIcon image = new ImageIcon(response.body().bytes());
            
            // 显示二维码到窗口
            JLabel labelImage = new JLabel(image);
            JLabel labelText = new JLabel("扫一扫登录微信");
            labelText.setFont(new Font("微软雅黑", Font.BOLD, 24));
            labelText.setHorizontalAlignment(JLabel.CENTER);
            JFrame frame = new JFrame();
            frame.setTitle("微信客户端");
            frame.setSize(600, 800);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(labelImage);
            frame.getContentPane().add(labelText, BorderLayout.SOUTH);
            frame.setVisible(true);
            
            // 继续发起请求，判断是否有扫码
            request = new Request.Builder().url("https://login.wx.qq.com/cgi-bin/mmwebwx-bin/login?loginicon=true&uuid=" + uuid + "&tip=0&r=1883368322&_=1608729141228").build();
            response = client.newCall(request).execute();
            content = response.body().string();
            // 如果得到的响应含有408，说明没扫，继续发起请求
            while (content.contains("408"))
            {
                response = client.newCall(request).execute();
                content = response.body().string();
            }
            // 说明已经扫码，等待确认- 201 - 得到了头像
            content = content.substring(content.indexOf(",") + 1, content.lastIndexOf("'"));
            labelImage.setIcon(new ImageIcon(new BASE64Decoder().decodeBuffer(content)));
            labelText.setText("请在手机上点击确认登录");
        }
        else
        {
            System.out.println("大哥，这里没有霸王餐！程序结束！");
        }
    }
}
