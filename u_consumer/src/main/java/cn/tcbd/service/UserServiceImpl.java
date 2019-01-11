package cn.tcbd.service;

import cn.tcbd.dao.UserDao;
import cn.tcbd.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao dao;

    @Override
    public List<User> queryAllUser() {
        return dao.queryAllUser();
    }

}
