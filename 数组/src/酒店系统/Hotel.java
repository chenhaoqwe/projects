package 酒店系统;

public class Hotel {
	/*
	 * 酒店有了，但是要
	 * 创建房子
	 */
	//二维数组模拟大夏，并且使用栈的原理来看是否房间满了等一些功能
	private Room[][] rooms;
	//利用无参构造方法，建房子
	public Hotel(){
		rooms=new Room[4][10];//一共三层，每曾10房间
		//现在开始把房间放入这数组里面
		for(int i=0;i<rooms.length;i++){
			for(int j=0;j<rooms[i].length;j++){
				/*
				 *规定一层为单人间
				 */
				if(i==0){//数组下标从0开始，而楼层是从1开始
					rooms[i][j]=new Room((i+1)*100+j+1,"单人间",true);
				}
				if(i==1){
					rooms[i][j]=new Room((i+1)*100+j+1,"标准双人间",true);
				}
				if(i==2){
					rooms[i][j]=new Room((i+1)*100+j+1,"豪华间",true);
				}
				if(i==3){
					rooms[i][j]=new Room((i+1)*100+j+1,"总统套间",true);
				}
			}
		}
	}
	/*
	 * 查看房间的状态
	 */
	public void printHotel(){
		for(int i1=0;i1<rooms.length;i1++){
			for(int j1=0;j1<rooms[i1].length;j1++){
				System.out.println(rooms[i1][j1].toString());
			}
			System.out.println();
			}
	}
	/*
	 * 订房的方法
	 */
	public void Order(int roomno){
		Room room=rooms[roomno/100-1][roomno%100-1];
		room.setRoomstatus(false);
		System.out.println("亲，您已经成功订好房间编号为:"+roomno);
		System.out.println("如有什么需求，请您呼叫前台");
		System.out.println("谢谢");
	}
	

}
