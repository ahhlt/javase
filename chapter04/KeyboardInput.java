import java.util.Scanner;
// 演示键盘输出类Scanner的使用
public class KeyboardInput{

	public static void main(String[] args){

		// 1.导入Scanner类
		// 2.创建Scanner对象
		Scanner myScanner = new Scanner(System.in);
		// 提示用户输入
		System.out.print("请输入姓名：");
		String name = myScanner.next();
		System.out.print("请输入年龄：");
		int age = myScanner.nextInt();
		System.out.print("请输入薪水：");
		double sal = myScanner.nextDouble();
		System.out.println("用户信息如下");
		System.out.println("姓名：" + name + " 年龄：" + age + " 薪水：" + sal);
	}
}
