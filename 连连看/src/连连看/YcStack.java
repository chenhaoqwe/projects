package 连连看;

/*
 * 模拟栈的实现
 */
public class YcStack {
	//默认数组的长度为mum
	private final int MUM=10;
	//对象数组的类型
	private Object[] elementDate;
	//栈指针（代表存储中元素的个数）
	private int top=0;
	
	
	/*
	 * 无参构造方法，用于创建对象
	 */
	public YcStack(){
		//创建一个长度为mum的Object类型的数组，并且数组的值都为空
		elementDate=new Object[MUM];
		//因为刚开始栈中无元素，所以top=0
		top=0;
	}
	/*
	 * 入栈
	 */

	public void push(Object obj){
		//判断是否满栈
		if(top+1>elementDate.length){
			//因为原来的栈已经满了，所以就要重新创建一个数组，这叫做动态数组扩容
			Object[] elementDate1=new Object[elementDate.length+elementDate.length>>1];
			//新的数组创建以后，就需要复制原来的元素给新的
			System.arraycopy(elementDate, 0, elementDate1, 0, top);//原数组 起始位置 新数组 起始位置 复制原来的多少
			//将原来的引用对象指向新的数组
			elementDate=elementDate1;
		}
		//若没满  则入栈存储
	elementDate[top]=obj;
	top++;
	}
	/*
	 * 出栈
	 */
	public Object pop(){
		//判断是否栈为空
		if(top<=0){
			System.err.println("栈已经空");
			return null;
		}
		Object obj=elementDate[top-1];//数组下标从零开始
		top--;
		//清空栈顶的位置的元素
		elementDate=null;
		return obj;
	}
	/*
	 * 获取栈顶元素
	 */
	public Object peek(){
		//判断栈是否为空
		if(top<=0){
			System.out.println("栈已无无元素，无法获取");
			return null;
		}
		return elementDate[top-1];
	}
	/*
	 * 清空栈
	 */
	public void empty(){
		if(top>0){
			elementDate=new Object[MUM];//让这个引用对象指向一个空值数组
		}
		System.out.println("栈已经空");
		top=0;
	}
	
	
	
	
	
	
}
