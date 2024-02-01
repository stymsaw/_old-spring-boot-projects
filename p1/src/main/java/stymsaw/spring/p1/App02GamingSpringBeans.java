package stymsaw.spring.p1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stymsaw.spring.p1.game.GameRunner;
import stymsaw.spring.p1.game.GamingConsole;
import stymsaw.spring.p1.game.MarioGame;
import stymsaw.spring.p1.game.SuperContraGame;

public class App02GamingSpringBeans {

    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(GameConfiguration.class)) {

            context.getBean(GamingConsole.class).up();


        }


    }
}
