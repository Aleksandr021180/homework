package Leson3;

import java.sql.Array;
import java.util.Arrays;

public class Massiv {

    static final int ARRAY_SIZE = 7;

    public static void main(String[] args) {
        TestOneArrey();
        TestTwoArray();
    }

    private static void TestTwoArray() {
//        int[][]deepData = {{1,2,3},{1,2,3,4,5}}; можно вот так
        int[][] deepData = new int[ARRAY_SIZE][ARRAY_SIZE];

        /*deepData[0][0] =1;
        deepData[0][1] =1;
        deepData[0][2] =1;
        deepData[0][3] =1;
        deepData[0][4] =1;*/
        int n = 1;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData.length; j++) {
                deepData[i][j] = n++;
            }
        }


    }

    private static void TestOneArrey() {
        int[] data = new int[ARRAY_SIZE];
        int[] data2 = {1, 2, 3, 4, 5, 6};
        Arrays.fill(data, -1);

        data[0] = 3;
        data[1] = 4;
        data[2] = 3;
        data[3] = 6;
        data[4] = 8;
        data[5] = 7;
        data[6] = 7;
        data[data.length - 1] = 1;

        /*System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);*/

//        Arrays.sort(data); Можно сортировать

        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
    }
}


