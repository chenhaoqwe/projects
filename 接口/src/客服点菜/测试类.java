package �ͷ����;

public class ������ {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Foodmeau meau=new China();//����һ����ʦ�����ö�̬�����������ָ������Ķ���
		Customer chenhao=new Customer(meau);//����һ���˿�
		chenhao.diancai(meau);//�˿Ϳ�ʼ���
	}
}
