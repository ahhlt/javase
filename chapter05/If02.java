// ��ʾif-else˫��֧�ṹ
import java.util.Scanner;
public class If02{

	public static void main(String[] args){

		//��дһ������,���������˵�����,�����ͬ־���������18��,
		//����� "���������18,Ҫ��
		//�Լ�����Ϊ����, �������"������ ,���"������䲻����ηŹ�����."
		
		Scanner myScanner = new Scanner(System.in); //����Scanner����
		System.out.print("�������������䣺"); //��ʾ�û�����
		int age = myScanner.nextInt(); //��ȡ���䲢����ٱ���age��
		// ʹ��if����֧�ṹ
		if (age >= 18) {
			System.out.println("���������18,Ҫ���Լ�����Ϊ����,�������");
		}else{ //˫��֧
			System.out.println("������䲻����ηŹ����ˡ�");
		}
		System.out.println("�������...");
	}
}