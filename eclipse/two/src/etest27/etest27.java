package etest27;

public class etest27 {
    public static void main(String[] args) {
        int count = 0;  //记录闰年的总数
        for (int i = 101; i < 2101; i++) {
            if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
                count++;
                if (count % 10 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println("The number is :" + count);
    }
}

