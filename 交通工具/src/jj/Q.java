package jj;

//调用实例方法。先创建对象，然后引用.方法
public class Q {
    public static void main(String[] args)
    {
        ve v=new ve();//创建对象。v是引用
        v.setSpeed(10);//
        v.setSize(10);
        System.out.println("速度："+v.getSpeed() );
        v.speedup(10);//调用加速方法
        System.out.println("速度："+v.getSpeed() );
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
        System.out.println("交通工具：公交车");
    }
    public void speedup(int add){
    	this.setSpeed(this.getSpeed()+add);
    }
    public void speeddown(){
    	
    }
    
}

