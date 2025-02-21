package mvc_hibernate.dao;

import mvc_hibernate.model.User;

import java.util.List;


public interface UserDao {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}