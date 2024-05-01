
public class ClassExer02{
	public static void main(String[] args){
		int x = 5;
		int y = 5;
		if (x++ == 6 && ++y == 6) {
			// 短路与，同true为true，只有条件1为true时才执行条件2 
			// x++用在表达式返回x的原始值x=5 5==6为false，不再执行条件2
			// 此时，x=6，y=5
			x = 11;
		}
		System.out.println("x = " + x + ", y = " + y); //x=6,y=5

	}
}
