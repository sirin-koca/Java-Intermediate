package programs;

public class TroopGreetings {
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }

    public static void main(String[] args) {
        Rank a = Rank.SOLDIER;

        switch (a) {
            case SOLDIER:
                System.out.println("Soldier says aye aye captain!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello captain!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Captain's coming!");
                break;
        }
    }
}