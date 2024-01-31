package stymsaw.spring.p1;

import stymsaw.spring.p1.game.GameRunner;
import stymsaw.spring.p1.game.MarioGame;
import stymsaw.spring.p1.game.SuperContraGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {


        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();

        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();


    }
}
