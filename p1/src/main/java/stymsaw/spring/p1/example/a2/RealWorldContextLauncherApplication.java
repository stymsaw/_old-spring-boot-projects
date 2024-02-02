package stymsaw.spring.p1.example.a2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class RealWorldContextLauncherApplication {




    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(RealWorldContextLauncherApplication.class)) {


            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            var array = context.getBean(BusinessCalculationService.class).findMax();

            System.out.println(array);

        }


    }
}
