package itest6;

import java.util.Arrays;

public class itest6 {
    private long startTime;
    private long endTime;

    public itest6() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        itest6 time = new itest6();
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random() * 1000000);
        }
        time.start();
        Arrays.sort(array);
        time.stop();
        System.out.println("elapsedTimeMill: " + time.getElapsedTime());
    }
}