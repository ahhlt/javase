
public class ClassExer01{
	public static void main(String[] args){
		int x = 5;
		int y = 5;
		if (x++ == 6 & ++y == 6) { 
			// �߼��룬ͬtrueΪtrue������������Ҫִ��
			// x++��++���ڱ��ʽ�з���ԭʼֵx=5����5==6�����Ϊfalse
			// ++yǰ++���ڱ��ʽ�з��������Ժ��ֵy=6����6==6���Ϊtrue
			// �߼���&�Ľ��Ϊfalse
			x = 11;
		}
		System.out.println("x = " + x + ", y = " + y); //x=6,y=6

	}
}
