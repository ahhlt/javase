// ǿ������ת����ʹ��ϸ��


public class ForceConvertDetail{

	public static void main(String[] args){

		// 1.ǿ������ת������ֻ������Ĳ�������Ч��
		// �����Ҫ�Ա��ʽ�Ľ������ǿת����Ҫʹ��С����
		//int x = (int)10*3.5+6*1.5; // ������� double -> int
		int x = (int)(10*3.5+6*1.5); // 35+9=44.0 (int)44.0 -> 44
		System.out.println(x); //44

		// 2.char���Ϳ��Ա���int�ĳ���ֵ�������ܱ���int�ı���ֵ����Ҫǿת
		char c1 = 100; //ok��char���Ա���int�ĳ���ֵ
		int m = 100;
		//char c2 = m; //no��char���ܱ���int�ı���ֵ
		char c3 = (char)m; // ����ʹ��ǿת��intתΪchar����
		System.out.println(c3); // d

	}
}