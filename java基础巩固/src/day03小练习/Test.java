package day03С��ϰ;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

//�������ĵ�  ����˵�κ����͵Ķ���Ҳ������Ϊ�β���int a�����������һ��  ����˵����Զ���
//super���ø���Ĺ��췽�� �����Ļ����Լ�
//��̬�Ķ�������ķ�������Ҳ����Ҫ��̬��  �κζ������Ƕ���  �̳���ĺ��� 
//while ������治Ҫ����if���  ����ִ��
public class Test {
	@SuppressWarnings("unused")
	private hero h;// ����Ӣ������
	static Scanner scanner = new Scanner(System.in);// ʹ��static���� ��Ϊ�Ҿ���Ҫ��\
	static Random r = new Random();// ͬ�� ����Ҳ���Լ��ٴ�����
	// �޲������췽��

	public Test(hero h) {
		this.h = h;
	}

	// �������
	public static void main(String[] args) {
		hero h = new hero();// ����һ��Ӣ�۶���
		Test t1 = new Test(h);// ����������Ķ��� ���ҽ�Ӣ������������ȥ
		t1.show(h);// ���÷��� �Ϳ�ʼ���ݶ���
	}

	/**
	 * С�����������
	 */
	public void Tool(String string) {
		System.out.println(string);// ���ٴ�����
	}

	/**
	 * show����
	 */
	public void show(hero h) {
		boolean a=true;// ��ȷ����
		while(a) {
		Tool("��½��Ϊ������½����½�ϲ�û��С˵�г����ĸ�ϵħ���������������Ǵ�½��Ψһ������\r\n" + "\r\n"
				+ " ����Ƭ��½�ϣ������������������Ѿ����������˵�Ŭ��֮�£���չ�����۷�ز����������ڶ����Ĳ��Ϸ��ܣ����������ɢ�������֮�У���Ҳ���£���������������ճ�������ϢϢ��أ���ˣ������ڴ�½�е���Ҫ�ԣ����Ǳ���޿������\r\n"
				+ "");
		Tool("��֮����һ���ŶΣ������ǣ�ǿ׳���塣\r\n" + "\r\n" + "���ߣ�һ�����ǣ����ӣ�������������\r\n" + "\r\n" + "��ʦ��һ�����ǣ�����ɴ�£�������Һ̬��\r\n" + "\r\n"
				+ "��ʦ��һ�����ǣ��������ף�������ţ���������̬�������Ρ�\r\n" + "\r\n" + "���飬һ�����ǣ����������̬�����ƺ�����\r\n" + "\r\n"
				+ "������һ�����ǣ����������������ռ�������������\r\n" + "\r\n" + "���ʣ�һ�����ǣ����������ɴ����������ͬ��������������������ʱ��ͣ����ա�\r\n" + "\r\n"
				+ "���ڣ�һ�����ǣ���������ͣ����գ�������ռ�����\r\n" + "\r\n" + "����һ�����ǣ��������ղ����ÿռ�֮����\r\n" + "\r\n"
				+ "�����۷壬һ��ʮת��������ʥ������\r\n" + "\r\n" + "��ʥ�������߽ף�����ʥ����Զʤ�𾳡�\r\n" + "\r\n"
				+ "��ʥ��һ�����ǣ�����Ͷ��䣬ɽ�����ѣ��ռ����顣��������п���һ���ɹ��˾�ס�Ŀռ䡣���Ƕ�ʥǿ�ߵı�־�����Ƕ�ʥ�ı�־�ǿռ�Ųλ����ʥ�۷�ǿ�ߣ�Ѫ����ʼ���졣\r\n" + "\r\n"
				+ "���ۣ�һ�����ǣ��ı������Ѫ�������Լ��ĺ��˵��档����һ��֮�������������壬������֮�ϵĴ��ڡ�\r\n" + "\r\n" + "");
		Tool("***********���Ʋ��************");
		Tool("********�����������������********");
		Tool("**********1.�����½***********");
		Tool("**********2.�˳���½***********");
		int input = scanner.nextInt();// �û�����
		if (input == 1) {// ����
			sign(h);// ���õ�½����
			break;
		} else {
			Tool("�ǵ��´�����Ŷ");
			break;
		}
	}
	}
	/**
	 * ������ɫ�͵�½
	 */
	public void sign(hero h) {
		Tool("��������Ľ�ɫ����");
		Scanner s = new Scanner(System.in);
		h.setName(s.nextLine());// ��ʼ������ɫ����
		h.setZhanghao(r.nextInt(999999999));// ʹ��random�� ��������˺����� ���ﻹ��������ѭ�� ����˺��Ѿ����� ѭ���������
		h.setPossard(r.nextInt(9999));// ͬ��
		System.out.println(h);// ��ʾӢ�۵Ľ�ɫӢ�� ���û���Ŀ
		Tool("���Ƿ�ʹ�õ�ǰ�Ľ�ɫ������Ϸ��");// ���û��Ƿ����⵱ǰ��Ӣ������
		Scanner scanner=new Scanner(System.in);
		String is = scanner.nextLine();
		if (is.equals("��")) {// �ж��û��Ƿ��ס ��ʵ�����Ѿ�ʹ��user.add �Զ���ӽ�ȥ�� ����ٲ鿴����Ҳ��������� ���Ƿ���
			Tool("��������������˺�");
			int zhanghao = s.nextInt();
			Tool("�����������������");
			Scanner s1=new Scanner(System.in);
			int possward = s1.nextInt();
			if (zhanghao == h.getZhanghao() && possward == h.getPossard()) {// ���ƥ������ ֱ�ӽ���
				matchGame(h);// ������Ϸ��
			} else {
				// ������� ��ֱ�ӽ�����Ϸ ��Ȼ����������������Ҳ���Ը������λ��� ������ʱ�Ȳ���
				System.exit(0);// ��Ϊ��� ֱ�ӽ�����Ϸ
			}
		}
	}

