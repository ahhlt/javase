// 整数类型的使用细节

public class IntDetail{
	public static void main(String[] args){
		// Java的整型常量默认为int型，声明long型常量须后加“l”或“L”
		int a = 1; // 默认int为4个字节
		// int n2 = 1L; 是不对的，因为后面的1为long类型占用内存空间8字节
		// 而变量n2是int类型，只有4个字节，容不下long型的1
		long n3 = 1L;  //这是正确的
	}
}