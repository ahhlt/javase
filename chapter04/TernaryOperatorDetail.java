// ��ʾ��Ԫ�������ʹ��ϸ��
public class TernaryOperatorDetail{

	public static void main(String[] args){
		// ���ʽ1�ͱ��ʽ2�����ǿ��Ը������ձ���������(�����Զ�ת�����﷨ǿת) 
		int a = 3;
		int b = 8;

		int c = (a > b) ? a : b; //���ԣ����ձ���cΪint��int -> int
		int c = (a > b) ? 1.1 : 2.2; //�����ԣ����ʽ�е�ֵΪdouble�����ձ�������Ϊint
		
		// ���ʽ��������ձ������Ͳ�ͬʱ���������������Զ�ת������ǿ��ת��
		int c = a > b ? (int)1.1 : (int)2.2;
	}
}