public class Homework04{

	public static void main(String[] args){

		int[] arr = new int[]{10,12,46,90};

		// 插入前打印数组
		System.out.print("插入前：");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

		int index = -1; //保存插入的位置
		int insertNum = 100; //要插入的数值
		// 遍历数组与insertNum相比，来确定index
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= insertNum) {
				index = i+1; //确定位置
			}else{
				index = arr.length; //如果中间没有，就插入到最后
			}
		}

		// 创建新的数组
		int[] newArr = new int[arr.length + 1];

		// 开始复制index以前的数组
		for (int i = 0; i < newArr.length; i++) {
			if (i < index) {
				newArr[i] = arr[i];
			}
			if (i == index) {
				newArr[index] = insertNum;

			}
			if (i > index) {
				newArr[i] = arr[i-1];
			}
		}
		System.out.println();
		for (int num : newArr) {
			System.out.print(num + " ");
		}
		

	}
}