package Ͽ��;
public class Time {
	  public static void S(int b){
	  System.err.println("����ʱ" + b + "��,����ʱ��ʼ:");
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
	  System.err.println("����ʱ����");
	  System.exit(0);//�ر�Ӧ�ó��� ��ֹ�˷ѿռ�....
	 }
}

	 /**
	  * @param args
	  */
	