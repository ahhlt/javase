// ѭ������5���ɼ������浽double������
import java.util.Scanner;
public class Array02{

	public static void main(String[] args){

		// 1.ʹ��Scanner�����ȡ�û�����
		Scanner myScanner = new Scanner(System.in);
		// 2.����double����һά���飬����Ϊ5
		double[] scores = new double[5];
		boolean flag = true;
		while(flag){
			for (int i = 0; i < scores.length; i++) {
				System.out.print("�������" + (i+1) + "��ѧ���ĳɼ���");
				scores[i] = myScanner.nextDouble();
				if (i >= scores.length-1) { //��5���ɼ������Ժ����ѭ��
					flag = false;
				}
			}
			
		}

		// ������������
		for (int j = 0; j < scores.length; j++) {
			System.out.print(scores[j] + " ");
		}
	}
}