package �����ĵݹ�;
/**
 * ��1�ӵ�10
 * @author chenhao
 *
 */
public class Day03 {
	public static void main(String[] args) {
		System.out.println(sumInt(1));
	}
	public static int sumInt(int i){
		if(i<=10){
			i++;
			sumInt(i);
			return i;
		}
		return i;
		
	
	}
}
	

