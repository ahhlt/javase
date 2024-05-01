// 自增自自减面试题

public class ClassExer01{
	public static void main(String[] args){
		int i = 1;
		i = i++; //后++返回的是自增以前的值，i=（i自增之前的值）
		System.out.println(i); //1

		int j = 1;
		j = ++j; //前++返回的是自增以后的值，j=（j自增以后的值）
		System.out.println(j); //2

		int k = 1;
		k = k--; //后--返回的是自减之前的值，k=（k自减之前的值）
		System.out.println(k); //1

		int l = 1;
		l = --l; //前--返回的是自减以后的值，l=（l自减以后的值）
		System.out.println(l); //0
	}
}