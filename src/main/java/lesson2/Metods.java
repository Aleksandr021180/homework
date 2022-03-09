package lesson2;

public class Metods {

    public static void main(String[]args){
//        sumVarsAndPrint(3,5);
//        sumVarsAndPrint(-1,-5);
//        sumVarsAndPrint(0,4);

        printNumsAndResult(3,4);
    }

    private static void sumVarsAndPrint(int a, int b) {

        /*int a = 3;
        int b = 5;*/
        int result = a + b;
        System.out.print("Сумма чисел:" + result + "\n");

    }
    static void printNumsAndResult(int a, int b){
        int result = sumVarsAnrReturn(a, b);
//        System.out.printf("%d +%d = %d%n", a, b, result);
        System.out.println(a + "+" + b + "=" + result);

    }

    private static int sumVarsAnrReturn(int a, int b) {
        int result = a + b;
        return result;
    }
}
