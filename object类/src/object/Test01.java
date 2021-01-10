package object;
/**
 * tostring一定要重写，越简单越翔实越好
 * @author chenhao
 *
 */
public class Test01 {
	public static void main(String[] args) {

		mytime my=new mytime(2020,12,15);
		String a=my.tostring();
		System.out.println(a);
		
	}
}

class mytime {
	int year;
	int month;
	int day;

	

	public  mytime() {

	}

	public  mytime(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;

	}
	public String tostring(){
		return this.year+"年"+this.month+"月"+this.day+"日";
		
	}
}