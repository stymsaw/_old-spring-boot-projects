package stymsaw.spring.p1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import stymsaw.spring.p1.game.GameRunner;
import stymsaw.spring.p1.game.GamingConsole;
import stymsaw.spring.p1.game.MarioGame;
import stymsaw.spring.p1.game.PacmanGame;


@Configuration
@ComponentScan("stymsaw.spring.p1.game")
public class App02GamingSpringBeans {



    @Bean
    public GameRunner gameRunner(GamingConsole gamingConsole) {
        return new GameRunner(gamingConsole);
    }

    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(App02GamingSpringBeans.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();


        }


    }
}
