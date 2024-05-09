// 嵌套循环案例演示 第二个案例
import java.util.Scanner;
public class NestedifExer{

	public static void main(String[] args){

		// 创建Scanner对象，接受用户输入
		Scanner myScanner = new Scanner(System.in);

		// 提示用户输入月份
		System.out.print("请输入当前月份：");
		// 接收用户输入月份
		int month = myScanner.nextInt();
		if (month >= 4 && month <= 10) {
			System.out.print("请输入您的年龄：");
			int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.print("全票60");
			}else if (age < 18) {
				System.out.print("儿童票半价30");
			}else if (age > 60) {
				System.out.print("老年票20");
			}
		}else if((month >= 1 && month < 4) || (month > 10 && month <= 12)){
			System.out.print("请输入您的年龄：");
            int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.print("成人40");
			}else{
				System.out.print("其他20");
			}
		}
	}
}