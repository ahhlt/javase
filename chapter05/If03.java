import java.util.Scanner;
public class If03{
	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);
		System.out.print("���������÷�(1-100)��");
		int creditScore = myScanner.nextInt();
		if(creditScore >= 1 && creditScore <= 100){

		
			if (creditScore== 100) {
				System.out.println("���ü���");
			}else if (creditScore > 80 && creditScore <= 99) {
				System.out.println("��������");
			}else if (creditScore>=60 && creditScore<=80) {
				System.out.println("����һ��");
			}else{
				System.out.println("���ò�����");
			}
		}else{
			System.out.println("���÷���Ҫ��1-100������������");
		}
	}
}