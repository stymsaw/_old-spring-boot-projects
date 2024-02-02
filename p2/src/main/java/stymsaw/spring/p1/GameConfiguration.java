package stymsaw.spring.p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import stymsaw.spring.p1.game.GameRunner;
import stymsaw.spring.p1.game.GamingConsole;
import stymsaw.spring.p1.game.MarioGame;

@Configuration
public class GameConfiguration {


    @Bean
    public GamingConsole game() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole gamingConsole) {
        return new GameRunner(gamingConsole);
    }



//    var marioGame = new MarioGame();
//    var superContraGame = new SuperContraGame();
//
//    var gameRunner = new GameRunner(superContraGame);
//        gameRunner.run();

}
