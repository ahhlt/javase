public class For01plus{

	public static void main(String[] args){

		int count = 0; //统计个数
		int sum = 0; //统计总和

		// 定义两个控制取值范围的变，量如1-100
		int start = 1;
		int end = 100;
		// 定义一个变量，保存目标数字
		int myNum = 9;
		for(int i = start; i <= end; i++){
			if (i % myNum == 0) {
				System.out.println(i + "是9的倍数");
				count++; //满足条件个数+1
				sum += i; //满足条件累加i
			}
		}
		System.out.println("1-100之间是9的倍数的有 " + count + " 个，总和=" + sum);
	}
}