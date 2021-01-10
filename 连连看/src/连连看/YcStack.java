package ������;

/*
 * ģ��ջ��ʵ��
 */
public class YcStack {
	//Ĭ������ĳ���Ϊmum
	private final int MUM=10;
	//�������������
	private Object[] elementDate;
	//ջָ�루����洢��Ԫ�صĸ�����
	private int top=0;
	
	
	/*
	 * �޲ι��췽�������ڴ�������
	 */
	public YcStack(){
		//����һ������Ϊmum��Object���͵����飬���������ֵ��Ϊ��
		elementDate=new Object[MUM];
		//��Ϊ�տ�ʼջ����Ԫ�أ�����top=0
		top=0;
	}
	/*
	 * ��ջ
	 */

	public void push(Object obj){
		//�ж��Ƿ���ջ
		if(top+1>elementDate.length){
			//��Ϊԭ����ջ�Ѿ����ˣ����Ծ�Ҫ���´���һ�����飬�������̬��������
			Object[] elementDate1=new Object[elementDate.length+elementDate.length>>1];
			//�µ����鴴���Ժ󣬾���Ҫ����ԭ����Ԫ�ظ��µ�
			System.arraycopy(elementDate, 0, elementDate1, 0, top);//ԭ���� ��ʼλ�� ������ ��ʼλ�� ����ԭ���Ķ���
			//��ԭ�������ö���ָ���µ�����
			elementDate=elementDate1;
		}
		//��û��  ����ջ�洢
	elementDate[top]=obj;
	top++;
	}
	/*
	 * ��ջ
	 */
	public Object pop(){
		//�ж��Ƿ�ջΪ��
		if(top<=0){
			System.err.println("ջ�Ѿ���");
			return null;
		}
		Object obj=elementDate[top-1];//�����±���㿪ʼ
		top--;
		//���ջ����λ�õ�Ԫ��
		elementDate=null;
		return obj;
	}
	/*
	 * ��ȡջ��Ԫ��
	 */
	public Object peek(){
		//�ж�ջ�Ƿ�Ϊ��
		if(top<=0){
			System.out.println("ջ������Ԫ�أ��޷���ȡ");
			return null;
		}
		return elementDate[top-1];
	}
	/*
	 * ���ջ
	 */
	public void empty(){
		if(top>0){
			elementDate=new Object[MUM];//��������ö���ָ��һ����ֵ����
		}
		System.out.println("ջ�Ѿ���");
		top=0;
	}
	
	
	
	
	
	
}
