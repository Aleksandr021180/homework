package Leson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestRendoms {
    public static void main(String[] args) {
        testRendoms();
        TestConsoleInput();
    }

    private static void TestConsoleInput() {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

    }

    private static void testRendoms() {
        int[]data = new int[40];
        Random random = new Random();

        for (int i = 0; i < data.length; i++){
//            data[i]=random.nextInt();      -2147 -+2147кк
//            data[i]=random.nextInt(10);    0-9
//            data[i]=random.nextInt(8) +3;  3-10


        }
        System.out.println(Arrays.toString(data));
    }
}
