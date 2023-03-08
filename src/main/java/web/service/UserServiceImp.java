package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.models.User;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserServiceImp implements UserService {
    private UserDao userDao;
    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void add(User user) { userDao.add(user); }

    @Override
    @Transactional
    public List<User> listUsers() {
      return userDao.listUsers();
    }

    @Override
    @Transactional
    public User getUserId(long id) {
        return userDao.getUserId(id);
    }

    @Override
    @Transactional
    public void removeUserId(long id) {
        userDao.removeUserId(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

}