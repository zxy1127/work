package etest19;

public class etest19 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) { //�������������i�����к�
            for (int j = 0; j < 7 - i; j++)    //��i�������7-i���ո�
                System.out.print("    "); //�ĸ��ո񣬷����ʽ��
            for (int j = 0; j < i + 1; j++)     //��i�������i+1������
                System.out.printf("%4d" , (int)Math.pow(2,j));  //���������2��j�η�
            for (int j = i; j > 0; j--) //��i���Ҳ���i�����֣���i=0��ʱ�򣬱�ѭ����ִ��
                System.out.printf("%4d" , (int)Math.pow(2,j-1));//�Ҳ�������2��j-1�η�
            //��������ѭ����j�������������������
            System.out.println();
        }
    }
}

