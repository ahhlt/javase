import java.util.Scanner;
public class BreakExer1{
	public static void main(String[] args){
	
		Scanner inScanner = new Scanner(System.in);

		String uname =  "";
		String psd = "";
		int chance = 3;
		// 三次机会
		for (int i = 3; i >= 1; i--) {
			// 接收用户输入 字符串
			System.out.println("请输入用户名：");
			uname = inScanner.next();
			System.out.println("请输入密码：");
			psd = inScanner.next();
            	//equals() 判断两字符串是否相等
			if ("赵丰年牛勃".equals(uname) && "666".equals(psd)) {
				System.out.println("登录成功！");
				break;
			}
			chance--;  //每次输错chance自减
			if (chance==0) { //机会用完自动退出
				System.out.println("赵丰年真菜，退出系统");
			}else {
				System.out.println("输入错误，您还有"+(chance)+"次机会，请再次尝试。");
			}
			

			//equals方法 判断字符串是否相等
			
		}
}
}