// ��ʾChar�ַ���ʹ��ϸ��

public class CharDetail{
	// ����������������
	public static void main(String[] args){
		//�ַ���������ʹ�õ�����('')�������ĵ����ַ���
		//�����˫����("")����������ʹ�ǵ����ַ�Ҳ�ᱻ��Ϊ���ַ���
	

		//��java�У�char�ı�����һ�������������ʱ��unicode�����Ӧ���ַ�
		//char�������ݣ�Ĭ�������unicode�����Ӧ���ַ������������Ӧ������ 
		char c1 = 97; 
		System.out.println(c1); //���97��Ӧ���ַ�a
		char c2 = 'a';
		System.out.println((int)c2);//ǿ������ת�������a��Ӧ������
		char c3 = '��';
		System.out.println((int)c3); //�����Ӧ������
		char c4 = 38889;
		System.out.println((int)c4);//�����Ӧ����
		System.out.println(c4);// ��� ��

		//char�����ǿ��Խ�������ģ��൱��һ������
		System.out.println('a' + 10);// ��aת���������ټ�10  ���Ϊ107
		c2 = 'a' + 10;
		System.out.println(c2);
		char c5 = 'b' + 1;
		System.out.println((int)c5); //���99
		System.out.println(c5); // ����ַ� c
	}
}