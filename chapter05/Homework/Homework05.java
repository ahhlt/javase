public class Homework05{
	public static void main(String[] args){
		
		int row = 0; //��������
		for (int i = 1; i <= 100; i++) {
			if (i % 5 != 0) {
				System.out.print(i + "\t");
				row++;
				if (row % 5 == 0) { //ÿ5��1��
					System.out.println();
				}
			}
		}
	}
}