
// 演示标签+break的使用
public class LabelDetail{

	public static void main(String[] args){

		label1:
			for (int j = 0; j < 4; j++) { //外层循环
				label2:
					for (int i = 0; i < 10; i++ ) { //内层循环
						if (i == 2) {
							break; //默认是退出内层循环，输出01之后退出至外层，继续执行外层循环
						
						}
					System.out.println("i =" + i); //输出4次0 1，内层循环执行到i==2就退出，外层循环执行4次。
					}
			}
	}
}
class LabelDetail01{

	public static void main(String[] args){

		label1:
			for (int j = 0; j < 4; j++) { //外层循环
				label2:
					for (int i = 0; i < 10; i++ ) { //内层循环
						if (i == 2) {
							
							break label1; //如果i=2就退出外层循环
						}
					System.out.println("i =" + i); //输出2次0 1，内层循环执行到i==2就结束外层循环。
					}
			}
	}
}