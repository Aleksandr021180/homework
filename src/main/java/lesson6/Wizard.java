package lesson6;

public class Wizard extends Player{

    public Wizard(String nickname, int points, String russianProfessianTitle) {
        super(nickname, points, russianProfessianTitle);
    }

    @Override
    public void action() {
        System.out.println(getNickname() + " кастует заклинание");

    }
}
