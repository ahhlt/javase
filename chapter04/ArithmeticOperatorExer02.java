
public class ArithmeticOperatorExer02{
    public static void main(String[] args){
        int isDay = 59; //存放总天数
        int week; // 存放几个星期的值
        int day;  // 存放零几天的值
        week = isDay/7; // 计算总天数有多少个周
        day = isDay%7;  // 计算零几天
        System.out.println("合" + week + "个星期零" + day + "天");
    }
}