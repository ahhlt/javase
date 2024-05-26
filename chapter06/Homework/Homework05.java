public class Homework05{
	public static void main(String[] args){

		//第六章第五题
		// 1.首先创建一个长度为10的整数数组
		int[] arr = new int[10];
		// 2.创建生成随机数的生成器
		for (int i = 0; i < arr.length; i++) {
			// 随机生成10个1-100的数并存到数组中
			double randomNum = Math.random()*100;
			arr[i] = (int)randomNum;
		}

		// 3.定义变量记录最大值和最大值下标以及平均值、总和
		int sum = 0;
		double avgNum = 0;
		int maxNum = 0;
		int maxNumIndex = 0;
		// 是否有8的标志
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			// 如果遍历出来的数组元素 > maxNum
			// 就将maxNum换为该元素，并记下该元素下标
			if (arr[i] > maxNum) {
				maxNum = arr[i];
				maxNumIndex = i;
			}
			// 求出总和并计算平均值
			sum += arr[i];
			avgNum = sum/arr.length;

			//判断是否有8
			if(arr[i] == 8){
				flag++; // 如果是8就+1
			}
		}
        
		// 正序打印
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		//倒序打印
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();


		//使用冒泡排序对数组进行操作
		// 遍历数组 大数向后排
		// 这个冒泡排序效率很低，学习韩老师的代码
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i] > arr[i + 1]) {
					//大数向后移动
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("最大值= " + maxNum);
		System.out.println("最大值下标= " + maxNumIndex);
		System.out.println("总和= " + sum);
		System.out.println("平均值= " + avgNum);
	}
}