import java.util.Scanner;
public class Homework03{
	public static void main(String[] args){
	
		// ��ȡ�û��������
		Scanner myScanner = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = myScanner.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year+"������");
		}else{
			System.out.println(year+"bu������");
		}
		
	}
}