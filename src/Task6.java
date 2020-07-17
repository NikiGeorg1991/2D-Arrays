public class Task6 {
    public static void main(String[] args) {

        int[][] array = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66},
        };
        int totalSum = 0;
        for (int i = 1; i < array.length; i += 2) {
            int sumRow = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 1) {
                    int sum = 0;
                    sumRow = sumRow + array[i][j];
                    sum = sum + array[i][j];
                    totalSum = totalSum + sum;
                }
            }
            System.out.print("red " + (i + 1) + " e sys suma = " + sumRow);
            System.out.println();
        }
        System.out.println("total sum : " + totalSum);
    }
}

