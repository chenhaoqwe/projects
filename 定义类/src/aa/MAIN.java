package aa;

public class MAIN {
 
	public static void main(String[] args) {
		MAIN m=new MAIN();
		
		
		System.out.println(m.method(1,2));
	}
	public int method(int m,int n){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		return n*m;
	}
}
