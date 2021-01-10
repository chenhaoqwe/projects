package 异常;

public class Colok {
	public static void main(String[] args) {
		System.out.println(new Colok());
	}
	//成员属性
	private int hour;
	private int minute;
	private int second;
	public Colok() {
		
	}
	public Colok(int hour,int minute,int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public static void incSecond(Colok colok) {
		if(++colok.second<60) {
			System.out.println(colok);
		}
		colok.second=0;
		if(++colok.minute<60) 	{
			System.out.println(colok);
		}
	    colok.minute=0;
		if(++colok.hour<24) {		
			System.out.println(colok);
		
		}
		colok.second=0;
		System.out.println(colok);	
	}
	@Override
	public String toString() {
		return "时:" + hour + " 分:" + minute + " 秒:" + second;
	}
	

}
