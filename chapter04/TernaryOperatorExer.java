
public class TernaryOperatorExer{

	public static void main(String[] args){
		
		// ʹ����Ԫ�����ʵ�������������ֵ
		int a = 10;
		int b = 4;
		int c = 6;

		// ��֣���������Ԫ������ҳ������������ֵ
		int firstNum = ( a > b ) ? a : b; //ѡ��a��b֮��Ľϴ�ֵ

		int maxNum = ( c > firstNum ) ? c : firstNum; //���ѡ����a,b,c֮������ֵ
		// �ٽ�firstNumʹ��(( a > b ) ? a : b)�滻
		int max_Num = (c > (( a > b ) ? a : b)) ? c : (( a > b ) ? a : b);

		System.out.println("maxNum = " + maxNum + ", max_Num = " + max_Num);

	}
}