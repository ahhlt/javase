import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
	
		// 判断一个整数属于哪个范围 >0 <0 or=0
		// 思路分析
		//1.创建一个Scanner对象接收用户输入
		// 定义变量intNum存放用户输入的整数
		//2.使用if-else语句判断
		//3.输出
		Scanner inScanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int intNum = inScanner.nextInt();
		if (intNum > 0) {
			System.out.println(intNum + " > 0");
		}else if (intNum < 0) {
			System.out.println(intNum + " < 0");
		}else{
			System.out.println(intNum + " = 0");
		}
		
	}
}