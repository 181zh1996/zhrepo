package zh.code.Demo.day;
//九九乘法表倒三角表示
public class Demo07chengfa {
    public static void main(String[] args) {
        for(int i=9;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+j*i+'\t');
            }
            System.out.println(  );
        }

    }
}
