// ��ʾʹ�����鱣����ͬ��������

public class Array01{

	public static void main(String[] args){

		// ����һ��double����
		// double[] ��ʾһ��double���͵�һά����
		// {3, 5, 1, 3.4, 2, 50}��ʾ�����б����Ԫ��
		double[] hens = {3, 5, 1, 3.4, 2, 50};

		// forѭ����������õ�����������Ԫ�صĺ�

		double totalWeight = 0; //���������ܺ�

		for (int i = 0; i < hens.length; i++) {
			System.out.print(hens[i] + "\t");
			totalWeight += hens[i];
		}
		System.out.println("\n������=" + totalWeight + "ƽ������=" + (totalWeight/hens.length));
		System.out.println("���鳤��=" + hens.length);


	}
}