
// ��ʾ��ǩ+break��ʹ��
public class LabelDetail{

	public static void main(String[] args){

		label1:
			for (int j = 0; j < 4; j++) { //���ѭ��
				label2:
					for (int i = 0; i < 10; i++ ) { //�ڲ�ѭ��
						if (i == 2) {
							break; //Ĭ�����˳��ڲ�ѭ�������01֮���˳�����㣬����ִ�����ѭ��
						
						}
					System.out.println("i =" + i); //���4��0 1���ڲ�ѭ��ִ�е�i==2���˳������ѭ��ִ��4�Ρ�
					}
			}
	}
}
class LabelDetail01{

	public static void main(String[] args){

		label1:
			for (int j = 0; j < 4; j++) { //���ѭ��
				label2:
					for (int i = 0; i < 10; i++ ) { //�ڲ�ѭ��
						if (i == 2) {
							
							break label1; //���i=2���˳����ѭ��
						}
					System.out.println("i =" + i); //���2��0 1���ڲ�ѭ��ִ�е�i==2�ͽ������ѭ����
					}
			}
	}
}