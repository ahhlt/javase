// break������ϰ
public class BreakExer01{

	public static void main(String[] args){

		int count = 0; //ͳ�ƴ���

		while(true){ //��ѭ��һֱ����������֣�ֱ�����ֵ���97
			int num = (int)(Math.random() * 100) + 1;
			System.out.println(num);
			if (num == 97) {

				System.out.println("�浽97����" + count + "��");
				break;
			}
			count++;
		}
	}
}