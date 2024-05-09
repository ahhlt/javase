import java.util.Scanner;
public class Homework03{
	public static void main(String[] args){
	
		// 获取用户输入年份
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = myScanner.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"bu是闰年");
		}
		
	}
}