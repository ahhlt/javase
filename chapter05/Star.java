// 化繁为简，要想打印金字塔，先打印矩形，再打印金字塔的一半，再打印金字塔
// 进阶打印空心金字塔
public class Star{

	public static void main(String[] args){

		// 化繁为简：先打印一个矩形，i控制行，j控制列
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

		// 化繁为简：先打印一个矩形，i控制行，j控制列
		// 打印金字塔的右侧一半，j<=i就打印*，否则不打印
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

		// 化繁为简：先打印一个矩形，i控制行，j控制列
		// 打印金字塔的右侧一半：j<=i就打印*，否则不打印
		// 打印金字塔的左半侧：如果j+i<4就打印空格否侧打印*
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

		// 化繁为简：先打印一个矩形，i控制行，j控制列
		// 打印金字塔的右侧一半：j<=i就打印*，否则不打印
		// 打印金字塔的左半侧：如果j+i<4就打印空格否侧打印*
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 11; j++) {
				if (j <= 11/2) { //控制金字塔的左半侧打印
					if (j + i < 11/2) {
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}else{ //控制金字塔的右半侧打印
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

		// 先死后活：将金字塔的层数设为变量
		int totalLevel = 6; //控制金字塔的层数
		final int totalStar = totalLevel*2-1; //不用修改
		for (int i = 0; i < totalLevel; i++) {
			for (int j = 0; j < totalStar; j++) {
				if (j <= totalStar/2) { //控制金字塔的左半侧打印
					if (j + i < totalStar/2) {
						System.out.print(" ");
					}else{
						System.out.print("*");
					}
				}else{ //控制金字塔的右半侧打印
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

