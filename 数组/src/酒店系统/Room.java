package �Ƶ�ϵͳ;
/*
 * ����
 */
public class Room {
	/*
	 * �������ԣ����   ��������  ����״̬ 
	 */
	//������
	private int roomno;
	//��������
	private String roomtype;
	//����״̬
	private boolean roomstatus;
	//�вι��췽�������thisָ�ľ��ǵ�ǰ�������ķ����ţ����ͣ�״̬
	public Room(int roomno,String roomtype,boolean b){
		this.roomno=roomno;
		this.roomtype=roomtype;
		this.roomstatus=b;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public boolean getRoomstatus() {
		return roomstatus;
	}
	public void setRoomstatus(boolean roomstatus) {
		this.roomstatus = roomstatus;
	}
	/*
	 * �Է��������ж��Ƿ�Ϊͬһ������
	 */
	public boolean equals(Object obj){
		if(obj==null && obj instanceof Room ) return false;
		if(this==obj) return true;
		Room room=(Room)obj;
		if(this.getRoomno()==room.getRoomno()) return true;
		return roomstatus;
	}
	public String toString(){
		return "["+roomno+"-"+roomtype+"��������"+(roomstatus?"����":"ռ��");
		
	}
	
	

}
