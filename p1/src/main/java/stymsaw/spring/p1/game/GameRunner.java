package stymsaw.spring.p1.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    GamingConsole game;

    public GameRunner(GamingConsole marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Game is running: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
