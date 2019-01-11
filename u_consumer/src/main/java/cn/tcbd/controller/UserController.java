package cn.tcbd.controller;

import cn.tcbd.entity.User;
import cn.tcbd.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller

public class UserController {

    @Resource
    private UserService service;


    @RequestMapping("listUser")
    public String listUser(Model model) {
        List<User> list = service.queryAllUser();
        model.addAttribute("list", list);
        return "listUsers";
    }

}
