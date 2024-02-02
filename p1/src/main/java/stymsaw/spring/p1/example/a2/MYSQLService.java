package stymsaw.spring.p1.example.a2;

import org.springframework.stereotype.Component;

@Component
public class MYSQLService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
