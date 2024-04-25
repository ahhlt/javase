// 演示变量的使用细节

public class VarDetail{
	public static void main(String[] args){
		// 1.变量必须先声明后使用，即有顺序
		int a = 50;
		System.out.println(a);
		
		// 错误示范：先使用后声明，会报错未找到变量b
		// System.out.println(b);
		// int b = 60;
		
		// 2.变量的值可以在该变量数据类型允许的范围内不断变化
		a = 500; //允许范围
		// a = "zhao"; //不允许
		System.out.println(a);

		// 3.同一作用域内变量不能重名
		// int a = 800; //错

	}
}

class Dog{
	public static void main(String[] args){
		// 不同作用域变量可以重名
		int a = 1000;
	}
}