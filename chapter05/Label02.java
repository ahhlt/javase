// 演示continue与标签的结合使用

public class Label02{

	public static void main(String[] args){

		label1:
			for (int j = 0; j < 4; j++) {
				label2:
					for (int i =0; i < 10; i++) {
						if (i == 2) {
							continue; //跳出本轮循环，继续执行label2的下一轮循环
						}
						System.out.println("i = " + i);// 内层循环除了2其他都打印，外层循环控制打印四次内层循环

					}
				
			}
	}
}

class Label03{

	public static void main(String[] args){

		label1:
			for (int j = 0; j < 4; j++) {
				label2:
					for (int i =0; i < 10; i++) {
						if (i == 2) {
							continue label1; //跳至外层循环，继续执行外层循环的下一轮循环
						}
						System.out.println("i = " + i);// 打印4次 0 1
						
					}
				
			}
	}
}