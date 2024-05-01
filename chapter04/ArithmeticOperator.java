// 演示算数运算符的使用


public class ArithmeticOperator{
	public static void main(String[] args){

		System.out.println(10 / 4); //两个int常量运算后还是int，2.5强转为int=2
		System.out.println(10.0 / 4); //默认使用较大精度、较大范围的类型保存运算结果
		double d = 10 / 4; // 10/4=2，再强转为double就是2.0
		System.out.println(d); //2.0

		// %取模运算，取余数
		// 本质 a % b = a - a / b * b
		// -10 % 3 = -10 - -10 / 3 * 3 = -10 - -9 = -1
		// 10 % -3 = 10 - 10 /-3 * -3 = 10 - 9 = 1
		// -10 % -3 = -10 - -10 /-3 *-3 = -10 + 9 = -1
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); // 1
		System.out.println(-10 % -3); //-1

		// 前++的使用
		// i++或++i单独使用时，等价于i=i+1
		int i = 10;
		i++;
		++i;
		System.out.println("i = " + i); //12

		/*
			使用再表达式内时
			前++：++i 先自增，再赋值。i先+1，再参与表达式计算
			后++：i++ 先赋值，后自增。i先参与表达式运算，再+1

		 */ 
		int j = 8;
		int k = ++j; //等价于 j=j+1;k=j;。j=9,k=9
		//int k = j++; //等价于 k=j; j=j+1;。k=8,j=9
		System.out.println("k = " + k + ", j = "+j);
	}
}