// 打印1-100之间所有是9的倍数的整数，统计个数及总和
// for循环实现

public class For01{

	public static void main(String[] args){

		int count = 0; //统计个数
		int sum = 0; //统计总和

		for(int i = 1; i <= 100; i++){
			if (i % 9 == 0) {
				System.out.println(i + "是9的倍数");
				count++; //满足条件个数+1
				sum += i; //满足条件累加i
			}
		}
		System.out.println("1-100之间是9的倍数的有 " + count + " 个，总和=" + sum);
	}
}

