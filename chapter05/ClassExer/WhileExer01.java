public class WhileExer01{
	public static void main(String[] args){
		//需求：打印40-200之间所有的偶数
		//化繁为简：
		//1.先打印出40-200的整数
		//2.满足条件i%2==0时就是偶数
		//3.随即打印这个i，否则不打印
		//先死后活：
		//1.将控制范围的40和100 设置为变量start和end
		//2.再将被除数2设置为变量num 即可
		//
		int start = 40;
		int end = 200;
		int num = 2;
		while(start <= end){
			//System.out.println(i);
			if (start % num == 0) {
				System.out.println(start);
			}
			start++;
		}
	}
}