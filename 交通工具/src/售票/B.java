package ��Ʊ;

public class B {
     private String piaoname;//˽��   private��װ  ��ֹ����޸���
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
    	this.setPiaoname(piaoname);//this�������ã�����b1
    }
    public void gai(int piaoshu){
    	this.setPiaoshu(this.getPiaoshu()+piaoshu);//thisָ�ľ��������������
    }
}