	/**
	 * ��Ϸģʽ
	 */
	public void matchGame(hero h) {
		Tool("��ӭ" + h.getName() + "�ɹ������ҵ�����,����ѡ��Ҫǰ���ĵ�ͼ");
		Tool("����������****1.��̹��(��������)���������� ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		playGame(h, s);
	}

	/**
	 * ������Ϸ
	 */
	public void playGame(hero h, int a) {
		if (a == 1) {
			ArrayList<monster> Boss = new ArrayList<monster>();
			monster boss = new monster();
			boss.setName("С����");
			boss.setLeval("һ��");
			boss.setHP(100);
			boss.setRealm("��֮��");
			Boss.add(boss);
			System.out.println("��������" + boss);
			Tool("���Ƿ������");
			Scanner scanner=new Scanner(System.in);
			String s = scanner.nextLine();
			if (s.equals("��")) {
				Tool("������100�㾭��");
				Boss.remove(0);
				h.setLeval("����");
				System.out.println(h);
			}

		}
	}

	// Ӣ��
	public hero getH(hero h) {
		return h;
	}

	public void setH(hero h) {
		this.h = h;
	}
}

/**
 * Ӣ��������
 */
/**
 * @ClassName: hero
 * @Description: TODO
 * @author chenhao
 * @date 2020-12-27 06:15:28
 */
class hero {
	private String name;
	private String leval;
	private int HP;
	private String realm;
	private int zhanghao;
	private int possard;
	private Skill[] skill;

	// �޲����Ĺ��췽��
	public hero() {
		this.leval = "һ��";
		this.realm = "��֮��";
		this.HP = 100;
	}

	// �в����Ĺ��췽��
	public hero(String name, String leval, int HP, String realm, int zhanghao, int possard) {
		this.name = name;
		this.leval = leval;
		this.HP = HP;
		this.realm = realm;
		this.zhanghao = zhanghao;
		this.possard = possard;

	}

	// ����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// �ȼ�
	public String getLeval() {
		return leval;
	}

	public void setLeval(String leval) {
		this.leval = leval;
	}

	// ����ֵ
	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	// ��дtostring
	public String toString() {
		return "Ӣ����������:" + name + "  �ȼ�Ϊ" + leval + "  ����ֵΪ" + "  ����Ϊ" + realm + "  �˺�:" + zhanghao + "\t" + "  ����:"
				+ possard;
	}

	// �˺�
	public int getZhanghao() {
		return zhanghao;
	}

	public void setZhanghao(int zhanghao) {
		this.zhanghao = zhanghao;
	}

	// ����
	public int getPossard() {
		return possard;
	}

	public void setPossard(int possard) {
		this.possard = possard;
	}

	public Skill[] getSkill() {
		return skill;
	}

	public void setSkill(Skill[] skill) {
		this.skill = skill;
	}
}

/**
 * ������
 */
class Skill {
	private String skillname;

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	// ��дtostring����
	public String toString() {
		return "����Ϊ" + skillname;
	}
}

/**
 * ������ �̳�Ӣ����
 */
class monster extends hero {

	private String name;
	private String leavl;
	private int HP;
	private String realm;

	// �޲������췽��
	public monster() {
		// this or super��
	}

	// �в������췽��
	public monster(String name, String leavl, int HP, String realm) {
		this.name = name;
		this.leavl = leavl;
		this.HP = HP;
		this.realm = realm;

	}

	public String toString() {
		return "��������:" + name + "  �ȼ�Ϊ" + leavl + "  ����ֵΪ" + HP + "  ����Ϊ" + realm;
	}

}
