public class While01plus{
	public static void main(String[] args){
		//���󣺴�ӡ1-100֮�������ܱ�3��������
		//������
		//1.�����Ʒ�Χ��1��100 ����Ϊ����start��end
		//2.�ٽ�������3����Ϊ����num ����
		
		int start = 1; //ȡֵ��Χ��ʼ
		int end = 100; //ȡֵ��Χ��ֹ
		int num = 3; //������
		while(start <= end){
			if (start % num == 0) {
				System.out.println(start);
			}
			start++; //ѭ����������
		}
	}
}