
// ��ʾbreak��continue�ؼ��ֵĲ�ͬ
public class BreakContinue{

	public static void main(String[] args){
		// break
		System.out.println("*************break���****************");
		for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                break;
            }
            System.out.print(i); //���123�Ժ�ֱ���˳�ѭ��������ִ�и�ѭ���ṹ
        }
        System.out.println();
        System.out.println("*************continue���****************");
        
        for (int j = 1; j <= 10; j++) {
            if (j % 4 == 0) {
                continue;
            }
            System.out.print(j); //i=4��8ʱ������ǰѭ���ִΣ�����ִ�������䣬������һ��ѭ��
        }
        System.out.println();
    
	}
}