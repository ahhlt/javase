
public class ClassExer03{
	public static void main(String[] args){
		int x = 5;
		int y = 5;
		if (x++ == 5 | ++y == 5) { 
			// �߼�����trueΪture������������Ҫִ��
			// x++��++���ڱ��ʽ�з���ԭʼֵx=5����5==5�����Ϊtrue
			// ++yǰ++���ڱ��ʽ�з��������Ժ��ֵy=6����5==6���Ϊfalse
			// �߼���|�Ľ��Ϊtrue
			x = 11;
		}
		System.out.println("x = " + x + ", y = " + y); //x=11,y=6

	}
}
