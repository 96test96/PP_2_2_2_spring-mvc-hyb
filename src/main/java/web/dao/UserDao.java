package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> listUsers();
    User getUserId(long id);
    void removeUserId(long id);
    void  updateUser(User user);
}