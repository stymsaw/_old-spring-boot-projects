package stymsaw.spring.p1.example.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{12, 2, 36, 98, 4, 5};
    }
}
