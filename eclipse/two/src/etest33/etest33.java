package etest33;

public class etest33 {
    public static void main(String[] args) {
        System.out.println("10000���ڵ���ȫ���У�");
        for (int i = 1; i < 10000; i++) {    //��10000���ڵ��������Ų�
            int sum = 0;    //��¼һ�����ֵ����г����ĺ�
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {    //���j��i�ĳ�������j�ӵ�sum��
                    sum += j;
                }
            }
            if (sum == i) {      //�ж�i�Ƿ��������г���֮��
                System.out.println(i);
            }
        }
    }

}

