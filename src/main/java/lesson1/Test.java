package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {
//        testVars();
//        testAppraisal;
//        checkAppraisal();
        testCheckAppraisal();

    }

    private static void testVars() {
        int varA = 9;
        int varB = 5;
        int result = varA / varB;
        System.out.println(varA / varB);
    }

    private static void checkAppraisal() {

        int appraisal = ThreadLocalRandom.current().nextInt(8) - 2;
        System.out.println("Студент принес оценку:" + appraisal);

        if (appraisal == 5) {
            System.out.println("Молодец, так держать!");
        } else if (appraisal == 4) {
            System.out.println("Хорошо, но можешь лучше!");
        } else if (appraisal >= 1 && appraisal <= 3) {
            System.out.println("Учи уроки лучше!");
        } else /*if (appraisal > 5 || appraisal < 1)*/ {
            System.out.println("Не мухлюй! Говори правду!");
        }

        System.out.println("Проверка окончена");

    }

    private static void testCheckAppraisal() {
        checkAppraisalWithArg(1);
        checkAppraisalWithArg(2);
        checkAppraisalWithArg(3);
        checkAppraisalWithArg(4);
        checkAppraisalWithArg(5);
        checkAppraisalWithArg(-1);
        checkAppraisalWithArg(6);
    }

    private static void checkAppraisalWithArg(int appraisal) {
        System.out.println("Студент принес оценку:" + appraisal);

        if (appraisal == 5) {
            System.out.println("Молодец, так держать!");
        } else if (appraisal == 4) {
            System.out.println("Хорошо, но можешь лучше!");
        } else if (appraisal >= 1 && appraisal <= 3) {
            System.out.println("Учи уроки лучше!");
        } else /*if(appraisal > 5 || appraisal < 1)*/ {
            System.out.println("Не мухлюй! Говори правду!");
        }

        System.out.println("Проверка окончена");
    }


}

