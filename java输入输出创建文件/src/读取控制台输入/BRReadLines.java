package 读取控制台输入;

import java.io.*;

public class BRReadLines {
    public static void main(String args[]) throws IOException {
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.print("你是否愿意做我女朋友？");
        System.out.println("你只能回答愿意与不愿意");
        System.out.println("\t");
        do {  str = br.readLine();
            System.out.println("请你再确定一次，真的是"+str);
            System.out.println("\t");
        } while (!str.equals("愿意"));
    }
}