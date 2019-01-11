package cn.tcbd.service;

import cn.tcbd.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Resource
    private UserService service;

    @Test
    public void queryAllUser() {

        List<User> list = service.queryAllUser();
        if (list != null) {
            for (User user : list) {
                System.out.println(user);
            }
        }

    }
}