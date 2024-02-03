package stymsaw.spring.p1.example.a2;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService  {

    private final DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
       return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
