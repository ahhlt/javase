// ��ʾ�߼��������ʹ��

public class LoginOperator{
	public static void main(String[] args){

		// ��·��&&���߼���&��ͬtrueΪtrue
		// 	�������߶�����Ϊtrueʱ���������true
		// 1.��·��&&
		int age = 50;
		if (age > 20 && age < 90) {
			System.out.println("ok100");
		}
		// 2.�߼���&
		if (age > 20 & age < 90) {
			System.out.println("ok200");
		}
		// ��·��&&���߼���&������
		// 	��·��&&�����&&���Ϊfalse������ִ��&&�ұߵı��ʽ�����Ϊfalse
		// 	�߼���&����ʹ&���Ϊflase������ִ��&�ұ߱��ʽ
		int a = 4;
        int b = 9;
        // ��·��&&
        if(a < 1 && ++b < 50){ // a<1Ϊfalse������ִ��++b<50
            System.out.println("ok300");
        }
        System.out.println("a=" + a + ", b=" + b); //a=4 b=9
        // �߼���&
        if(a < 1 & ++b < 50){ // ��ʹ��1������Ϊfalse������ִ�е�2����������ʱa=4��b=10
            System.out.println("ok400");
        }
		System.out.println("a=" + a + ", b=" + b);


		// ��·��||���߼���|����trueΪtrue
		// 	��������ֻҪ��һ��Ϊtrue�������Ϊtrue
		// 3.��·��
		int x = 5;
		if (x > 0 ||  ++x < 4) { //��һ��true����true
			System.out.println("ok500");
		}
		// 4.�߼���|
		if (x > 0 | ++x < 4) { //��һ��true����true�������ִ��++x��x=6
			System.out.println("ok600"); //
		}

		// ��·����߼��������
		//  ��·��||��ֻ�е�1������Ϊfalse���Ż���ִ�е�2������
		//  �߼���|����ʹ��1������Ϊtrue��Ҳ��ִ�е�2������
		if (x > 0 || ++x<4) { //��һ��true����true
			System.out.println("ok700");
		}
		System.out.println("x = " + x); // ����ִ��++x��x=6

		// �߼���|
		if (x > 0 | ++x < 4) { //��һ��true����true������ִ��++x
			System.out.println("ok800");
		}
		System.out.println("x = " + x); // x=7

	}
}