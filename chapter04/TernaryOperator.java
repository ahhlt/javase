// 演示三元运算符的使用
public class TernaryOperator{

	public static void main(String[] args){

		int a = 10;
		int b = 99;

		int result = (a > b) ? a++ : b--;
		// a > b为false，返回第二个表达式b--，先将b的值返回，b再自减
		System.out.println("result= " + result);
        System.out.println("b= " + b);
		// 表达式类型与接收变量类型不同时，必须满足类型自动转换或者强制转换
		int c = a > b ? (int)1.1 : (int)2.2;
	}
}