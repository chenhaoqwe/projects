package �Ƶ�ϵͳ;

public class Hotel {
	/*
	 * �Ƶ����ˣ�����Ҫ
	 * ��������
	 */
	//��ά����ģ����ģ�����ʹ��ջ��ԭ�������Ƿ񷿼����˵�һЩ����
	private Room[][] rooms;
	//�����޲ι��췽����������
	public Hotel(){
		rooms=new Room[4][10];//һ�����㣬ÿ��10����
		//���ڿ�ʼ�ѷ����������������
		for(int i=0;i<rooms.length;i++){
			for(int j=0;j<rooms[i].length;j++){
				/*
				 *�涨һ��Ϊ���˼�
				 */
				if(i==0){//�����±��0��ʼ����¥���Ǵ�1��ʼ
					rooms[i][j]=new Room((i+1)*100+j+1,"���˼�",true);
				}
				if(i==1){
					rooms[i][j]=new Room((i+1)*100+j+1,"��׼˫�˼�",true);
				}
				if(i==2){
					rooms[i][j]=new Room((i+1)*100+j+1,"������",true);
				}
				if(i==3){
					rooms[i][j]=new Room((i+1)*100+j+1,"��ͳ�׼�",true);
				}
			}
		}
	}
	/*
	 * �鿴�����״̬
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
	 * �����ķ���
	 */
	public void Order(int roomno){
		Room room=rooms[roomno/100-1][roomno%100-1];
		room.setRoomstatus(false);
		System.out.println("�ף����Ѿ��ɹ����÷�����Ϊ:"+roomno);
		System.out.println("����ʲô������������ǰ̨");
		System.out.println("лл");
	}
	

}
