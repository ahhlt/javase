// Ƕ��ѭ��������ʾ �ڶ�������
import java.util.Scanner;
public class NestedifExer{

	public static void main(String[] args){

		// ����Scanner���󣬽����û�����
		Scanner myScanner = new Scanner(System.in);

		// ��ʾ�û������·�
		System.out.print("�����뵱ǰ�·ݣ�");
		// �����û������·�
		int month = myScanner.nextInt();
		if (month >= 4 && month <= 10) {
			System.out.print("�������������䣺");
			int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.print("ȫƱ60");
			}else if (age < 18) {
				System.out.print("��ͯƱ���30");
			}else if (age > 60) {
				System.out.print("����Ʊ20");
			}
		}else if((month >= 1 && month < 4) || (month > 10 && month <= 12)){
			System.out.print("�������������䣺");
            int age = myScanner.nextInt();
			if (age >= 18 && age <= 60) {
				System.out.print("����40");
			}else{
				System.out.print("����20");
			}
		}
	}
}