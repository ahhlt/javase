// 强制类型转换的使用细节


public class ForceConvertDetail{

	public static void main(String[] args){

		// 1.强制类型转换符号只对最近的操作数有效，
		// 如果需要对表达式的结果进行强转，需要使用小括号
		//int x = (int)10*3.5+6*1.5; // 编译错误 double -> int
		int x = (int)(10*3.5+6*1.5); // 35+9=44.0 (int)44.0 -> 44
		System.out.println(x); //44

		// 2.char类型可以保存int的常量值，但不能保存int的变量值，需要强转
		char c1 = 100; //ok，char可以保存int的常量值
		int m = 100;
		//char c2 = m; //no，char不能保存int的变量值
		char c3 = (char)m; // 可以使用强转将int转为char类型
		System.out.println(c3); // d

	}
}