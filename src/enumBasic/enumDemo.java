package src.enumBasic;

// we can put an enum here to use it as an option signal.
enum Season {
    SPRING, SUMMER, FALL, WINTER
}
// for this enum, after decompile...
//public final class Season extends java.lang.Enum<Season> {
//    public static final Season SPRING = new Season();
//    public static final Season SUMMER = new Season();
//    public static final Season FALL = new Season();
//    public static final Season WINTER = new Season();
//    public static Season[] values();
//    public static Season valueOf(java.lang.String);
//}

// We can see they all final, and there is no constructor,
public class enumDemo {
    public static void main(String[] args) {

        printSeasonInfo(Season.FALL);
        printSeasonInfo(Season.SPRING);
        printSeasonInfo(Season.SUMMER);
        printSeasonInfo(Season.WINTER);

    }

    public static void printSeasonInfo(Season season) {
        switch (season) {
            case FALL -> System.out.println("Fall is beautiful!");
            case SPRING -> System.out.println("Spring is relax!");
            case SUMMER -> System.out.println("Summer is warm!");
            case WINTER -> System.out.println("Winter is chill!");
        }
    }
}