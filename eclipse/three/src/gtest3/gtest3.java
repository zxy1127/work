package gtest3;

import java.util.Scanner;

public class gtest3 {
    public static void main(String[] args) {
        int[] count = new int[102]; //计数数组
        //初始化计数数组
        for (int i = 0; i < count.length; i++)
            count[i] = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100:");
        //输入数据并计数
        while (true){
            int number = input.nextInt();
            if (number == 0){
                break;
            }
            count[number]++;
        }

        //遍历计数数组进行打印
        for (int i = 0; i < count.length; i++){
            if (count[i] == 1){
                System.out.println(i + " occurs " + count[i] + " time");
            }else if(count[i] > 1){
                System.out.println(i + " occurs " + count[i] + " times");
            }
        }


    }
}

