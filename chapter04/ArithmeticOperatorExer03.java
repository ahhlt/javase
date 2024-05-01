public class ArithmeticOperatorExer03{

    public static void main(String[] args){

        double ctTemp = 234.5; //华氏温度
        double celsius; // 摄氏温度
        // 摄氏温度 = （华氏温度-32）/1.8
        celsius = (ctTemp - 32) / 1.8;
        // 这里必须是5.0，如果是int类型的5/后面的是，精度会丢失
        System.out.println("华氏温度" + ctTemp + " = 摄氏温度" + celsius);
    }
}