package etest7;

public class etest7 {
    public static void main(String[] args) {
        double feeOfThisYear = 10000;   //ÿ���ѧ�ѣ���ָΪ�����ѧ��
        double feeAfterTenYears;//ʮ����ѧ��

        double total = 0; //��ʮ�������4���ڵ���ѧ��

        for (int i = 0; i < 14; i++){
            feeOfThisYear *= 1.05;
            if (i == 9){
                feeAfterTenYears = feeOfThisYear;
                //������λС���������
                System.out.printf("After ten years, the fee is $%.2f\n" ,feeAfterTenYears);
            }else if(i>=10){
                //�ӵ�11�꿪ʼ������4��ѧ���ۺ�
                total += feeOfThisYear;
            }
        }
        System.out.printf("The total is $%.2f\n" , total);
    }
}

