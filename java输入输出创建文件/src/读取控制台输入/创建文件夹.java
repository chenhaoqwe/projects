package ��ȡ����̨����;
import java.io.File;
//mkdir( )��������һ���ļ��У��ɹ��򷵻�true��ʧ���򷵻�false��ʧ�ܱ���File����ָ����·���Ѿ����ڣ�������������·���������ڣ����ļ��в��ܱ�������
//mkdirs()��������һ���ļ��к��������и��ļ��С�
public class �����ļ��� {
    public static void main(String args[]) {
        String dirname = "E:/��ѧ/a";
        File d = new File(dirname);
        // ���ڴ���Ŀ¼
        d.mkdirs();
    }
}