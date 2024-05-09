public class Homework08{
	public static void main(String[] args){
		
		double sum = 0; //¼ÇÂ¼×ÜºÍ
		for (int i = 1; i <= 100; i++) {
			for (int j = i; j > 0; j--) {
				sum += j;
			}
		}
		System.out.println("sum = " + sum);
	}
}