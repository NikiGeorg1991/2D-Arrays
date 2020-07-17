public class Task5 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int maxSumRow = Integer.MIN_VALUE;
        int maxSumCol = Integer.MIN_VALUE;
        for (int col = 0; col < array.length; col++) {
            int sumRow = 0;
            for (int row = 0; row < array[col].length; row++) {
                sumRow = sumRow + array[col][row];
                if (maxSumRow < sumRow) {
                    maxSumRow = sumRow;
                }
            }
        }
        System.out.println("max sum row = " + maxSumRow);
        for (int row = 0; row < array.length; row++) {
            int sumCol = 0;
            for (int col = 0; col < array[row].length; col++) {
                sumCol = sumCol + array[col][row];
                if (maxSumCol < sumCol) {
                    maxSumCol = sumCol;
                }
            }
        }
        System.out.println("max sum col = " + maxSumCol);
        if (maxSumCol > maxSumRow) {
            System.out.println("Sum is equals");
        }
        if (maxSumCol > maxSumRow) {
            System.out.println("Max sum in Col is > max sum in Row");
        }
        if (maxSumCol < maxSumRow) {
            System.out.println("Max sum in Row is > max sum in Col");
        }
    }
}

