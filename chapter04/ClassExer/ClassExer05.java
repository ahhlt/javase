
public class ClassExer05{
	public static void main(String[] args){
		
		boolean x = true;
		boolean y = false;
		short z = 46;
		if ((z++ == 46) && (y = true)) {
			// ��·�룬ͬtrueΪtrue��ֻ������1Ϊtrueʱ��ִ������2
			// �����++����z��ԭʼֵz=46 46==46Ϊtrue����ִ��z++ z=47������ִ������2��y=true��y��ֵΪtrue������2Ϊtrue
			// ͬtrueΪtrue������ִ��z++��z=48
			z++;
		}
		if ((x = false) || (++z == 49)) {
			// ��·����trueΪtrue��ֻ������1Ϊfalseʱ��ִ������2
			// ����x=false��x��ֵΪfasle������1Ϊfalse������ִ������2
			// ++z���������Ժ��ֵz=48+1=49 49==49Ϊtrue����˶�·��Ϊtrue
			// ִ��z++��z=49+1=50  
			z++;
		}
		System.out.println("z = " + z); //50
	}
}
