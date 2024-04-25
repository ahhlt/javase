// 演示变量的使用

public class Var01{
	// 主方法，程序的入口
	public static void main(String[] args){
		
		// 声明变量
		// 方式1：分步式，先声明，再初始化
		int num1; // 声明变量
		num1 = 100; // 给变量赋值
		char gender;
		gender = '男';

		// 方式2：一步式，声明同时初始化
		int num2 = 200;
		int age = 18;

		// 使用变量
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("gender = " + gender + ", age = " + age);


	}
}