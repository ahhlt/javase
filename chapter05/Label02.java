// ��ʾcontinue���ǩ�Ľ��ʹ��

public class Label02{

	public static void main(String[] args){

		label1:
			for (int j = 0; j < 4; j++) {
				label2:
					for (int i =0; i < 10; i++) {
						if (i == 2) {
							continue; //��������ѭ��������ִ��label2����һ��ѭ��
						}
						System.out.println("i = " + i);// �ڲ�ѭ������2��������ӡ�����ѭ�����ƴ�ӡ�Ĵ��ڲ�ѭ��

					}
				
			}
	}
}

class Label03{

	public static void main(String[] args){

		label1:
			for (int j = 0; j < 4; j++) {
				label2:
					for (int i =0; i < 10; i++) {
						if (i == 2) {
							continue label1; //�������ѭ��������ִ�����ѭ������һ��ѭ��
						}
						System.out.println("i = " + i);// ��ӡ4�� 0 1
						
					}
				
			}
	}
}