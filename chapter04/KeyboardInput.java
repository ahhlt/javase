import java.util.Scanner;
// ��ʾ���������Scanner��ʹ��
public class KeyboardInput{

	public static void main(String[] args){

		// 1.����Scanner��
		// 2.����Scanner����
		Scanner myScanner = new Scanner(System.in);
		// ��ʾ�û�����
		System.out.print("������������");
		String name = myScanner.next();
		System.out.print("���������䣺");
		int age = myScanner.nextInt();
		System.out.print("������нˮ��");
		double sal = myScanner.nextDouble();
		System.out.println("�û���Ϣ����");
		System.out.println("������" + name + " ���䣺" + age + " нˮ��" + sal);
	}
}
