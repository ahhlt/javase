
public class Homework01{

	public static void main(String[] args){

		String strs[] = {'a','b','c'}; //错，String类型的数组不能存放char类型数据
		String[] strs = {"a","b","c"}; //对
		//String[] strs = new String{"a" "b" "c"}; //错，new String后少了[],且数组内部没有，分隔
		String strs[] = new String[]{"a","b","c"}; //对
		String[] strs = new String[3]{"a","b","c"}; //错在数组声明时，如果指定了数组大小（如 new String[3]），则不能使用初始化列表 {}。相反，如果使用初始化列表，则不需要也不能指定数组的大小


	}
}