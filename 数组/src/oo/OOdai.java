package oo;

public class OOdai {
	public static void main(String[] args){
		int[] a={1,2,3,4,5};
		int[] reverse=reverse(a);
		Printa(reverse);
		
	}

	private static void Printa(int[] reverse) {
		for(int i=0;i<=reverse.length-1;i++){
			System.out.println(reverse[i]);
		}
		// TODO Auto-generated method stub
		
	}

	private static int[] reverse(int[] a) {
		// TODO Auto-generated method stub
		int[] result=new int[a.length];
		for(int i=0,j=result.length-1;i<a.length;i++,j--)
		{
			result[j]=a[i];
	}
		return result;
	}
}
