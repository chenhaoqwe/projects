package 峡谷;
public class Time {
	  public static void S(int b){
	  System.err.println("倒计时" + b + "秒,倒计时开始:");
	  int i = b;
	  while (i > 0) {
	   System.err.println(i);
	   try {
	    Thread.sleep(1000);
	   } catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	   }
	   i--;
	  }
	  System.err.println(i);
	  System.err.println("倒计时结束");
	  System.exit(0);//关闭应用程序 防止浪费空间....
	 }
}

	 /**
	  * @param args
	  */
	