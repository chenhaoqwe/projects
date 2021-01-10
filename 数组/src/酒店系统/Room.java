package 酒店系统;
/*
 * 房间
 */
public class Room {
	/*
	 * 房间属性：编号   房间类型  房间状态 
	 */
	//房间编号
	private int roomno;
	//房间类型
	private String roomtype;
	//房间状态
	private boolean roomstatus;
	//有参构造方法，这个this指的就是当前这个对象的房间编号，类型，状态
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
	 * 以房间编号来判断是否为同一个房间
	 */
	public boolean equals(Object obj){
		if(obj==null && obj instanceof Room ) return false;
		if(this==obj) return true;
		Room room=(Room)obj;
		if(this.getRoomno()==room.getRoomno()) return true;
		return roomstatus;
	}
	public String toString(){
		return "["+roomno+"-"+roomtype+"————"+(roomstatus?"空闲":"占有");
		
	}
	
	

}
