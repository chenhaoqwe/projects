package ��ȡ����̨����;

import java.io.*;

public class BRReadLines {
    public static void main(String args[]) throws IOException {
        // ʹ�� System.in ���� BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.print("���Ƿ�Ը������Ů���ѣ�");
        System.out.println("��ֻ�ܻش�Ը���벻Ը��");
        System.out.println("\t");
        do {  str = br.readLine();
            System.out.println("������ȷ��һ�Σ������"+str);
            System.out.println("\t");
        } while (!str.equals("Ը��"));
    }
}