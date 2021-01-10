package Êä³ö;

public class Test {
	public static void main(String[] args) {
		show();
		
		
	}
	public static void show() {
		System.out.println("***³É¼¨µ¥***");
		
	}

}
class Student{
	private String name;
	private double score;
	public Student(String name,double score) {
		this.name=name;
		this.score=score;
		
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}