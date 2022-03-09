package lesson6;

public abstract class Player extends Object{
    private String nickname;
    private int points;
    private String russianProfessionTitle;

    /*public Player() {
    }*/

    public Player(String nickname, int points, String russianProfessianTitle) {
        this.nickname = nickname;
        this.points = points;
        this.russianProfessionTitle = russianProfessianTitle;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getRussianProfessionTitle() {
        return russianProfessionTitle;
    }

    public void setRussianProfessionTitle(String russianProfessianTitle) {
        this.russianProfessionTitle = russianProfessianTitle;
    }
    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("%s %s заработал %s очков", russianProfessionTitle, nickname, points);
    }
    public abstract void action();

    }



