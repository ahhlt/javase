// String转基本数据类型的使用细节

public class StringToBasicDetail{

	public static void main(String[] args){

		// 将要被转为基本数据类型的String，必须要满足基本数据类型的条件
		// 比如不能把"123"的String转为boolean，也不能把一串英文转为整数类型
		// 确保String类型的内容是可以转为相应有效的基本数据类型
		String str = "hello";
		int n1 = Integer.parseInt(str);
		System.out.println(n1);
	}

}