package �������;



import java.sql.SQLOutput;
import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args){
        int guessNumber=-1;
        while(true){
            int number=(int)Math.floor(Math.random()*100);//
            if(number!=0){
                Scanner sc=new Scanner(System.in);
                System.out.println( "�Ƿ�ʼ��Ϸ");
                System.out.println( "1.��  2.��" );
              String input=sc.nextLine();
                GuessContine(input,number,guessNumber);
            }
        }
    }
    public static void GuessContine(String input,int number,int guessNumber){
        if(input.equals("��")){
            System.out.println( "��ʼ��Ϸ��" );
            for(int i=0;i<=5;i++){
                try {Scanner sc1=new Scanner(System.in);
                System.out.println( "\n��������Ҫ�µ����ݣ�1`100��" );
                guessNumber=sc1.nextInt();
                }catch (Exception e){}
                if (guessNumber==0){
                    System.out.println( "�û���ֹ��Ϸ" );
                    System.exit(0);
                }
                else if (guessNumber<=100&&guessNumber>0){
                    if (guessNumber==number){
                        System.out.println( "��Ӯ��" );
                        break;
                    }
                    else{
                        GuessNum(guessNumber,i,number);
                        i++;
                        guessNumber=-1;
                    }
                    if (i==5){
                        System.out.println( "��ʧȥ\n" );
                        break;
                    }
                }
                else {
                    System.out.println("������1`100������" );
                }
            }
        }
        else if(input.equals("��")){
            System.out.println("�˳���Ϸ" );
            System.exit(0);
        }
        else {
            System.out.println( "��������ȷ��ѡ��1��2��" );
        }
    }
    public static void GuessNum(int gusessNumber,int i,int number){
        if (gusessNumber>number){
            System.out.println("���µ�����"+gusessNumber+"\ttoo hight"+ "����ʣ"+(4-i)+"�λ���");
        }
        else  if (gusessNumber < number) {
            System.out.println("���µ�����" + gusessNumber + "\tto small" + ",����ʣ" + (4 - i) + "�λ���");
        }
    }



}