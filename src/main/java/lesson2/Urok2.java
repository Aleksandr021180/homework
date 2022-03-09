package lesson2;

public class Urok2 {

    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test1() {
        int c = 0;
//        c+=1;
        System.out.println(c++);
//        сначала берем переменную sout(0) ++(увеличили на еденицу), получилось c=1
        System.out.println(++c);
//        сначала увеличиваем на еденицу ++,получается sout(2), с=2
        System.out.println(c--);
//        сначала берем переменную sout(2),потом уменьшаем на еденицу (--), с=1
        System.out.println(--c);
//        сначала уменьшаем на еденицу (--), получается sout(0), c=0
        System.out.println(c + 1);
//        здесь все просто берем с которая равна 0 и пребавляем 1, sout(0+1)
        System.out.println(c);
    }


    private static void test2() {
        int a = 5;
        int b = 5;
        int resultOne = 2 * ++a;
//            2*(сперва увеличиваем на еденицу переменную а, а=5+1=6)6=12
        int resultTwo = 2 * b++;
//            2* на переменную b а потом уже увеличиваем на еденицу, т.е. 2*5+1=11

        System.out.println(resultOne);
        System.out.println(resultTwo);
        System.out.println(a + " " +b);

    }
    private static void test3(){
        int c = 1;
        System.out.println(c++ +c);
//        1+2=3, c=2
        System.out.println(++c +c);
//        3+3=6, c=3
        System.out.println(c + c++);
//        3+3=6, c=4
        c += ++c + c;
//        4+5+5=14
        System.out.println(c);
    }
}



