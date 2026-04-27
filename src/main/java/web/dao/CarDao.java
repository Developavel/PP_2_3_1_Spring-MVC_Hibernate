package web.dao;

import web.model.User;
import java.util.List;

public interface CarDao {
    List<User> getAllCars();
    List<User> getCars(int count);
}
