package �������;

public class QQ2 {
	public static void main(String[] args){
		int n=6;
		for(int i=1;i<n;i++){
			for(int j=1;j<n-1;j++){
				System.out.print("");
			}
			//��ӡ�ո������ַ����ӵ�һ�п�ʼ���ӡ
			for(int j=1;j<=i;j++){
				System.out.print(num(i,j)+"");	
			}
			System.out.println();
		}
	}

	private static int num(int i, int j) {
		// TODO Auto-generated method stub
		if(j==1||j==i){
			return 1;
		}
		int c=num(i-1,j-1)+num(i-1,j);
		return c;
	}
}
