// break课堂练习
public class BreakExer01{

	public static void main(String[] args){

		int count = 0; //统计次数

		while(true){ //死循环一直随机生成数字，直到数字等于97
			int num = (int)(Math.random() * 100) + 1;
			System.out.println(num);
			if (num == 97) {

				System.out.println("随到97用了" + count + "次");
				break;
			}
			count++;
		}
	}
}