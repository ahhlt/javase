// 循环输入5个成绩，保存到double数组中
import java.util.Scanner;
public class Array02{

	public static void main(String[] args){

		// 1.使用Scanner对象获取用户输入
		Scanner myScanner = new Scanner(System.in);
		// 2.创建double类型一维数组，长度为5
		double[] scores = new double[5];
		boolean flag = true;
		while(flag){
			for (int i = 0; i < scores.length; i++) {
				System.out.print("请输入第" + (i+1) + "个学生的成绩：");
				scores[i] = myScanner.nextDouble();
				if (i >= scores.length-1) { //第5个成绩接收以后结束循环
					flag = false;
				}
			}
			
		}

		// 遍历数组内容
		for (int j = 0; j < scores.length; j++) {
			System.out.print(scores[j] + " ");
		}
	}
}