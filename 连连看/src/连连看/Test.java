package ������;
import java.util.Random;
import java.util.Scanner;
/*
 * ������
 */
public class Test {
	// ���������з���֮��Ľ���ȥȫ�ֱ��������������з���ʹ��
	// �г���
	int rows;
	// �г���
	int cols;
	// ��Ϸ�ȼ�
	int rank;
	// ��ά����
	int[][] board;
	Scanner sc=new Scanner(System.in);
	Random r1=new Random();
/*
 * ��ʼ������
 */
	public void init() {
		A.a("************************************************************");
		A.a("********************��ӭ������������Ϸ����************************");
		A.a("************************************************************");
 
		// 1.�����г��ȣ��г��ȣ���Ϸ�ȼ���1-20��
		do{
			System.out.println("�������еĳ���");
			rows=sc.nextInt();
		}while(rows<2);
		do{
			System.out.println("�������еĳ���");
			cols=sc.nextInt();
		}while(cols<2||cols%2==1);
		do{
			System.out.println("��������Ϸ�ȼ�(1-10)");
			rank=sc.nextInt();
		}while(rank<1||rank>10);
		
		// 2.������ά�������

		board=new int[rows][cols];
	//����ִ�е�����˵����ά�����Ѿ���������
		//3.�����ֵ
		genBoard();
		// 4.��������
		shuffle();
		// 5.��ʾ����
		showBoard();
		//6.��ʼ��Ϸ
		playGame();

	}

	/*
	 * ��ʼ��Ϸ
	 * 
	 */
	public void playGame() {
		boolean isOver=false;
		// 1���Ӽ����������������±�
		do{
			System.out.println("���������������±�");
			int x1=sc.nextInt()-1;//�����±��0��ʼ��������ʾ�±��Ǵ�1��ʼ
			int y1=sc.nextInt()-1;
			int x2=sc.nextInt()-1;
			int y2=sc.nextInt()-1;
			//�ж��Ƿ��������
			if(doCheck(x1,y1,x2,y2)==true){
				board[x1][y1]=0;
				board[x2][y2]=0;
				//�����Ϸ�Ƿ����
				isOver=isGameOver();
			}
			showBoard();
		}while(isOver==false);
		System.out.println("������˼����Ϸ����");
	}
	/*
	 * �����ֵ
	 */
	public void genBoard() {
		if(null==board){
			return ;
		}
		//ѭ����
		for(int i=0;i<rows;i++){
			//ѭ����
			for(int j=0;j<cols;j+=2){
				board[i][j]=r1.nextInt(rank)+1;//�������һ������nextInt���Բ���һ����0��������������֣����ǲ��������ֱ���
				board[i][j+1]=board[i][j];//��������ظ��ɶԵ�
				//���뵽�⣬һ���ɶ��ظ��������Ѿ�����
			}
		}
	}

	/*
	 * ��������
	 */
	public void shuffle(){
		//����������������±꣬����λ��   �˲������ִ�ж�Σ�ѭ����ȷ��  rows*cols*rank)
		for(int i=0;i<rows*cols*rank;i++){
			int x1=r1.nextInt(rows);
			int y1=r1.nextInt(cols);
			int x2=r1.nextInt(rows);
			int y2=r1.nextInt(cols);
			//����Ӧ�ÿ���Ū������  �ж����x1,y1=x2,y2.��Ҫ��
			//if(board[x1][y1]==board[x2][y2]){
			//}
			//�����һ������н���
			int temp=board[x1][y1];
			board[x1][y1]=board[x2][y2];
			board[x2][y2]=temp;
		}
	}

	/*
	 * ��ʾ����
	 */
	public void showBoard() {
		if(null==board){
			return ;
		}
		showCols();
		showColsxin();
		//ѭ����
		for(int i=0;i<rows;i++){
			System.out.print((i+1)+"*\t");
			//ѭ����
			for(int j=0;j<cols;j++){
				if(board[i][j]==0){
					System.out.print("\t");
				}
				else{
					System.out.print(board[i][j]+"\t");
				}
			}
			System.out.print("*"+(i+1));
			System.out.println();
		}
		showColsxin();
		showCols();
	}
	

