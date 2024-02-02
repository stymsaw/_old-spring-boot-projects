package stymsaw.spring.p1.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Go More Deep");
    }

    public void left(){
        System.out.println("Go Back");
    }

    public void right(){
        System.out.println("Move Forward");
    }


}
