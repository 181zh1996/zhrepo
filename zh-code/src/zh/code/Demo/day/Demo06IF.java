package zh.code.Demo.day;
//三个数字比大小取最大值
public class Demo06IF {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        int num3=15;
        if(num1>num2){
            if(num1>num3){
                System.out.println(num1);
            }else {
                System.out.println(num3);
            }
        }else if(num2>num3){
                System.out.println(num2);
            }else {
                System.out.println(num3);
            }


    }
}
