
public class ArrayExer01{

	public static void main(String[] args){

		// 动态初始化，创建一个char类型数组保存26个字母A-Z
		char[] charArr = new char[26];

		for (char i = 0; i < 26; i++) {
			charArr[i] = (char)('A' + i); //将字符存放到数组中
		}

		// 遍历数组
		for (int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i] + " ");
		}
	}
}