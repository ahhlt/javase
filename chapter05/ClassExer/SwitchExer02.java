import java.util.Scanner;

public class SwitchExer02{

	public static void main(String[] args){

		// 创建Scanner对象，接收用户输入
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入你的成绩(0-100)：");
		double score = myScanner.nextDouble();
		if (score >= 0 && score <= 100) {
			
			// 使用switch分支实现
			// 将score/60为1合格，为0不合格
			switch ((int)(score / 60)){
				case 1 :
					System.out.println("成绩合格：" + score);
					break;
				case 0 :
					System.out.println("成绩bu合格：" + score);
					break;
			}		

		}else {
			System.out.println("成绩有误");
		}
	}
}