
public class ClassExer04{
	public static void main(String[] args){
		int x = 5;
		int y = 5;
		if (x++ == 5 || ++y == 5) {
			// ��·����trueΪtrue��ֻ������1Ϊfalseʱ��ִ������2 
			// x++���ڱ��ʽ����x��ԭʼֵx=5 5==5Ϊtrue������ִ������2
			// ��ʱ��x=11��y=5
			x = 11;
		}
		System.out.println("x = " + x + ", y = " + y); //x=11,y=5

	}
}
