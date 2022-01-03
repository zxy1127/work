package test1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //new����Books����
        Books books1 = new Books(1001, "Java", 888.0, "Sun������");
        Books books2 = new Books(1002, "Python", 257.0, "Python������");
        Books books3 = new Books(1003, "C++", 155.0, "C++������");

        //Ȼ��Ž�HashMap��,Key��ͼ��ı��,value��ͼ�����
        HashMap<Integer, Books> booksHashMap = new HashMap<>();
        booksHashMap.put(books1.getNum(), books1);
        booksHashMap.put(books2.getNum(), books2);
        booksHashMap.put(books3.getNum(), books3);

        /**
         * Ҳ���Բ��ô���Books��,ֱ����HashMap���ϴ洢ͼ�������
         * Ȼ��Ž�list������,������Ϊ���� ͼ������Ϊkey
         */
        List<HashMap<Integer, Books>> booksList = new ArrayList<>();
        booksList.add(booksHashMap);
        
        System.out.println("���\t����\t����\t������");
        for (HashMap<Integer, Books> h : booksList) {
            //��ȡkey
            Set<Integer> key = h.keySet();
            for (Integer i : key) {
                //��ͨ��key��value
                System.out.println(i
                        + "\t" + h.get(i).getName()
                        + "\t" + h.get(i).getPrice()
                        + "\t" + h.get(i).getPress());
            }
        }
    }
}