import java.util.Scanner;
// ˳����Ұ���
public class SeqSearch{

	public static void main(String[] args){

		String[] names = new String[]{"��üӥ��", "��������", "��ëʨ��", "��������"};

		Scanner myScanner = new Scanner(System.in);

		System.out.print("������Ҫ���ҵ�����:");
		String input = myScanner.next();
		boolean isFlag = true;
		for (int i = 0; i < names.length; i++) {
			if (input.equals(names[i])) {
				System.out.println("�ҵ���" + input + "�±�index=" + i);
				isFlag = false;
			}
		}
		if (isFlag) {
			System.out.println("����û�и�Ԫ��...");
		}
	}
}