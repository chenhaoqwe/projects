package 读取控制台输入;
import java.io.File;
//mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
//mkdirs()方法创建一个文件夹和它的所有父文件夹。
public class 创建文件夹 {
    public static void main(String args[]) {
        String dirname = "E:/数学/a";
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
    }
}