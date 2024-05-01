
public class ClassExer01{
	public static void main(String[] args){
		int x = 5;
		int y = 5;
		if (x++ == 6 & ++y == 6) { 
			// 逻辑与，同true为true，两个条件都要执行
			// x++后++用在表达式中返回原始值x=5，即5==6，结果为false
			// ++y前++用在表达式中返回自增以后的值y=6，即6==6结果为true
			// 逻辑与&的结果为false
			x = 11;
		}
		System.out.println("x = " + x + ", y = " + y); //x=6,y=6

	}
}
