// 嵌套循环案例演示
import java.util.Scanner;
public class Nestedif{

	public static void main(String[] args){

		// 创建Scanner对象
		Scanner myScanner = new Scanner(System.in);

		// 提示输入分数
		System.out.print("请输入成绩：");
		// 获取分数
		double score = myScanner.nextDouble();
		// 判断成绩是否能进入决赛
		if (score > 8.0) {
			// 提示输入性别
			System.out.print("请输入性别：");
			// 获取性别
			char gender = myScanner.next().charAt(0);
			// 判断进入男子组or女子组，嵌套循环
			if (gender == '女') {
				System.out.print("恭喜哦，进入女子组决赛");
			}else if (gender == '男') {
				System.out.print("恭喜哦，进入男子组决赛");
			}else{
				System.out.print("警告！输入有误~");
			}
			
		}else{
			System.out.print("很遗憾，未进入决赛~");
		}
		
	}
}