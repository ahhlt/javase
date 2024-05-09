import java.util.Scanner;
public class SwitchExer{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		//提示用户输入
		System.out.println("请输入小写字母(a-e):");
		//接收用户输入的第一个字符，并保存在userChar变量中
		char userChar = input.next().charAt(0);

		switch(userChar){
			case 'a': 
				System.out.println('A');
				break;
			case 'b': 
				System.out.println('B');
				break;
			case 'c': 
				System.out.println('C');
				break;
			case 'd': 
				System.out.println('D');
				break;
			case 'e': 
				System.out.println('E');
				break;

			default:
				System.out.println("other");
				break;

		}
		
	}
}