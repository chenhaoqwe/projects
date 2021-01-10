package 连连看;
import java.util.Random;
import java.util.Scanner;
/*
 * 测试类
 */
public class Test {
	// 定义在类中方法之外的叫做去全局变量，可以在所有方法使用
	// 行长度
	int rows;
	// 列长度
	int cols;
	// 游戏等级
	int rank;
	// 二维数组
	int[][] board;
	Scanner sc=new Scanner(System.in);
	Random r1=new Random();
/*
 * 初始化操作
 */
	public void init() {
		A.a("************************************************************");
		A.a("********************欢迎进入连连看游戏社区************************");
		A.a("************************************************************");
 
		// 1.输入行长度，列长度，游戏等级（1-20）
		do{
			System.out.println("请输入行的长度");
			rows=sc.nextInt();
		}while(rows<2);
		do{
			System.out.println("请输入列的长度");
			cols=sc.nextInt();
		}while(cols<2||cols%2==1);
		do{
			System.out.println("请输入游戏等级(1-10)");
			rank=sc.nextInt();
		}while(rank<1||rank>10);
		
		// 2.创建二维数组对象

		board=new int[rows][cols];
	//代码执行到这里说明二维数组已经建立好了
		//3.随机赋值
		genBoard();
		// 4.打乱棋盘
		shuffle();
		// 5.显示棋盘
		showBoard();
		//6.开始游戏
		playGame();

	}

	/*
	 * 开始游戏
	 * 
	 */
	public void playGame() {
		boolean isOver=false;
		// 1。从键盘输入两个棋子下标
		do{
			System.out.println("请输入两颗棋子下标");
			int x1=sc.nextInt()-1;//数组下标从0开始，棋盘显示下标是从1开始
			int y1=sc.nextInt()-1;
			int x2=sc.nextInt()-1;
			int y2=sc.nextInt()-1;
			//判断是否可以消除
			if(doCheck(x1,y1,x2,y2)==true){
				board[x1][y1]=0;
				board[x2][y2]=0;
				//检查游戏是否结束
				isOver=isGameOver();
			}
			showBoard();
		}while(isOver==false);
		System.out.println("不好意思，游戏结束");
	}
	/*
	 * 随机赋值
	 */
	public void genBoard() {
		if(null==board){
			return ;
		}
		//循环行
		for(int i=0;i<rows;i++){
			//循环列
			for(int j=0;j<cols;j+=2){
				board[i][j]=r1.nextInt(rank)+1;//随机生成一个数，nextInt可以产生一个从0到括号里面的数字，但是不包括数字本身
				board[i][j+1]=board[i][j];//随机生成重复成对的
				//代码到这，一个成对重复的棋盘已经好了
			}
		}
	}

	/*
	 * 打乱棋盘
	 */
	public void shuffle(){
		//随机产生两个棋子下标，交换位置   此步骤必须执行多次（循环次确定  rows*cols*rank)
		for(int i=0;i<rows*cols*rank;i++){
			int x1=r1.nextInt(rows);
			int y1=r1.nextInt(cols);
			int x2=r1.nextInt(rows);
			int y2=r1.nextInt(cols);
			//这里应该可以弄个方法  判断如果x1,y1=x2,y2.则不要换
			//if(board[x1][y1]==board[x2][y2]){
			//}
			//如果不一样则进行交换
			int temp=board[x1][y1];
			board[x1][y1]=board[x2][y2];
			board[x2][y2]=temp;
		}
	}

	/*
	 * 显示棋盘
	 */
	public void showBoard() {
		if(null==board){
			return ;
		}
		showCols();
		showColsxin();
		//循环行
		for(int i=0;i<rows;i++){
			System.out.print((i+1)+"*\t");
			//循环列
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
	 * 显示列下标 从1开始
	 */
	public void showCols(){
		System.out.print("\t");
		for(int i=1;i<=cols;i++){
			System.out.print("*\t");
		}
		System.out.println();
	}
	/*
	 * 显示列
	 */
	public void showColsxin() {
		// TODO Auto-generated method stub
		System.out.print("\t");
		for(int i=1;i<=cols;i++){
			System.out.print("*\t");
		}
		System.out.println();
	}
	// 2.判断是否可以被消除
	public boolean doCheck(int x1,int y1,int x2,int y2){
		//1.相同点不可以被清除
		//&& 逻辑与   两个表达式都为true
		if(x1==x2 && y1==y2){
			System.out.println("同一颗棋子   无法消除");
			return false;
		}
		//2.两点值不相同不能消除      为零不能被消除
		if(board[x1][y1]==0 || board[x1][y1]!=board[x2][y2]){
			System.out.println("两个棋子值相同");
			return false;
		}
		//3.消除规则  只要一种满足就可以消除
		if(isOneLine( x1, y1, x2, y2)||isOneConner(x1, y1, x2, y2)||isTwoConner( x1, y1, x2, y2)){
			return true;
		}
		return false;
	}	
	/*
	 * 一条直线消除
	 */
	public boolean isOneLine(int x1,int y1,int x2,int y2){
		//同一行
		if(x1==x2){
			// 遍历 判断y1和y2的大小
			if (y1 > y2) {
				int temp = y1;
				y1 = y2;
				y2 = temp;
			}
			//再遍历y1和y2之间是否有为零的元素
		   for(int i=y1+1;i<y2;i++){
			   if(board[x1][i]==0){
				   return false;
			   }
		   }
			return true;
		}
		//同一列
		else if(y1==y2){
			// 遍历 判断y1和y2的大小
			if (x1 > x2) {
				int temp = x1;
				x1 = x2;
				x2 = temp;
			}
			//再遍历y1和y2之间是否有为零的元素
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
	 * 一个转角消除
	 */
	public boolean isOneConner(int x1,int y1,int x2,int y2){
		//转角消除   先行后列
		//1.判断转角点是否为零
		if(board[x1][y2]==0&& isOneLine(x1, y1, x1, y2) && isOneLine(x1, y1, x1, y2))
		{
			return true;
		}
		//2.先列后行
		if(board[x1][y2]==0&& isOneLine(x1, y1, x2, y1) && isOneLine(x2, y1, x2, y2))
		{return true;
	}
		return false;
	}
	
	
	/*
	 * 两个转角消除
	 */
	public boolean isTwoConner(int x1,int y1,int x2,int y2){
		//是否在边缘
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
	 * 边缘
	 */
	public  boolean isBound(int x1, int y1, int x2, int y2) {
	
		//上边缘  下边缘
		if(x1==x2&&(x1==0||x1==rows-1)){//下标从零开始 表示第一行的那个最边缘  或者最后一行的边缘
			return true;
		}
		//左边缘  右边缘
		if(y1==y2&&(y1==0||x1==cols-1)){
			return true;
		}
		//中间点x2,y1
		if((x2==0||x2==rows-1) && board[x2][y1]==0 && isOneLine(x2, y1, x1, y1)){
			return true;
		}
		//中间点x1,y2
		if((x1==0||x1==rows-1) && board[x1][y2]==0 && isOneLine(x1, y2, x2, y2)){
			return true;
		}
		//垂直位置x2 y1
		if((x1==0||y1==cols-1) && board[x2][y1]==0 && isOneLine(x2, y1, x2, y2)){
			return true;
		}
		//垂直位置x1  y2
		if((y2==0||y2==cols-1) && board[x1][y2]==0 && isOneLine(x1, y1, x1, y2)){
			return true;
		}
		
		return false;
	}
	
	/*
	 * 垂直位置
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
	 * 水平位置
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
	 * 判断游戏结束
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
