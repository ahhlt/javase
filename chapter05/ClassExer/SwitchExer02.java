import java.util.Scanner;

public class SwitchExer02{

	public static void main(String[] args){

		// ����Scanner���󣬽����û�����
		Scanner myScanner = new Scanner(System.in);
		System.out.print("��������ĳɼ�(0-100)��");
		double score = myScanner.nextDouble();
		if (score >= 0 && score <= 100) {
			
			// ʹ��switch��֧ʵ��
			// ��score/60Ϊ1�ϸ�Ϊ0���ϸ�
			switch ((int)(score / 60)){
				case 1 :
					System.out.println("�ɼ��ϸ�" + score);
					break;
				case 0 :
					System.out.println("�ɼ�bu�ϸ�" + score);
					break;
			}		

		}else {
			System.out.println("�ɼ�����");
		}
	}
}