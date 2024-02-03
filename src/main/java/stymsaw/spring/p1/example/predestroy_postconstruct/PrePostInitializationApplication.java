package stymsaw.spring.p1.example.predestroy_postconstruct;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {

    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }

    @PostConstruct
    public void initialization() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("some cleanup is executed");
    }

}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("some initialization from some dependency");
    }
}

@Configuration
@ComponentScan
public class PrePostInitializationApplication {


    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(PrePostInitializationApplication.class)) {


            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }


    }
}
