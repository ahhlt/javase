// ��ӡ1-100֮��������9�ı�����������ͳ�Ƹ������ܺ�
// forѭ��ʵ��

public class For01{

	public static void main(String[] args){

		int count = 0; //ͳ�Ƹ���
		int sum = 0; //ͳ���ܺ�

		for(int i = 1; i <= 100; i++){
			if (i % 9 == 0) {
				System.out.println(i + "��9�ı���");
				count++; //������������+1
				sum += i; //���������ۼ�i
			}
		}
		System.out.println("1-100֮����9�ı������� " + count + " �����ܺ�=" + sum);
	}
}

