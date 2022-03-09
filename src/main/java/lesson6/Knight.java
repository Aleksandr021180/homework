package lesson6;

public class Knight extends Player{

    private String swordTitle;

    public Knight(String nickname, int points, String russianProfessianTitle, String swordTitle) {
        super(nickname, points, russianProfessianTitle);
        this.swordTitle = swordTitle;
    }

    public Knight(String nickname, int points, String russianProfessianTitle) {
        this(nickname, points, russianProfessianTitle, " Меч Кладинец");
    }


    public String getSwordTitle() {
        return swordTitle;
    }

    public void setSwordTitle(String swordTitle) {
        this.swordTitle = swordTitle;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" и имеет оружие %s", swordTitle);
    }

    @Override
    public void action() {
        System.out.println(getRussianProfessionTitle() + " " + "машет оружием" + getSwordTitle());
    }
}

