package ��װ;

/*
 * 1OOP�Ľ���1.1OOP���ص��װ��
 * ��������̵ĺ���˼�룬����������Ժ���Ϊ��װ����
 * ����������Ժ���Ϊ��װ���������������
 * ���ǳ���ģ������Ե�ϸ�ں���Ϊ���أ�private�������Ƿ�װ
 */
public class ZhangSan {
	String name="����";
	int age=19;
	private int money;//��װ��˼��  ����ֱ�ӷ���  ����Ҫͨ��ĳ���ֶ�
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void eat() {
		System.out.println("�˻�Է�");
	}

}
