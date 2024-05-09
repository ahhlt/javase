public class Break0{
	public static void main(String[] args){
	
		//观察，当有循环嵌套时，break退出到哪一层
		int i;
		int j;
		for (j=0;j<3;j++) {
			for (i = 0; i < 10; i++) {
				if (i==4) {
					break; 
				}
				System.out.println("ok"+i);
			}
			System.out.println("跳出内层循环...");
		}
		System.out.println("外层循环结束"+j);
	}
}