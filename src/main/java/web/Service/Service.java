package web.Service;

import org.springframework.stereotype.Component;
import web.Models.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Service {
    private List<Cars> list = new ArrayList<>();

    public Service() {
        list.add(new Cars(1, "Tesla", "blue"));
        list.add(new Cars(2, "BMW", "yellow"));
        list.add(new Cars(3, "Lada", "white"));
        list.add(new Cars(4, "Mercedes", "red"));
        list.add(new Cars(5, "Ford", "green"));
    }

    public List<Cars> getCars(int count) {
        return list.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}