// ��ӡ�žų˷���

public class MulTable{

	public static void main(String[] args){

		// ����Ϊ��
		// 1��һ��10�У�ʹ��i������
		// 1��ÿ�д�ӡ��������������ͬ����1�д�ӡ1�С���2�д�ӡ2��...����j�����У�������i����һ��
		for (int i = 1; i < 10; i++) {
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}