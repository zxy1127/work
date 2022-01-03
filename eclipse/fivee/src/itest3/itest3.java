package itest3;

public class itest3 {
    public static void main(String[] args) {
        long seconds = 10000;
        for (int i = 0; i < 8; i++) {
            java.util.Date date = new java.util.Date(seconds);
            System.out.println(date.toString());
            seconds *= 10;
        }
    }

}