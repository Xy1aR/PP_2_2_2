package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> listCars(Integer counter) {
        List<Car> carsList = carDao.listCars();

        if (counter == null || counter > carsList.size()) {
            return carsList;
        }

        return carsList.stream().limit(counter).collect(Collectors.toList());
    }
}
