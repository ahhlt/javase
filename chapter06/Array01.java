// 演示使用数组保存多个同类型数据

public class Array01{

	public static void main(String[] args){

		// 定义一个double数组
		// double[] 表示一个double类型的一维数组
		// {3, 5, 1, 3.4, 2, 50}表示数组中保存的元素
		double[] hens = {3, 5, 1, 3.4, 2, 50};

		// for循环遍历数组得到数组中所有元素的和

		double totalWeight = 0; //保存重量总和

		for (int i = 0; i < hens.length; i++) {
			System.out.print(hens[i] + "\t");
			totalWeight += hens[i];
		}
		System.out.println("\n总重量=" + totalWeight + "平均重量=" + (totalWeight/hens.length));
		System.out.println("数组长度=" + hens.length);


	}
}