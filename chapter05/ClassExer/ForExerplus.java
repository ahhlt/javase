
public class ForExerplus{

	public static void main(String[] args){

		// 先死后活：将5变为变量n
		int n = 10;
		// 同时初始化两个变量i和j，需要为同一数据类型
		for (int i = 0, j = n; j >= 0; i++, j--) {
			System.out.println(i + " + " + j + " = " + (i + j));

		}
	}
}