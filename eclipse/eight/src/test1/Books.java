package test1;

/**
 * Books(ͼ����)
 * ���ڴ��ͼ�������
 */
class Books {
    /**
     * num ���
     * name ����
     * price �۸�
     * press ������
     */
    private int num;
    private String name;
    private double price;
    private String press;

    public Books() {

    }

    Books(int num, String name, double price, String press) {
        super();
        this.num = num;
        this.name = name;
        this.price = price;
        this.press = press;
    }

    int getNum() {
        return num;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    String getPress() {
        return press;
    }


}



