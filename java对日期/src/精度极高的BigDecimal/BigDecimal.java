package 精度极高的BigDecimal;

import java.math.BigDecimal;
public class BigDecimal {
    public static void main(String[] args){
        BigDecimal v1=new BigDecimal(100);
        BigDecimal v2=new BigDecimal(100);
        //v1+v2这样不行，v1和v2都是引用，不能直接求和
        //调用方法求和
        BigDecimal v3=((java.math.BigDecimal) v1).add(v2);
        System.out.println(v3 );
    }
}
