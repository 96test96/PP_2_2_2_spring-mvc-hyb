package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
public class CarServiceImp implements CarService {
    private static List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("lada","blue",123));
        carList.add(new Car("bmw","red",321));
        carList.add(new Car("audi","green",432));
        carList.add(new Car("renault","white",534));
        carList.add(new Car("mazda","black",535));
    }

    public List<Car> getCarList(int count) {
        if (count <= 0) {
            return Collections.emptyList();
        } else if (count < carList.size()) {
            return carList.subList(0, count);
        } else {
            return List.copyOf(carList);
        }
    }
}