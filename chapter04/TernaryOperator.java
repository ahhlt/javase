// ��ʾ��Ԫ�������ʹ��
public class TernaryOperator{

	public static void main(String[] args){

		int a = 10;
		int b = 99;

		int result = (a > b) ? a++ : b--;
		// a > bΪfalse�����صڶ������ʽb--���Ƚ�b��ֵ���أ�b���Լ�
		System.out.println("result= " + result);
        System.out.println("b= " + b);
		// ���ʽ��������ձ������Ͳ�ͬʱ���������������Զ�ת������ǿ��ת��
		int c = a > b ? (int)1.1 : (int)2.2;
	}
}