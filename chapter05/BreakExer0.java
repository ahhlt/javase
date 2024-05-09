
public class BreakExer0{
	public static void main(String[] args){
	
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// 求和
			sum += i;
			// 判断和是否>20，如果大于执行break
			if (sum > 20) {
				System.out.println("i= " + i + " sum=" + sum);
				break;
			}
		}
	}
}