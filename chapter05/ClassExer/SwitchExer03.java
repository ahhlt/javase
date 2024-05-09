import java.util.Scanner;

public class SwitchExer03{

	public static void main(String[] args){

		// 创建Scanner对象，接收用户输入
		Scanner myScanner = new Scanner(System.in);
		//提示用户输入
		System.out.println("请输入月份(1-12):");
		int month = myScanner.nextInt();
		if (month >= 1 && month <=12) {
			switch(month){
				case 3:
				case 4:
				case 5:
					System.out.println("春季");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println("夏季");
					break;
				case 9:
				case 10:
				case 11:
					System.out.println("秋季");
					break;
				case 12:
				case 1:
				case 2:
					System.out.println("冬季");
					break;
				
			}
		}else{
			System.out.println("输入有误");
		}
	}
}