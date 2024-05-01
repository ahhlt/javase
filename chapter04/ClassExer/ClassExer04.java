
public class ClassExer04{
	public static void main(String[] args){
		int x = 5;
		int y = 5;
		if (x++ == 5 || ++y == 5) {
			// 短路或，有true为true，只有条件1为false时才执行条件2 
			// x++用在表达式返回x的原始值x=5 5==5为true，不再执行条件2
			// 此时，x=11，y=5
			x = 11;
		}
		System.out.println("x = " + x + ", y = " + y); //x=11,y=5

	}
}
