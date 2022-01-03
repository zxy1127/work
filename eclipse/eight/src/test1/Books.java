package test1;

/**
 * Books(图书类)
 * 用于存放图书的属性
 */
class Books {
    /**
     * num 编号
     * name 名称
     * price 价格
     * press 出版社
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



