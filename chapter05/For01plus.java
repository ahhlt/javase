public class For01plus{

	public static void main(String[] args){

		int count = 0; //ͳ�Ƹ���
		int sum = 0; //ͳ���ܺ�

		// ������������ȡֵ��Χ�ı䣬����1-100
		int start = 1;
		int end = 100;
		// ����һ������������Ŀ������
		int myNum = 9;
		for(int i = start; i <= end; i++){
			if (i % myNum == 0) {
				System.out.println(i + "��9�ı���");
				count++; //������������+1
				sum += i; //���������ۼ�i
			}
		}
		System.out.println("1-100֮����9�ı������� " + count + " �����ܺ�=" + sum);
	}
}