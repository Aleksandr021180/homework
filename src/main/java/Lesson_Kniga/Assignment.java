package Lesson_Kniga;

public class Assignment {
    public static void main(String[]args){
        String txt="Fantastic";
        String lang="Java";
        txt += lang;  //присваивание с объеденением строк
        System.out.println("Складываем и присваиваем строки: "+txt);
        int sum=10;
        int num=20;
        sum +=num;  // присваиваем результат(10+20=30)
        System.out.println("Сладываем и присваиваем целые числа: "+sum);
        int factor=5;
        sum *=factor;  //присваиваем результат(5*30=150)
        System.out.println("Результат умножения: "+sum);
        sum/=factor; //присваиваем результат (150/5=30)
        System.out.println("Резултат деления: "+sum);
    }
}
