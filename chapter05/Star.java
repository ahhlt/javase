// ����Ϊ��Ҫ���ӡ���������ȴ�ӡ���Σ��ٴ�ӡ��������һ�룬�ٴ�ӡ������
// ���״�ӡ���Ľ�����
public class Star{

	public static void main(String[] args){

		// ����Ϊ���ȴ�ӡһ�����Σ�i�����У�j������
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class Star0{

	public static void main(String[] args){

		// ����Ϊ���ȴ�ӡһ�����Σ�i�����У�j������
		// ��ӡ���������Ҳ�һ�룬j<=i�ʹ�ӡ*�����򲻴�ӡ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= i) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
}
class Star1{

	public static void main(String[] args){

		// ����Ϊ���ȴ�ӡһ�����Σ�i�����У�j������
		// ��ӡ���������Ҳ�һ�룺j<=i�ʹ�ӡ*�����򲻴�ӡ
		// ��ӡ�����������ࣺ���j+i<4�ʹ�ӡ�ո����ӡ*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i < 4) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
				
				
			}
			System.out.println();
		}
	}
}
class Star2{

	public static void main(String[] args){

		// ����Ϊ���ȴ�ӡһ�����Σ�i�����У�j������
		// ��ӡ���������Ҳ�һ�룺j<=i�ʹ�ӡ*�����򲻴�ӡ
		// ��ӡ�����������ࣺ���j+i<4�ʹ�ӡ�ո����ӡ*
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 11; j++) {
				if (j <= 11/2) { //���ƽ������������ӡ
					if (j + i < 11/2) {
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}else{ //���ƽ��������Ұ���ӡ
					if (j - i <= 11/2) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
	}
}
class Star3{

	public static void main(String[] args){

		// ���������������Ĳ�����Ϊ����
		int totalLevel = 6; //���ƽ������Ĳ���
		final int totalStar = totalLevel*2-1; //�����޸�
		for (int i = 0; i < totalLevel; i++) {
			for (int j = 0; j < totalStar; j++) {
				if (j <= totalStar/2) { //���ƽ������������ӡ
					if (j + i < totalStar/2) {
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}else{ //���ƽ��������Ұ���ӡ
					if (j - i <= totalStar/2) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
	}
}

