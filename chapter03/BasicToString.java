// ��ʾ������������תString���͵�ʹ��

public class BasicToString{

	public static void main(String[] args){

		// 1.������������תString���ͣ�ֱ����""ƴ�Ӽ���
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + s2 + s3 + s4);
	}
}