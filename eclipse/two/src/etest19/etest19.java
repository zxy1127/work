package etest19;

public class etest19 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) { //逐行输出，其中i代表行号
            for (int j = 0; j < 7 - i; j++)    //第i行左侧有7-i个空格
                System.out.print("    "); //四个空格，方便格式化
            for (int j = 0; j < i + 1; j++)     //第i行左侧有i+1个数字
                System.out.printf("%4d" , (int)Math.pow(2,j));  //左侧数字是2的j次方
            for (int j = i; j > 0; j--) //第i行右侧有i个数字，当i=0的时候，本循环不执行
                System.out.printf("%4d" , (int)Math.pow(2,j-1));//右侧数字是2的j-1次方
            //以上三个循环，j都代表个数（计数器）
            System.out.println();
        }
    }
}

