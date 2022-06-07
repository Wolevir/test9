package web.service;

import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
