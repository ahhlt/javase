// ��ʾ�����������ʹ��


public class ArithmeticOperator{
	public static void main(String[] args){

		System.out.println(10 / 4); //����int�����������int��2.5ǿתΪint=2
		System.out.println(10.0 / 4); //Ĭ��ʹ�ýϴ󾫶ȡ��ϴ�Χ�����ͱ���������
		double d = 10 / 4; // 10/4=2����ǿתΪdouble����2.0
		System.out.println(d); //2.0

		// %ȡģ���㣬ȡ����
		// ���� a % b = a - a / b * b
		// -10 % 3 = -10 - -10 / 3 * 3 = -10 - -9 = -1
		// 10 % -3 = 10 - 10 /-3 * -3 = 10 - 9 = 1
		// -10 % -3 = -10 - -10 /-3 *-3 = -10 + 9 = -1
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); // 1
		System.out.println(-10 % -3); //-1

		// ǰ++��ʹ��
		// i++��++i����ʹ��ʱ���ȼ���i=i+1
		int i = 10;
		i++;
		++i;
		System.out.println("i = " + i); //12

		/*
			ʹ���ٱ��ʽ��ʱ
			ǰ++��++i ���������ٸ�ֵ��i��+1���ٲ�����ʽ����
			��++��i++ �ȸ�ֵ����������i�Ȳ�����ʽ���㣬��+1

		 */ 
		int j = 8;
		int k = ++j; //�ȼ��� j=j+1;k=j;��j=9,k=9
		//int k = j++; //�ȼ��� k=j; j=j+1;��k=8,j=9
		System.out.println("k = " + k + ", j = "+j);
	}
}