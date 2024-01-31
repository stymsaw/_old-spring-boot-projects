package stymsaw.spring.project1.game;

public class GameRunner {

    MarioGame marioGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    public void run() {
        System.out.println("Game is running" + marioGame);
    }
}
