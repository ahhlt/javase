import java.util.Scanner;

public class SwitchExer03{

	public static void main(String[] args){

		// ����Scanner���󣬽����û�����
		Scanner myScanner = new Scanner(System.in);
		//��ʾ�û�����
		System.out.println("�������·�(1-12):");
		int month = myScanner.nextInt();
		if (month >= 1 && month <=12) {
			switch(month){
				case 3:
				case 4:
				case 5:
					System.out.println("����");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println("�ļ�");
					break;
				case 9:
				case 10:
				case 11:
					System.out.println("�＾");
					break;
				case 12:
				case 1:
				case 2:
					System.out.println("����");
					break;
				
			}
		}else{
			System.out.println("��������");
		}
	}
}