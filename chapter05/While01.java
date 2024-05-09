public class While01{
	public static void main(String[] args){
		//需求：打印1-100之间所有能被3整除的数
		//化繁为简：
		//1.先打印出1-100的整数
		//2.用i%3 判断是否能被3整除，如果==0就能整除，
		//3.随即打印这个i，否则不打印
		
		int num = 1;
		while(num <= 100){
			if (num % 3 == 0) {
				System.out.println(num);
			}
			num++; //循环变量迭代
		}
	}
}