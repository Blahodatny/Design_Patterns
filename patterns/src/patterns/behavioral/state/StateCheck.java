package patterns.behavioral.state;

public class StateCheck {
    public static void check() {
        Season season = new Season();
        System.out.println("Initial state is Winter!!!");
        season.showSeason();
        System.out.println("Another season is coming!!!");
        season.setCurrentTree(Season.Name.SPRING);
        System.out.println("Showing season!!!");
        season.showSeason();
        season.setCurrentTree(Season.Name.AUTUMN);
        season.showSeason();
    }
}