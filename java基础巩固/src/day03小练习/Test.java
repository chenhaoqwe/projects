package day03小练习;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

//在这里心得  就是说任何类型的定义也可以作为形参数int a这个到处传递一样  就是说万物皆对象
//super调用父类的构造方法 创建的还是自己
//静态的东西里面的方法属性也是需要静态的  任何东西都是对象  继承真的好用 
//while 语句里面不要出现if语句  不会执行
public class Test {
	@SuppressWarnings("unused")
	private hero h;// 包括英雄属性
	static Scanner scanner = new Scanner(System.in);// 使用static修饰 因为我经常要用\
	static Random r = new Random();// 同上 这样也可以减少代码量
	// 无参数构造方法

	public Test(hero h) {
		this.h = h;
	}

	// 程序入口
	public static void main(String[] args) {
		hero h = new hero();// 创建一个英雄对象
		Test t1 = new Test(h);// 创建测试类的对象 并且将英雄这个对象传入进去
		t1.show(h);// 调用方法 和开始传递对象
	}

	/**
	 * 小工具用来输出
	 */
	public void Tool(String string) {
		System.out.println(string);// 减少代码量
	}

	/**
	 * show方法
	 */
	public void show(hero h) {
		boolean a=true;// 正确进入
		while(a) {
		Tool("大陆名为斗气大陆，大陆上并没有小说中常见的各系魔法，而斗气，才是大陆的唯一主调！\r\n" + "\r\n"
				+ " 在这片大陆上，斗气的修炼，几乎已经在无数代人的努力之下，发展到了巅峰地步，而且由于斗气的不断繁衍，最后甚至扩散到了民间之中，这也导致，斗气，与人类的日常生活，变得息息相关，如此，斗气在大陆中的重要性，更是变得无可替代！\r\n"
				+ "");
		Tool("斗之气，一至九段，滋润筋骨，强壮身体。\r\n" + "\r\n" + "斗者，一至九星，内视，聚气成气旋。\r\n" + "\r\n" + "斗师，一至九星，斗气纱衣，聚气化液态。\r\n" + "\r\n"
				+ "大斗师，一至九星，斗气铠甲，斗气外放，聚气化固态，呈菱形。\r\n" + "\r\n" + "斗灵，一至九星，斗气凝物，固态，形似海胆。\r\n" + "\r\n"
				+ "斗王，一至九星，斗气化翼，调动外界空间少量的能量。\r\n" + "\r\n" + "斗皇，一至九星，斗气化翼，可大量调动外界同属性能量，不借外力短时间停留虚空。\r\n" + "\r\n"
				+ "斗宗，一至九星，不借外力停留虚空，可制造空间锁。\r\n" + "\r\n" + "斗尊，一至九星，可以掌握并运用空间之力。\r\n" + "\r\n"
				+ "斗尊巅峰，一至十转，面临入圣困境。\r\n" + "\r\n" + "半圣，低至高阶，初入圣境，远胜尊境。\r\n" + "\r\n"
				+ "斗圣，一至九星，举手投足间，山崩地裂，空间破碎。而从虚空中开辟一方可供人居住的空间。则是斗圣强者的标志。六星斗圣的标志是空间挪位。斗圣巅峰强者！血脉开始变异。\r\n" + "\r\n"
				+ "斗帝，一至九星，改变自身的血脉，令自己的后人得益。能以一人之力振兴整个种族，凌驾天地之上的存在。\r\n" + "\r\n" + "");
		Tool("***********斗破苍穹************");
		Tool("********这里是属于你的世界********");
		Tool("**********1.进入大陆***********");
		Tool("**********2.退出大陆***********");
		int input = scanner.nextInt();// 用户输入
		if (input == 1) {// 进入
			sign(h);// 调用登陆方法
			break;
		} else {
			Tool("记得下次再来哦");
			break;
		}
	}
	}
	/**
	 * 创建角色和登陆
	 */
	public void sign(hero h) {
		Tool("请输入你的角色名字");
		Scanner s = new Scanner(System.in);
		h.setName(s.nextLine());// 开始创建角色名字
		h.setZhanghao(r.nextInt(999999999));// 使用random类 随机产生账号数字 这里还可以做个循环 如果账号已经存在 循环随机产生
		h.setPossard(r.nextInt(9999));// 同上
		System.out.println(h);// 显示英雄的角色英雄 给用户过目
		Tool("你是否使用当前的角色进行游戏？");// 看用户是否满意当前的英雄属性
		Scanner scanner=new Scanner(System.in);
		String is = scanner.nextLine();
		if (is.equals("是")) {// 判断用户是否记住 其实这里已经使用user.add 自动添加进去了 如果再查看属性也是咩问题的 但是繁琐
			Tool("请重新输入你的账号");
			int zhanghao = s.nextInt();
			Tool("请重新输入你的密码");
			Scanner s1=new Scanner(System.in);
			int possward = s1.nextInt();
			if (zhanghao == h.getZhanghao() && possward == h.getPossard()) {// 如果匹配上了 直接进入
				matchGame(h);// 进入游戏了
			} else {
				// 如果错了 就直接结束游戏 虽然我想着重新再这里也可以给他三次机会 不过暂时先不了
				System.exit(0);// 因为输错 直接结束游戏
			}
		}
	}

