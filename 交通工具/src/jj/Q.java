package jj;

//����ʵ���������ȴ�������Ȼ������.����
public class Q {
    public static void main(String[] args)
    {
        ve v=new ve();//��������v������
        v.setSpeed(10);//
        v.setSize(10);
        System.out.println("�ٶȣ�"+v.getSpeed() );
        v.speedup(10);//���ü��ٷ���
        System.out.println("�ٶȣ�"+v.getSpeed() );
    }

}
class ve {
    private int speed;
    private int size;

    public void setSpeed(int speed) {
        this.speed = speed;

    }

	public int getSpeed() {
        return speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public void move(){
        System.out.println("��ͨ���ߣ�������");
    }
    public void speedup(int add){
    	this.setSpeed(this.getSpeed()+add);
    }
    public void speeddown(){
    	
    }
    
}

