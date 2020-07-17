public class Task3 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 4, 6, 3},
                {5, 9, 7, 2},
                {4, 8, 1, 9},
                {2, 3, 4, 5},
        };
        int sum = 0;
        int sredno = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum= sum + array[i][j];
            }
            sredno=sum/(array.length * array[i].length);
        }
        System.out.println("total : " + sum);
        System.out.println("sredno aritm. : " + sredno);
    }
}
