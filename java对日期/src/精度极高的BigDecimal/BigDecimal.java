package ���ȼ��ߵ�BigDecimal;

import java.math.BigDecimal;
public class BigDecimal {
    public static void main(String[] args){
        BigDecimal v1=new BigDecimal(100);
        BigDecimal v2=new BigDecimal(100);
        //v1+v2�������У�v1��v2�������ã�����ֱ�����
        //���÷������
        BigDecimal v3=((java.math.BigDecimal) v1).add(v2);
        System.out.println(v3 );
    }
}
