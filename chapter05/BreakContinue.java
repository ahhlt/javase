
// 演示break与continue关键字的不同
public class BreakContinue{

	public static void main(String[] args){
		// break
		System.out.println("*************break输出****************");
		for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                break;
            }
            System.out.print(i); //输出123以后直接退出循环，不再执行该循环结构
        }
        System.out.println();
        System.out.println("*************continue输出****************");
        
        for (int j = 1; j <= 10; j++) {
            if (j % 4 == 0) {
                continue;
            }
            System.out.print(j); //i=4和8时跳出当前循环轮次，不再执行输出语句，进入下一轮循环
        }
        System.out.println();
    
	}
}