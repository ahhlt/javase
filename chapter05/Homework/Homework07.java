public class Homework07{
	public static void main(String[] args){
		
		double sum = 0; //记录总和
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { //偶数项
				sum -= (double)(1/i);
			}else{
				sum += (double)(1/i);
			}
		}
		System.out.println("sum = " + sum);
	}
}