package itest5;


import java.util.GregorianCalendar;

public class itest5 {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + "/" + gregorianCalendar.get(GregorianCalendar.MONTH) + "/" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        gregorianCalendar.setTimeInMillis(1234567898765L);
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + "/" + gregorianCalendar.get(GregorianCalendar.MONTH) + "/" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));

    }

}