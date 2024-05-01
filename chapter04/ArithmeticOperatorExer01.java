
public class ArithmeticOperatorExer01{
	
	public static void main(String[] args){

		int i1 = 10;
		int i2 = 20;
		int i = i1++; //i1++返回的是i1自增之前的值，i=10
		System.out.println("i="+i); //10
		System.out.println("i2="+i2); //20
		i = --i2; //--i2返回的是i2自减以后的值，i=19
		System.out.println("i="+i); //19
		System.out.println("i2="+i2); //19

	}
}