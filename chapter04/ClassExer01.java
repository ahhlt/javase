// �������Լ�������

public class ClassExer01{
	public static void main(String[] args){
		int i = 1;
		i = i++; //��++���ص���������ǰ��ֵ��i=��i����֮ǰ��ֵ��
		System.out.println(i); //1

		int j = 1;
		j = ++j; //ǰ++���ص��������Ժ��ֵ��j=��j�����Ժ��ֵ��
		System.out.println(j); //2

		int k = 1;
		k = k--; //��--���ص����Լ�֮ǰ��ֵ��k=��k�Լ�֮ǰ��ֵ��
		System.out.println(k); //1

		int l = 1;
		l = --l; //ǰ--���ص����Լ��Ժ��ֵ��l=��l�Լ��Ժ��ֵ��
		System.out.println(l); //0
	}
}