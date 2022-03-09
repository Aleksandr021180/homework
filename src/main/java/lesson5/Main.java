package lesson5;

public class Main {
    public static void main(String[]args){

        Player player1 = new Player("Виктор", 88, 1500, 3256);
        Player player2 = new Player("Дмитрий");
        Player player3 = new Player("Влад", 67, 750, 7600);

/*player1.nickname = "Виктор";
player2.nickname = "Дмитрий";*/

        /*player1.level = 10;
        player2.level = 80;*/
player1.setMoney(1000000000);
player3.setMoney(player3.getMoney() * 300);
/*System.out.println("Игрок 1: " + player1.nickname +
" " + player1.level);
System.out.println("Игрок 2: " + player2.nickname +
" " + player2.level);*/

        /*player1.printInfo();
        player2.printInfo();
        player3.printInfo();*/

        Player[] players = {player1, player2, player3};
        for (Player player : players){ //прогоняем через цикл
           /*for(int i = 0; i < player.length; i ++); а можно вот так, тоже самое что сверху
            Player player = player(i);*/
            if(player.getPoints() > 300){//если количество очков у данного игрока больше чем 300
                player.printInfo();//то в этом случае ввыдим инфу по данному игроку на икран
            }else {//а иначе
                System.out.println("У игрока " + player.getNickname() + " недостаточно очков");


            }

        }
        System.out.println("Общее количество игроков: " + Player.getPlayersCount());

    }

}

