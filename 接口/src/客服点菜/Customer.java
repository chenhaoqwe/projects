package �ͷ����;

public class Customer {
	//�˿��в˵�
	private Foodmeau meau;//�������������еļ̳�

	public Customer(Foodmeau meau) {
		this.meau=meau;
		// TODO Auto-generated constructor stub
	}

	/*���ڹ˿͵õ��˵�����Ϣ
	 * @return the meau
	 */
	public Foodmeau getMeau() {
		return meau;
	}

	/**���ڴ����˵����˿Ϳ�
	 * @param meau the meau to set
	 */
	public void setMeau(Foodmeau meau) {
		this.meau = meau;
	}
	//����һ����˵ķ���
	public void diancai(Foodmeau meau) {
		// TODO Auto-generated method stub
		meau.xihongshichaojidan();//���ýӿڵķ���
		meau.danchaofan();
	}

}
