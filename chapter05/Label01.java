
// ��ʾ��ǩ+break��ʹ��
public class Label01{

	public static void main(String[] args){

		label1:
			for (int j = 0; j < 4; j++) {
				label2:
					for (int i = 0; i < 10; i++ ) {
						if (i == 2) {
							//break;
							break label1; //���i=2���˳����ѭ��
						}
					System.out.println("i =" + i);
					}
			}
	}
}