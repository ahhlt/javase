public class DoWhileExer1{
	public static void main(String[] args){
		//����ʹ��do..while��ӡ1-200֮��
		//    �ܱ�5�������ܱ�3�����ĸ���
		//����Ϊ��
		//1.�ȴ�ӡ1-200������
		//2.����һ����ʼint����i=1,ѭ��������һ������count ���ڴ���������������ĸ���
		//3.if����ж��Ƿ��������� i%5==0 && i%3!=0
		//4.���������� ִ��count++
		//
		//������
		//1.�����Ʒ�Χ�ĳ��� ����Ϊ����start��end
		//2.�������е�5��3�ֱ�����Ϊ����num1��num2
		//
		int start = 1;
		int end = 200;
		int count = 0;
		int num1 = 5;
		int num2 = 3;
		do{
			//System.out.println(i);
			if (start % num1 == 0 && start % num2 != 0) {
				count++;
			}
			start++;
		}while(start<=end);
		System.out.println("�������������ĸ���=" + count);
		
	}
}