import java.util.Scanner;
public class SwitchExer{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		//��ʾ�û�����
		System.out.println("������Сд��ĸ(a-e):");
		//�����û�����ĵ�һ���ַ�����������userChar������
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