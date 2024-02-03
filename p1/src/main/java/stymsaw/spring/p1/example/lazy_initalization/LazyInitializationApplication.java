package stymsaw.spring.p1.example.lazy_initalization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class MainClass {

}

@Component
class SomeClass {
    MainClass mainClass;

    public SomeClass(MainClass mainClass) {
        System.out.println("qwerty");
        this.mainClass = mainClass;
    }


}

@Configuration
@ComponentScan
public class LazyInitializationApplication {
    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(LazyInitializationApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }


    }
}
