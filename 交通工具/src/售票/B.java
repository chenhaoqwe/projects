package 售票;

public class B {
     private String piaoname;//私有   private封装  防止外界修改性
     private int piaoshu;
     
     public void setPiaoname(String piaoname){
    	 this.piaoname=piaoname;
     }
     public String piaoname() {
 		return piaoname;}

	public int getPiaoshu() {
		return piaoshu;
	}

	public void setPiaoshu(int piaoshu) {
		this.piaoshu = piaoshu;
	}
    public void xiugai(String piaoname){
    	this.setPiaoname(piaoname);//this就是引用，就是b1
    }
    public void gai(int piaoshu){
    	this.setPiaoshu(this.getPiaoshu()+piaoshu);//this指的就是现在这个现象
    }
}
