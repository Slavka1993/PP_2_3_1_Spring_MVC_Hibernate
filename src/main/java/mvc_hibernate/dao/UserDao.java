package mvc_hibernate.dao;

import mvc_hibernate.model.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface UserDao {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}