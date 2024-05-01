
public class ClassExer03{
	public static void main(String[] args){
		int x = 5;
		int y = 5;
		if (x++ == 5 | ++y == 5) { 
			// 逻辑或，有true为ture，两个条件都要执行
			// x++后++用在表达式中返回原始值x=5，即5==5，结果为true
			// ++y前++用在表达式中返回自增以后的值y=6，即5==6结果为false
			// 逻辑或|的结果为true
			x = 11;
		}
		System.out.println("x = " + x + ", y = " + y); //x=11,y=6

	}
}
