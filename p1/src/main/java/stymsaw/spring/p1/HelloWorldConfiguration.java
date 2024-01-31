package stymsaw.spring.p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age) {
}
record Address(String gali, String mohalla) {
}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "stymsaw";
    }


    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public Person person() {
        return new Person("stymsaw", 24);
    }

    @Bean
    public Address address() {
        return new Address("baghamra", "bazar");
    }


}
