package stymsaw.spring.p1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        var name = context.getBean("name");
        System.out.println(name);


    }
}
