// ��ʾǿ������ת����ʹ��

public class ForceConvert{
	public static void main(String[] args){

		//��ʾǿ������ת��
		int n1 = (int)1.9;
		System.out.println("n1=" + n1);//������ʧ

		int n2 = 2000;
		byte b1 = (byte)n2;//��int����ǿ��ת��Ϊbyte�����
		System.out.println("b1=" + b1);//�������

		char c1 = 'a'; //97
		float f1 = (float)c1;// ����������97ǿ��ת��Ϊfloat 97.0
		System.out.println("f1=" + f1);

	}

}