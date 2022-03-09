package lesson6;

public class Main {
    public static void main(String[] args) {
        Knight knight1 = new Knight("Роман",1000,"Рыцарь", " Экскалибур");
        Knight knight2 = new Knight("Андрей",900,"Рыцарь");
        Wizard wizard = new Wizard("Александр", 800,"Волшебник");
//        Player player = new Player();

        Player[]players = {knight1, knight2, wizard};
        for(Player player : players){
            player.printInfo();
            player.action();
            System.out.println("......\n");
        }


        /*knight1.printInfo();
        knight2.printInfo();
        wizard.printInfo();

        knight1.action();
        knight2.action();
        wizard.action();*/
    }
}