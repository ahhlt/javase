// 类型的自动转换演示

public class AutoConvert{
	public static void main(String[] args){
		// 低精度 自动转换为 高精度
		int num = 'a'; // char ——> int
		double d1 = 80; // int ——> double
		System.out.println(num); // 输出97
		System.out.println(d1); // 输出80.0
	}
}