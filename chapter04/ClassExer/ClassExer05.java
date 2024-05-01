
public class ClassExer05{
	public static void main(String[] args){
		
		boolean x = true;
		boolean y = false;
		short z = 46;
		if ((z++ == 46) && (y = true)) {
			// 短路与，同true为true，只有条件1为true时才执行条件2
			// 这里后++返回z的原始值z=46 46==46为true，再执行z++ z=47，继续执行条件2，y=true将y赋值为true，条件2为true
			// 同true为true，继续执行z++，z=48
			z++;
		}
		if ((x = false) || (++z == 49)) {
			// 短路或，有true为true，只有条件1为false时才执行条件2
			// 这里x=false将x赋值为fasle且条件1为false，继续执行条件2
			// ++z返回自增以后的值z=48+1=49 49==49为true，因此短路或为true
			// 执行z++，z=49+1=50  
			z++;
		}
		System.out.println("z = " + z); //50
	}
}
