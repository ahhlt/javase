// Ƕ��ѭ��������ʾ
import java.util.Scanner;
public class Nestedif{

	public static void main(String[] args){

		// ����Scanner����
		Scanner myScanner = new Scanner(System.in);

		// ��ʾ�������
		System.out.print("������ɼ���");
		// ��ȡ����
		double score = myScanner.nextDouble();
		// �жϳɼ��Ƿ��ܽ������
		if (score > 8.0) {
			// ��ʾ�����Ա�
			System.out.print("�������Ա�");
			// ��ȡ�Ա�
			char gender = myScanner.next().charAt(0);
			// �жϽ���������orŮ���飬Ƕ��ѭ��
			if (gender == 'Ů') {
				System.out.print("��ϲŶ������Ů�������");
			}else if (gender == '��') {
				System.out.print("��ϲŶ���������������");
			}else{
				System.out.print("���棡��������~");
			}
			
		}else{
			System.out.print("���ź���δ�������~");
		}
		
	}
}