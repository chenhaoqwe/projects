package aa;

public class Stud {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Student[] stus = new Student[20];
		for (int i = 0; i < stus.length; i++) {
		    stus[i] =new Student();
			stus[i].number = i + 1;
			stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
			stus[i].score = (int) (Math.random() * (100 - 0 + 1) + 1);
		}
		/*for (int j = 0; j < stus.length; j++) {
			System.out.println(stus[j].info());
		}
		*/
		for(int i=0;i<stus.length-1;i++){
			for(int j=0;j<stus.length-1-i;j++){
				if(stus[j].score>stus[j+1].score){
					Student mep=stus[j];
					stus[j]=stus[j+1];
					stus[j+1]=stus[j];
				}
			}
			
		}
		for (int j = 0; j < stus.length; j++) {
			System.out.println(stus[j].info());
		}
}
}

class Student {
	int number;
	int state;
	int score;

	public String info() {
		return "学号：" + number + "   年级" + state + "   成绩" + score;
	}
}
