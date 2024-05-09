import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){
	
		int num = 153; 
		int ge = 0; //保存个位
		int shi = 0; //保存十位
		int bai = 0; //保存百位

		// 取个位 取余数
		ge = num % 10;
		shi = num / 10 % 10;
		bai = num / 100;

		System.out.println(num);
		System.out.println(bai);
		System.out.println(shi);
		System.out.println(ge);

		if (num == ge*ge*ge+shi*shi*shi+bai*bai*bai) {
			System.out.println(num+"是水仙花数");
		}
		System.out.println(ge*ge*ge+shi*shi*shi+bai*bai*bai);
		
		
		
	}
}