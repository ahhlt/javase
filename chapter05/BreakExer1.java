import java.util.Scanner;
public class BreakExer1{
	public static void main(String[] args){
	
		Scanner inScanner = new Scanner(System.in);

		String uname =  "";
		String psd = "";
		int chance = 3;
		// ���λ���
		for (int i = 3; i >= 1; i--) {
			// �����û����� �ַ���
			System.out.println("�������û�����");
			uname = inScanner.next();
			System.out.println("���������룺");
			psd = inScanner.next();
            	//equals() �ж����ַ����Ƿ����
			if ("�Է���ţ��".equals(uname) && "666".equals(psd)) {
				System.out.println("��¼�ɹ���");
				break;
			}
			chance--;  //ÿ�����chance�Լ�
			if (chance==0) { //���������Զ��˳�
				System.out.println("�Է�����ˣ��˳�ϵͳ");
			}else {
				System.out.println("�������������"+(chance)+"�λ��ᣬ���ٴγ��ԡ�");
			}
			

			//equals���� �ж��ַ����Ƿ����
			
		}
}
}