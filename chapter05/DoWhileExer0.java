public class DoWhileExer0{
	public static void main(String[] args){
		//1.ʹ��do..while��ӡ1-100
		//2.����1-100�ĺ�
		//����Ϊ��
		//1.�ȴ�ӡ1-100������
		//2.����һ������sum ���ڴ�ź�
		//3.��ÿһ��1-100�ڵ������ӵ�sum��
		//������
		//1.�����Ʒ�Χ�ĳ��� ����Ϊ����start��end
		//   �Ϳ��Լ��㷶Χstart-end֮���������
		//
		int start = 1;
		int end = 100;
		int sum =0;
		do{
			System.out.println(start);
			sum += start;
			start++;

		}while(start<=end);
		System.out.println("1-100�ĺ�= "+sum);
	}
}