	/**
	 * 游戏模式
	 */
	public void matchGame(hero h) {
		Tool("欢迎" + h.getName() + "成功来到我的世界,请你选择要前往的地图");
		Tool("＊＊＊＊＊****1.乌坦城(斗者以下)＊＊＊＊＊ ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		playGame(h, s);
	}

	/**
	 * 进入游戏
	 */
	public void playGame(hero h, int a) {
		if (a == 1) {
			ArrayList<monster> Boss = new ArrayList<monster>();
			monster boss = new monster();
			boss.setName("小老鼠");
			boss.setLeval("一段");
			boss.setHP(100);
			boss.setRealm("斗之力");
			Boss.add(boss);
			System.out.println("你遇到了" + boss);
			Tool("你是否发起进攻");
			Scanner scanner=new Scanner(System.in);
			String s = scanner.nextLine();
			if (s.equals("是")) {
				Tool("你获得了100点经验");
				Boss.remove(0);
				h.setLeval("二段");
				System.out.println(h);
			}

		}
	}

	// 英雄
	public hero getH(hero h) {
		return h;
	}

	public void setH(hero h) {
		this.h = h;
	}
}

/**
 * 英雄人物类
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

	// 无参数的构造方法
	public hero() {
		this.leval = "一段";
		this.realm = "斗之力";
		this.HP = 100;
	}

	// 有参数的构造方法
	public hero(String name, String leval, int HP, String realm, int zhanghao, int possard) {
		this.name = name;
		this.leval = leval;
		this.HP = HP;
		this.realm = realm;
		this.zhanghao = zhanghao;
		this.possard = possard;

	}

	// 生命
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 等级
	public String getLeval() {
		return leval;
	}

	public void setLeval(String leval) {
		this.leval = leval;
	}

	// 生命值
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

	// 重写tostring
	public String toString() {
		return "英雄人物名字:" + name + "  等级为" + leval + "  生命值为" + "  境界为" + realm + "  账号:" + zhanghao + "\t" + "  密码:"
				+ possard;
	}

	// 账号
	public int getZhanghao() {
		return zhanghao;
	}

	public void setZhanghao(int zhanghao) {
		this.zhanghao = zhanghao;
	}

	// 密码
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
 * 技能类
 */
class Skill {
	private String skillname;

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

	// 重写tostring方法
	public String toString() {
		return "技能为" + skillname;
	}
}

/**
 * 怪物类 继承英雄类
 */
class monster extends hero {

	private String name;
	private String leavl;
	private int HP;
	private String realm;

	// 无参数构造方法
	public monster() {
		// this or super？
	}

	// 有参数构造方法
	public monster(String name, String leavl, int HP, String realm) {
		this.name = name;
		this.leavl = leavl;
		this.HP = HP;
		this.realm = realm;

	}

	public String toString() {
		return "怪物名字:" + name + "  等级为" + leavl + "  生命值为" + HP + "  境界为" + realm;
	}

}
