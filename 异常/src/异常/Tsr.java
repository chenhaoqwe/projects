package 异常;
/*
 * 求两个整数商   并且要求使用异常捕获当分母为零时
 */

public class Tsr {
	//程序的入口
	public static void main(String[] args) {
		//
		sumDevied(2,0);
	}
	@SuppressWarnings("unused")
	public static void sumDevied(int a,int b){
		try {
			int c=a/b;
			System.out.println(c);
			//如果代码到这里说明了分母不为零
		} catch (Exception e) {
			System.out.println("分母不能为零");
			// TODO: handle exception
		}
	
		
		
	}

}
