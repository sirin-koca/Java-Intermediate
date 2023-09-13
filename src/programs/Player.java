package programs;

class MainDifficulty {

    public static void main(String[] args) {

        Player player1 = new Player(Difficulty.EASY);
        Player player2 = new Player(Difficulty.MEDIUM);
        Player player3 = new Player(Difficulty.HARD);
    }
}
enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}

public class Player{
    Player(Difficulty diff){ // constructor with switch-statement

        Difficulty level = diff;

        switch (level) {
            case EASY -> System.out.println("You have 3000 bullets");
            case MEDIUM -> System.out.println("You have 2000 bullets");
            case HARD -> System.out.println("You have 1000 bullets");
        }
    }
}

/*
        switch(level){
            case EASY:
                System.out.println("You have 3000 bullets");
                break;
            case MEDIUM:
                System.out.println("You have 2000 bullets");
                break;
            case HARD:
                System.out.println("You have 1000 bullets");
                break;
 */