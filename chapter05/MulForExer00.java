import java.util.Scanner;
public class MulForExer00{

	public static void main(String[] args){

		// ����Scanner�������ڽ����û�����
		Scanner myScanner = new Scanner(System.in);

		double allClassTotalScore = 0; //���а༶�ܷ�
		int passCount = 0;
		for (int i = 0; i < 3; i++) { //3���༶

			double clsTolScore = 0; //�༶�ܷ�

			for(int j = 0; j < 5; j++){ //ÿ���༶5��ѧ��

				// ��ȡÿ��ѧ���ĳɼ�
				// ��ʾ�û�����
				System.out.print("������" + (i + 1) + "�࣬��" + ( j + 1 ) + "��ѧ���ĳɼ�");
				double stuScore = myScanner.nextDouble();
				if (stuScore >= 60) {
					passCount++ ; //������������
				}
				clsTolScore += stuScore; //�ۼ�����ѧ���ĳɼ�

			}

			allClassTotalScore += clsTolScore; //�ۼ����а༶�ĳɼ�

			System.out.println((i + 1) + "��ƽ����=" + (clsTolScore / 5.0)); //�༶ƽ����=�༶�ܳɼ�/�༶������

		}

		System.out.println("���а༶ƽ����=" + (allClassTotalScore / 15.0)); //���а༶ƽ����=���а༶�ܳɼ�/����ѧ��
		System.out.println("��������=" + passCount); //���а༶ƽ����=���а༶�ܳɼ�/����ѧ��

	}
}