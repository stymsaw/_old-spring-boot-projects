package stymsaw.spring.p1.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        var name = context.getBean("name");
        System.out.println(name);

        var person = context.getBean("person");
        System.out.println(person);

        var address = context.getBean(Address.class);
        System.out.println(address);


    }
}
