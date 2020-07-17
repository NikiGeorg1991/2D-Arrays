public class Task7 {
    public static void main(String[] args) {

        int[][] array = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66},
        };
        int sumTotal = 0;
        int col =0;

        for (int row = 0; row < array.length; row++) {
            int sumRow=0;
            if ((row == 2 )||(row== 0 )||(row == 4 )) {
                sumRow = sumRow + array[row][col] + array[row][col+2] + array[row][col+4];
                sumTotal=sumTotal+sumRow;
                System.out.println(array[row][col] + " , " + array[row][col+2]  + " , " + array[row][col+4] + " sumata na red " + row + " = " + sumRow);
            }
            else {
                sumRow = sumRow + array[row][col+1] + array[row][col+3] + array[row][col+5];
                sumTotal=sumTotal+sumRow;
                System.out.println(array[row][col+1] +" , " +  array[row][col+3] +" , " +  array[row][col+5] + " sumata na red " + row + " = " + sumRow);
            }
        }
        System.out.println("sumata na wsichki elementi : " + sumTotal);
    }
}
