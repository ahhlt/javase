import java.util.Scanner;
public class Homework02{
	public static void main(String[] args){
	
		// �ж�һ�����������ĸ���Χ >0 <0 or=0
		// ˼·����
		//1.����һ��Scanner��������û�����
		// �������intNum����û����������
		//2.ʹ��if-else����ж�
		//3.���
		Scanner inScanner = new Scanner(System.in);
		System.out.println("������һ��������");
		int intNum = inScanner.nextInt();
		if (intNum > 0) {
			System.out.println(intNum + " > 0");
		}else if (intNum < 0) {
			System.out.println(intNum + " < 0");
		}else{
			System.out.println(intNum + " = 0");
		}
		
	}
}