package Lesson_Kniga;

public class Constants {
//    константы для подсчета очков
    static final int TOUCHDOWN = 6;
    static final int CONVERSION = 1;
    static final int FIELDGOAL = 3;

    public static void main(String[]args){
        int td;
        int pat;
        int fg;
        int total;
        /*td=4*TOUCHDOWN; 4*6=24
        pat=3*CONVERSION; 3*1=3
        fg=2*FIELDGOAL; 2*3=6
        total=(td+pat+fg); 24+3+6=33
         */
        td=4*TOUCHDOWN;
        pat=3*CONVERSION;
        fg=2*FIELDGOAL;
        total=(td+pat+fg);
//        вывод очков на экран
        System.out.println("Очков всего:"+total);

    }

}
