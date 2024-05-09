import java.util.Scanner;
public class MulForExer01{

	public static void main(String[] args){

		// 创建Scanner对象，用于接收用户输入
		Scanner myScanner = new Scanner(System.in);

		double classNum = 3; //班级个数
		double classStuNum = 5; //每班学生个数

		double allClassTotalScore = 0; //所有班级总分

		double passLine = 60; // 及格线
		int passCount = 0; // 及格人数
		for (int i = 0; i < classNum; i++) { //3个班级

			double clsTolScore = 0; //班级总分

			for(int j = 0; j < classStuNum; j++){ //每个班级5个学生

				// 获取每个学生的成绩
				// 提示用户输入
				System.out.print("请输入" + (i + 1) + "班，第" + ( j + 1 ) + "个学生的成绩");
				double stuScore = myScanner.nextDouble();
				if (stuScore >= passLine) {
					passCount++ ; //如果及格就自增
				}
				clsTolScore += stuScore; //累加所有学生的成绩

			}

			allClassTotalScore += clsTolScore; //累加所有班级的成绩

			System.out.println((i + 1) + "班平均分=" + (clsTolScore / (double)(classStuNum))); //班级平均分=班级总成绩/班级总人数

		}

		System.out.println("所有班级平均分=" + (allClassTotalScore / (double)(classNum * classStuNum))); //所有班级平均分=所有班级总成绩/所有学生
		System.out.println("及格人数=" + passCount); //所有班级平均分=所有班级总成绩/所有学生

	}
}