// 打印九九乘法表

public class MulTable{

	public static void main(String[] args){

		// 化繁为简
		// 1）一共10行，使用i控制行
		// 1）每行打印的列数与行数相同，第1行打印1列、第2行打印2列...，用j控制列，列数与i保持一致
		for (int i = 1; i < 10; i++) {
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}