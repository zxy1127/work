package etest33;

public class etest33 {
    public static void main(String[] args) {
        System.out.println("10000以内的完全数有：");
        for (int i = 1; i < 10000; i++) {    //对10000以内的数进行排查
            int sum = 0;    //记录一个数字的所有除数的和
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {    //如果j是i的除数，将j加到sum里
                    sum += j;
                }
            }
            if (sum == i) {      //判断i是否是其所有除数之和
                System.out.println(i);
            }
        }
    }

}

