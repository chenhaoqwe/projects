package �������;

public class QQ03 {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n ; j++) 
			{
				System.out.print("");
			}
			for(int j=1;j<=i;j++)
			{
			    System.out.print(num(i,j)+"");
			}
			System.out.println();
		}
	}

	private static int num(int x, int y) {
		// TODO Auto-generated method stub
		if(y==1||y==x)
		{
			return 1;
		}
		int c=num(x-1,y-1)+num(x-1,y);
		return c;
	}
}
