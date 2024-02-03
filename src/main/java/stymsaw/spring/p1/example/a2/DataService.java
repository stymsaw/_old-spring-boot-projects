package stymsaw.spring.p1.example.a2;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();
}
