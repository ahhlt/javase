import java.util.Scanner;
public class Homework04{
	public static void main(String[] args){
	
		int num = 153; 
		int ge = 0; //�����λ
		int shi = 0; //����ʮλ
		int bai = 0; //�����λ

		// ȡ��λ ȡ����
		ge = num % 10;
		shi = num / 10 % 10;
		bai = num / 100;

		System.out.println(num);
		System.out.println(bai);
		System.out.println(shi);
		System.out.println(ge);

		if (num == ge*ge*ge+shi*shi*shi+bai*bai*bai) {
			System.out.println(num+"��ˮ�ɻ���");
		}
		System.out.println(ge*ge*ge+shi*shi*shi+bai*bai*bai);
		
		
		
	}
}