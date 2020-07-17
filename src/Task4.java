import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int[][] masivche = new int[array.length][array.length
                ];

        for (int i = 0; i < masivche.length; i++) {
            for (int j = 0; j < masivche[i].length; j++) {
                masivche[j][masivche.length-1-i] = array[i][j];
            }
        }

        for (int i = 0; i < masivche.length; i++) {
            for (int j = 0; j < masivche[i].length; j++) {
                System.out.print(masivche[i][j] + " ");
            }
            System.out.println();
        }
    }
}
