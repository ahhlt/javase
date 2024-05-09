
// 演示switch分支
import java.util.Scanner;
public class Switch01{

	public static void main(String[] args){

		// 创建Scanner对象，接收键盘输入
		Scanner myScanner = new Scanner(System.in);

		// 提示用户输入
		System.out.print("请输入字符(a-g)：");
		char flag = myScanner.next().charAt(0);

		switch(flag){

			case 'a':
				System.out.println("星期1");
				break;
			case 'b':
				System.out.println("星期2");
				break;
			case 'c':
				System.out.println("星期3");
				break;
			case 'd':
				System.out.println("星期4");
				break;
			case 'e':
				System.out.println("星期5");
				break;
			case 'f':
				System.out.println("星期6");
				break;
			case 'g':
				System.out.println("星期日");
				break;
			default :
				System.out.println("输入错误，无匹配内容");
				break;
		}
	}
}