// 演示单分支结构
import java.util.Scanner;
public class If01{

	public static void main(String[] args){

		// 键盘获取用户输入年龄
		// 如果年龄大于18就输出"你年龄大于18,要对自己的行为负责,送入监狱"
		//思路分析
		//1. 接收输入的年龄, 应该定义一个Scanner 对象
		//2. 把年龄保存到一个变量 int age
		//3. 使用 if 判断，输出对应信息
		
		Scanner myScanner = new Scanner(System.in); //创建Scanner对象
		System.out.print("请输入您的年龄："); //提示用户输入
		int age = myScanner.nextInt(); //获取年龄并存放再变量age中
		// 使用if单分支结构
		if (age >= 18) {
			System.out.println("你年龄大于18,要对自己的行为负责,送入监狱");
		}
		System.out.println("程序继续...");


	}
}