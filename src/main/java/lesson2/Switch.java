package lesson2;

public class Switch {
    public static void main(String[]args){
        final int SEASON_NAMBER = 3;

        convertSeason(SEASON_NAMBER);
        convertSeasonSwitch(SEASON_NAMBER);

    }


    private static void convertSeason(int seasonNamber) {
        String season;
        if (seasonNamber == 1) {
            season = "Winter";
        } else if (seasonNamber == 2) {
            season = "Spring";
        } else if (seasonNamber == 3) {
            season = "Summer";
        } else if (seasonNamber == 4) {
            season = "Fall";
        } else {
            season = "Unknown season";
        }
        System.out.println(season);
    }

    private static void convertSeasonSwitch(int seasonNamber) {

        String season;

        switch (seasonNamber) {
            case 1:
                season = "Winter";
                break;

            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Sammer";
                break;
            case 4:
                season = "Fall";
                break;
            default:
                season = "Unknown season";
        }
        System.out.println(season);

    }

}
