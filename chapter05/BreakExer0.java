
public class BreakExer0{
	public static void main(String[] args){
	
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// ���
			sum += i;
			// �жϺ��Ƿ�>20���������ִ��break
			if (sum > 20) {
				System.out.println("i= " + i + " sum=" + sum);
				break;
			}
		}
	}
}