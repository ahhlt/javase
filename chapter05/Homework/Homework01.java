
public class Homework01{

	public static void main(String[] args){

		double balance = 100000;
		int passCount = 0; //记录通过次数
		// 要求使用while+break完成
		while(balance > 0){
			if (balance > 50000) {
				balance -= (balance * 0.05);
				passCount++;
			}else if (balance <= 50000 && balance > 1000) {
				balance -= 1000;
				passCount++;
			}else{
				break;
			}
		}
		System.out.println("可以经过"+passCount+"次路口");
	}
}