	/*
	 * ��ʾ���±� ��1��ʼ
	 */
	public void showCols(){
		System.out.print("\t");
		for(int i=1;i<=cols;i++){
			System.out.print("*\t");
		}
		System.out.println();
	}
	/*
	 * ��ʾ��
	 */
	public void showColsxin() {
		// TODO Auto-generated method stub
		System.out.print("\t");
		for(int i=1;i<=cols;i++){
			System.out.print("*\t");
		}
		System.out.println();
	}
	// 2.�ж��Ƿ���Ա�����
	public boolean doCheck(int x1,int y1,int x2,int y2){
		//1.��ͬ�㲻���Ա����
		//&& �߼���   �������ʽ��Ϊtrue
		if(x1==x2 && y1==y2){
			System.out.println("ͬһ������   �޷�����");
			return false;
		}
		//2.����ֵ����ͬ��������      Ϊ�㲻�ܱ�����
		if(board[x1][y1]==0 || board[x1][y1]!=board[x2][y2]){
			System.out.println("��������ֵ��ͬ");
			return false;
		}
		//3.��������  ֻҪһ������Ϳ�������
		if(isOneLine( x1, y1, x2, y2)||isOneConner(x1, y1, x2, y2)||isTwoConner( x1, y1, x2, y2)){
			return true;
		}
		return false;
	}	
	/*
	 * һ��ֱ������
	 */
	public boolean isOneLine(int x1,int y1,int x2,int y2){
		//ͬһ��
		if(x1==x2){
			// ���� �ж�y1��y2�Ĵ�С
			if (y1 > y2) {
				int temp = y1;
				y1 = y2;
				y2 = temp;
			}
			//�ٱ���y1��y2֮���Ƿ���Ϊ���Ԫ��
		   for(int i=y1+1;i<y2;i++){
			   if(board[x1][i]==0){
				   return false;
			   }
		   }
			return true;
		}
		//ͬһ��
		else if(y1==y2){
			// ���� �ж�y1��y2�Ĵ�С
			if (x1 > x2) {
				int temp = x1;
				x1 = x2;
				x2 = temp;
			}
			//�ٱ���y1��y2֮���Ƿ���Ϊ���Ԫ��
		   for(int i=x1+1;i<y2;i++){
			   if(board[i][y1]!=0){
				   return false;
			   }
		   }
			return true;
		}
		return false;
	}
	
	
	/*
	 * һ��ת������
	 */
	public boolean isOneConner(int x1,int y1,int x2,int y2){
		//ת������   ���к���
		//1.�ж�ת�ǵ��Ƿ�Ϊ��
		if(board[x1][y2]==0&& isOneLine(x1, y1, x1, y2) && isOneLine(x1, y1, x1, y2))
		{
			return true;
		}
		//2.���к���
		if(board[x1][y2]==0&& isOneLine(x1, y1, x2, y1) && isOneLine(x2, y1, x2, y2))
		{return true;
	}
		return false;
	}
	
	
	/*
	 * ����ת������
	 */
	public boolean isTwoConner(int x1,int y1,int x2,int y2){
		//�Ƿ��ڱ�Ե
		if(isBound(x1,x2,y1,y2)){
			return true;
		}
		if(x1==x2){
			return isHorzable(x1,y1,x2,y2);
		}
		else if(y1==y2){
			return isVerible(x1,y1,x2,y2);
		}
		else{
			boolean flag=isHorzable(x1,y1,x2,y2);
			if(flag==false){
				flag=isVerible(x1,y1,x2,y2);
			}
			return flag;
		}
	}

	/*
	 * ��Ե
	 */
	public  boolean isBound(int x1, int y1, int x2, int y2) {
	
		//�ϱ�Ե  �±�Ե
		if(x1==x2&&(x1==0||x1==rows-1)){//�±���㿪ʼ ��ʾ��һ�е��Ǹ����Ե  �������һ�еı�Ե
			return true;
		}
		//���Ե  �ұ�Ե
		if(y1==y2&&(y1==0||x1==cols-1)){
			return true;
		}
		//�м��x2,y1
		if((x2==0||x2==rows-1) && board[x2][y1]==0 && isOneLine(x2, y1, x1, y1)){
			return true;
		}
		//�м��x1,y2
		if((x1==0||x1==rows-1) && board[x1][y2]==0 && isOneLine(x1, y2, x2, y2)){
			return true;
		}
		//��ֱλ��x2 y1
		if((x1==0||y1==cols-1) && board[x2][y1]==0 && isOneLine(x2, y1, x2, y2)){
			return true;
		}
		//��ֱλ��x1  y2
		if((y2==0||y2==cols-1) && board[x1][y2]==0 && isOneLine(x1, y1, x1, y2)){
			return true;
		}
		
		return false;
	}
	
	/*
	 * ��ֱλ��
	 */
	public boolean isVerible(int x1, int y1, int x2, int y2){
		for(int i=0;i<cols;i++){
			if(x1==i){
				continue;
			}
			int leftx =x1;
			int lefty =i;
			int rightx =x2;
			int righty =i;
			if(board[leftx][lefty]==0
				&& isOneLine(x1,y1,leftx,lefty)
				&& isOneConner(leftx,lefty,x2,y2)
				&& board[rightx][righty]==0
				&& isOneLine(x2,y2,rightx,righty)
				&& isOneConner(rightx,righty,x1,y1)){
				return true;
			}
		}
		return false;
		
	}
	/**
	 * ˮƽλ��
	 * @return
	 */
	public boolean isHorzable(int x1, int y1, int x2, int y2){
	
		for(int i=0;i<rows;i++){
			if(x1==i){
				continue;
			}
			int leftx =i;
			int lefty =x1;
			int rightx =i;
			int righty =y2;
			if(board[leftx][lefty]==0
				&& isOneLine(x1,y1,leftx,lefty)
				&& isOneConner(leftx,lefty,x2,y2)
				&& board[rightx][righty]==0
				&& isOneLine(x2,y2,rightx,righty)
				&& isOneConner(rightx,righty,x1,y1)){
				return true;
			}
		}
		return false;
		
	}

	/*
	 * �ж���Ϸ����
	 */
	private boolean isGameOver() {
		// TODO Auto-generated method stub
		for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j+=2){
			if(board[i][j]!=0){
				return false;
			}
		}
	}
		return true;
	}

	

}
