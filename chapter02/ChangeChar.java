// 演示转义字符的使用

public class ChangeChar{
	// 主方法，程序的入口
	public static void main(String[] args){
	// 1. 制表位\t：实现文本对齐
		System.out.println("安徽\t理工\t大学");
	// 2. 换行符\n：换行
		System.out.println("安徽\n理工\n大学");
	// 3. 一个\ -> \\：打印一个\
		System.out.println("路径：E:\\ZSHUAIBO\\Java\\JavaSE\\code\\chapter02>");
	// 4. 一个'  -> \'：打印一个'
		System.out.println("单引号赵帅博：\'我正在学习Java\'。");
	// 5. 一个" -> \"：打印一个"
		System.out.println("双引号赵帅博：\"我正在学习Java\"。");
	// 6. 回车\r，回车不是换行，打印文本时，输入\r后光标会定位到行首，并依次覆盖后面的文本进行打印
		System.out.println("安徽理工大学\r赵帅博"); 
	}
}