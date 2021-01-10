package 计算机类;



import java.sql.SQLOutput;
import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args){
        int guessNumber=-1;
        while(true){
            int number=(int)Math.floor(Math.random()*100);//
            if(number!=0){
                Scanner sc=new Scanner(System.in);
                System.out.println( "是否开始游戏");
                System.out.println( "1.是  2.否" );
              String input=sc.nextLine();
                GuessContine(input,number,guessNumber);
            }
        }
    }
    public static void GuessContine(String input,int number,int guessNumber){
        if(input.equals("是")){
            System.out.println( "开始游戏！" );
            for(int i=0;i<=5;i++){
                try {Scanner sc1=new Scanner(System.in);
                System.out.println( "\n请输入你要猜的数据（1`100）" );
                guessNumber=sc1.nextInt();
                }catch (Exception e){}
                if (guessNumber==0){
                    System.out.println( "用户终止游戏" );
                    System.exit(0);
                }
                else if (guessNumber<=100&&guessNumber>0){
                    if (guessNumber==number){
                        System.out.println( "你赢了" );
                        break;
                    }
                    else{
                        GuessNum(guessNumber,i,number);
                        i++;
                        guessNumber=-1;
                    }
                    if (i==5){
                        System.out.println( "你失去\n" );
                        break;
                    }
                }
                else {
                    System.out.println("请输入1`100的整数" );
                }
            }
        }
        else if(input.equals("否")){
            System.out.println("退出游戏" );
            System.exit(0);
        }
        else {
            System.out.println( "请输入正确的选择（1或2）" );
        }
    }
    public static void GuessNum(int gusessNumber,int i,int number){
        if (gusessNumber>number){
            System.out.println("您猜的数字"+gusessNumber+"\ttoo hight"+ "您还剩"+(4-i)+"次机会");
        }
        else  if (gusessNumber < number) {
            System.out.println("您猜的数字" + gusessNumber + "\tto small" + ",您还剩" + (4 - i) + "次机会");
        }
    }



}