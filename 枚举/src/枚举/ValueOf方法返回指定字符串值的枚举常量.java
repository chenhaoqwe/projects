package ö��;


public class ValueOf��������ָ���ַ���ֵ��ö�ٳ���
{
    public static void main(String[] args)
    {
        // ���� value
        Color[] arr = Cos()lor.values();
 
        // ����ö��
        for (Color col : arr)
        {
            // �鿴����
            System.out.println(col + " at index " + col.ordinal());//ordinal()���������ҵ�ÿ��ö�ٳ�����������������������һ��
        }
 
        // ʹ�� valueOf() ����ö�ٳ����������ڵĻᱨ�� IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE"));
    }
}