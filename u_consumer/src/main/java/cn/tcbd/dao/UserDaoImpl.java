package cn.tcbd.dao;

import cn.tcbd.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private RestTemplate restTemplate;

    String url = "http://localhost:8080/listUser";

    @Override
    public List<User> queryAllUser() {
        User[] users = restTemplate.getForObject(url, User[].class);
        return Arrays.asList(users);
    }
}
