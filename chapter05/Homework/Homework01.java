
public class Homework01{

	public static void main(String[] args){

		double balance = 100000;
		int passCount = 0; //��¼ͨ������
		// Ҫ��ʹ��while+break���
		while(balance > 0){
			if (balance > 50000) {
				balance -= (balance * 0.05);
				passCount++;
			}else if (balance <= 50000 && balance > 1000) {
				balance -= 1000;
				passCount++;
			}else{
				break;
			}
		}
		System.out.println("���Ծ���"+passCount+"��·��");
	}
}