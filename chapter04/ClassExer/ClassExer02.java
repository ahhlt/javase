
public class ClassExer02{
	public static void main(String[] args){
		int x = 5;
		int y = 5;
		if (x++ == 6 && ++y == 6) {
			// ��·�룬ͬtrueΪtrue��ֻ������1Ϊtrueʱ��ִ������2 
			// x++���ڱ��ʽ����x��ԭʼֵx=5 5==6Ϊfalse������ִ������2
			// ��ʱ��x=6��y=5
			x = 11;
		}
		System.out.println("x = " + x + ", y = " + y); //x=6,y=5

	}
}
