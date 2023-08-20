package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> listCars(List<Car> carsList, Integer counter) {
        if (counter == null || counter > carsList.size()) {
            return carsList;
        }
        return carsList.subList(0, counter);
    }
}
