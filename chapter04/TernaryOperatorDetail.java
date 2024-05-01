// 演示三元运算符的使用细节
public class TernaryOperatorDetail{

	public static void main(String[] args){
		// 表达式1和表达式2必须是可以赋给接收变量的类型(可以自动转换或语法强转) 
		int a = 3;
		int b = 8;

		int c = (a > b) ? a : b; //可以，接收变量c为int，int -> int
		int c = (a > b) ? 1.1 : 2.2; //不可以，表达式中的值为double，接收变量类型为int
		
		// 表达式类型与接收变量类型不同时，必须满足类型自动转换或者强制转换
		int c = a > b ? (int)1.1 : (int)2.2;
	}
}