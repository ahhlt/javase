public class Homework04{
    public static void main(String[] args){
        String name = "赵帅博";
        int age = 23;
        float score = 89.0f;
        char gender = '男';
        String hobby = "JAVA";

        System.out.println("姓名" + '\t' + "年龄" + '\t' + "成绩" + '\t' +
                          "性别" + '\t' + "爱好" + '\n' + name + '\t' + age + '\t' + score
                          + '\t' + gender + '\t' + hobby);
        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"
                            + name + '\t' + age + '\t' + score
                          + '\t' + gender + '\t' + hobby);
    }
}