package htest4;

public class htest4 {
    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};
        int[] hoursOfEmplpyee = new int[8];
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                hoursOfEmplpyee[i] += hours[i][j];
            }
        }

        String[] numberOfEmplyee = {"Employee1", "Employee2", "Employee3", "Employee4", "Employee5", "Employee6", "Employee7", "Employee8"};
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if (hoursOfEmplpyee[j] < hoursOfEmplpyee[i]) {
                    int temp = hoursOfEmplpyee[j];
                    hoursOfEmplpyee[j] = hoursOfEmplpyee[i];
                    hoursOfEmplpyee[i] = temp;

                    String temp1 = numberOfEmplyee[j];
                    numberOfEmplyee[j] = numberOfEmplyee[i];
                    numberOfEmplyee[i] = temp1;
                }
            }
        }

        for (int i = 0; i < hours.length; i++) {
            System.out.println(numberOfEmplyee[i] + ": " + hoursOfEmplpyee[i]);
        }
    }
}

