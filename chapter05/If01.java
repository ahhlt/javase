// ��ʾ����֧�ṹ
import java.util.Scanner;
public class If01{

	public static void main(String[] args){

		// ���̻�ȡ�û���������
		// ����������18�����"���������18,Ҫ���Լ�����Ϊ����,�������"
		//˼·����
		//1. �������������, Ӧ�ö���һ��Scanner ����
		//2. �����䱣�浽һ������ int age
		//3. ʹ�� if �жϣ������Ӧ��Ϣ
		
		Scanner myScanner = new Scanner(System.in); //����Scanner����
		System.out.print("�������������䣺"); //��ʾ�û�����
		int age = myScanner.nextInt(); //��ȡ���䲢����ٱ���age��
		// ʹ��if����֧�ṹ
		if (age >= 18) {
			System.out.println("���������18,Ҫ���Լ�����Ϊ����,�������");
		}
		System.out.println("�������...");


	}
}