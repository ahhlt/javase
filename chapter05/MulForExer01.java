import java.util.Scanner;
public class MulForExer01{

	public static void main(String[] args){

		// ����Scanner�������ڽ����û�����
		Scanner myScanner = new Scanner(System.in);

		double classNum = 3; //�༶����
		double classStuNum = 5; //ÿ��ѧ������

		double allClassTotalScore = 0; //���а༶�ܷ�

		double passLine = 60; // ������
		int passCount = 0; // ��������
		for (int i = 0; i < classNum; i++) { //3���༶

			double clsTolScore = 0; //�༶�ܷ�

			for(int j = 0; j < classStuNum; j++){ //ÿ���༶5��ѧ��

				// ��ȡÿ��ѧ���ĳɼ�
				// ��ʾ�û�����
				System.out.print("������" + (i + 1) + "�࣬��" + ( j + 1 ) + "��ѧ���ĳɼ�");
				double stuScore = myScanner.nextDouble();
				if (stuScore >= passLine) {
					passCount++ ; //������������
				}
				clsTolScore += stuScore; //�ۼ�����ѧ���ĳɼ�

			}

			allClassTotalScore += clsTolScore; //�ۼ����а༶�ĳɼ�

			System.out.println((i + 1) + "��ƽ����=" + (clsTolScore / (double)(classStuNum))); //�༶ƽ����=�༶�ܳɼ�/�༶������

		}

		System.out.println("���а༶ƽ����=" + (allClassTotalScore / (double)(classNum * classStuNum))); //���а༶ƽ����=���а༶�ܳɼ�/����ѧ��
		System.out.println("��������=" + passCount); //���а༶ƽ����=���а༶�ܳɼ�/����ѧ��

	}
}