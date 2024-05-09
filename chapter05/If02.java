// 演示if-else双分支结构
import java.util.Scanner;
public class If02{

	public static void main(String[] args){

		//编写一个程序,可以输入人的年龄,如果该同志的年龄大于18岁,
		//则输出 "你年龄大于18,要对
		//自己的行为负责, 送入监狱"。否则 ,输出"你的年龄不大这次放过你了."
		
		Scanner myScanner = new Scanner(System.in); //创建Scanner对象
		System.out.print("请输入您的年龄："); //提示用户输入
		int age = myScanner.nextInt(); //获取年龄并存放再变量age中
		// 使用if单分支结构
		if (age >= 18) {
			System.out.println("你年龄大于18,要对自己的行为负责,送入监狱");
		}else{ //双分支
			System.out.println("你的年龄不大这次放过你了。");
		}
		System.out.println("程序继续...");
	}
}