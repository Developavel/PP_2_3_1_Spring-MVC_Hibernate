package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<User> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new User("Nissan", "Skyline r34", 2000));
        cars.add(new User("Toyota", "Supra a80", 1999));
        cars.add(new User("Honda", "NSX r", 1998));
        cars.add(new User("Mitsubishi", "Lancer Evolution VI", 2001));
        cars.add(new User("Toyota", "Land Cruiser 80", 1993));
    }

    @Override
    public List<User> getAllCars() {
        return new ArrayList<>(cars);
    }

    @Override
    public List<User> getCars(int count) {
        if (count <= 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(cars.subList(0, Math.min(count, cars.size())));
    }
}
