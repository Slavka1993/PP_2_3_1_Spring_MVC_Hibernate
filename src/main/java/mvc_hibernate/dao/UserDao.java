package mvc_hibernate.dao;

import mvc_hibernate.model.User;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface UserDao {

    public void saveUser(User user);

    public List<User> getAllUsers();

    public User getUserById(Long id);

    public void updateUser(User user);

    public void deleteUser(Long id);
}


