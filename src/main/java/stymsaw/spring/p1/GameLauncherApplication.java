package stymsaw.spring.p1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import stymsaw.spring.p1.game.GameRunner;
import stymsaw.spring.p1.game.GamingConsole;


@Configuration
@ComponentScan("stymsaw.spring.p1.game")
public class GameLauncherApplication {




    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(GameLauncherApplication.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();


        }


    }
}
