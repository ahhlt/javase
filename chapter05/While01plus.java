public class While01plus{
	public static void main(String[] args){
		//需求：打印1-100之间所有能被3整除的数
		//先死后活：
		//1.将控制范围的1和100 设置为变量start和end
		//2.再将被除数3设置为变量num 即可
		
		int start = 1; //取值范围起始
		int end = 100; //取值范围终止
		int num = 3; //被除数
		while(start <= end){
			if (start % num == 0) {
				System.out.println(start);
			}
			start++; //循环变量迭代
		}
	}
}