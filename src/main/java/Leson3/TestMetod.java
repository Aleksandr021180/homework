package Leson3;

public class TestMetod {

    public static void main(String[] args) {
        multuply(3,4);
        multuply (3.3,4.6);

    }

    private static void multuply(int i, int i1) {
        int multuply = i * i1;
        System.out.println("Произведение %d и %d равно %d(целые)%n,a,b,multiply");
    }
    private static void multuply(double i, double i1) {
        double multuply = i * i1;
        System.out.println("Произведение %f и %f равно %f(дробные)%n,a,b,multiply");
    }
    private static void multuply(int i) {
        int multuply = i * i;
        System.out.println("Квадрат числа %d равен %d%n,a,multiply");
    }

}
