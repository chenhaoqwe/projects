package ��̬;

public class Master {
	public static void main(String[] args) {
		// �����ĵ��� new Feed().f().eat();
		// �򵥵�
		Feed feed = new Feed();//����ι�������
		Pet p = feed.f();//���ܴ���������    ֪���ǳ����൫�ǲ�֪����ô���� 
		p.eat();//���p������˭ ��ô�͵���˭�ķ��� ������֪������������˭�� �����Ҳ�֪�����������Ĺ���

	}

}
//���� �����
class Pet {
	public void eat() {

	}
}
//���� dog �̳���pet
class Dog extends Pet {
	public void eat() {
		System.out.println("ι�����Թ�ͷ");
	}
}
//ι����
class Feed {
	public Pet f() {//����һ��pet��Ķ���
		Pet a = new Dog();//������������
		return a;//��������

	}
}