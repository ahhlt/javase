public class While01{
	public static void main(String[] args){
		//���󣺴�ӡ1-100֮�������ܱ�3��������
		//����Ϊ��
		//1.�ȴ�ӡ��1-100������
		//2.��i%3 �ж��Ƿ��ܱ�3���������==0����������
		//3.�漴��ӡ���i�����򲻴�ӡ
		
		int num = 1;
		while(num <= 100){
			if (num % 3 == 0) {
				System.out.println(num);
			}
			num++; //ѭ����������
		}
	}
}