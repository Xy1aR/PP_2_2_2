package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> listCars() {
        List<Car> resultList = new ArrayList<>();

        resultList.add(new Car("VW", "Polo", 2023));
        resultList.add(new Car("VAZ", "2101", 1979));
        resultList.add(new Car("BMW", "M3", 2022));
        resultList.add(new Car("M-B", "X-Class", 2018));
        resultList.add(new Car("AUDI", "TT", 2018));

        return resultList;
    }
}
