package stymsaw.spring.p1.example.cdi;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Named
class BusinessService {
    private DataService dataService;


    public DataService getDataService() {
        return dataService;
    }

    @Inject
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }
}

@Named
class DataService {

}

@Configuration
@ComponentScan
public class CDILauncherApplication {


    public static void main(String[] args) {


        try (var context = new AnnotationConfigApplicationContext(CDILauncherApplication.class)) {


            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        }


    }
}
