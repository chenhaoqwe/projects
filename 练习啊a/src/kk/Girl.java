/**
 * 
 */
package kk;

/**
 * @author chenhao
 *
 */
public class Girl {
	
	
	public static void main(String[] args) {
		Boy.marry(new Girl());
		
	}
	private String name;
	private int age;
	
	/**
	 * 
	 */
	public Girl() {
		name="Íõö¦";
		age=18;
		// TODO Auto-generated constructor stub
	}


	public Girl(String naem,int age) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String toString(){
		return name+age;
	}

	
}
