import java.util.Scanner;
public class DoWhileExer2{
	public static void main(String[] args){
		
		char flag;
		int count = 0;
		do{
			System.out.println("����������"+count);
			count++;
			System.out.println("��Ǯ��y/n");
			Scanner input = new Scanner(System.in);
			flag = input.next().charAt(0);
			System.out.println(flag);
		}while(flag != 'y'); // ��while��������falseʱ����ѭ��
		System.out.println("�ѻ�");
		
	}
}