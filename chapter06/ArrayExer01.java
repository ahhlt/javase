
public class ArrayExer01{

	public static void main(String[] args){

		// ��̬��ʼ��������һ��char�������鱣��26����ĸA-Z
		char[] charArr = new char[26];

		for (char i = 0; i < 26; i++) {
			charArr[i] = (char)('A' + i); //���ַ���ŵ�������
		}

		// ��������
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i] + " ");
		}
	}
}