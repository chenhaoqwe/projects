package ������;

import java.util.HashMap;

public class MapTest {
	
	
	//����
	String name;
	int age;
	//�в���������   һ�������Ϳ��Ը���������
	public MapTest(String name,int age){
		this.name=name;
		this.age=age;
	}
	//��дtostring����  ���ǵ�һ�����õ��ø÷���ʱ��  ������һ������ȥ��������ʱ��õ�����һ���ڴ��ַ  ��������дtostringʱ�� �᷵��һ���ַ�������Ҫ���ʵ����� ��
	//����ע��Ҫ��ʵ �������
	public String toString(){
		return "�ú�����"+name+"������"+age;
		
	}
	
	
	public static void main(String[] args){
		HashMap map=new HashMap();//����һ������ ���洢����
		 MapTest t1=new  MapTest("�º�",19);
	
		 map.put(1, t1);//Mapput(key,value) keyΪ�ؼ��� ͨ������ؼ������ҵ�value  t1��ʾ�洢�Ķ���  1���Ǹùؼ���
		 System.out.println(map.get(1));
	}

}
  