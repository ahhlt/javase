public class Break0{
	public static void main(String[] args){
	
		//�۲죬����ѭ��Ƕ��ʱ��break�˳�����һ��
		int i;
		int j;
		for (j=0;j<3;j++) {
			for (i = 0; i < 10; i++) {
				if (i==4) {
					break; 
				}
				System.out.println("ok"+i);
			}
			System.out.println("�����ڲ�ѭ��...");
		}
		System.out.println("���ѭ������"+j);
	}
}