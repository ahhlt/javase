// ��ֵ�������ʾ

public class SetValueOperator{

	public static void main(String[] args){
	
		int n = 10;
		// 1.��"`=`"�����������Ͳ�һ��ʱ��
		// 	 ����ʹ��`�Զ���������`��`ǿ������ת��`���д���
		long l1 = n; //�Զ�����ת��
		byte b1 = (byte)(n);
		// 2.����������ֵ
		int a, b;
		a = b = 100;
		// 3.���ϸ�ֵ����������`����ת��`���ײ����`ǿ������ת����`
		byte n1 = 12;
		n1 += 3; //�ȼ���n1=(byte)(n1+3) 
		System.out.println(n1); 
		 System.out.println("Type of n1: " + ((Object)n1).getClass().getName());
	}
}