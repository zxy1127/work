package etest7;

public class etest7 {
    public static void main(String[] args) {
        double feeOfThisYear = 10000;   //每年的学费，储指为今年的学费
        double feeAfterTenYears;//十年后的学费

        double total = 0; //从十年后算起，4年内的总学费

        for (int i = 0; i < 14; i++){
            feeOfThisYear *= 1.05;
            if (i == 9){
                feeAfterTenYears = feeOfThisYear;
                //保留两位小数进行输出
                System.out.printf("After ten years, the fee is $%.2f\n" ,feeAfterTenYears);
            }else if(i>=10){
                //从第11年开始，计算4年学费综合
                total += feeOfThisYear;
            }
        }
        System.out.printf("The total is $%.2f\n" , total);
    }
}

