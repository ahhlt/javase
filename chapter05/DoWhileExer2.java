import java.util.Scanner;
public class DoWhileExer2{
	public static void main(String[] args){
		
		char flag;
		int count = 0;
		do{
			System.out.println("闪电五连鞭"+count);
			count++;
			System.out.println("还钱吗？y/n");
			Scanner input = new Scanner(System.in);
			flag = input.next().charAt(0);
			System.out.println(flag);
		}while(flag != 'y'); // 当while条件返回false时跳出循环
		System.out.println("已还");
		
	}
}