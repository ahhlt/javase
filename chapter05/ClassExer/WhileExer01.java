public class WhileExer01{
	public static void main(String[] args){
		//���󣺴�ӡ40-200֮�����е�ż��
		//����Ϊ��
		//1.�ȴ�ӡ��40-200������
		//2.��������i%2==0ʱ����ż��
		//3.�漴��ӡ���i�����򲻴�ӡ
		//������
		//1.�����Ʒ�Χ��40��100 ����Ϊ����start��end
		//2.�ٽ�������2����Ϊ����num ����
		//
		int start = 40;
		int end = 200;
		int num = 2;
		while(start <= end){
			//System.out.println(i);
			if (start % num == 0) {
				System.out.println(start);
			}
			start++;
		}
	}
}