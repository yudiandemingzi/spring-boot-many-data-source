package com.binron.multidatasource.controller;

import com.binron.multidatasource.pojo.User;
import com.binron.multidatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 *
 * 用户控制层
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
    private UserService userService;
 
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean insert(Long id,String name,Integer age) {
    	System.out.println("开始新增...");
        User user =new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        return userService.insert(user);
    }
    

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public List<User> findByUser(Long id) {
    	System.out.println("开始查询...");
        User user =new User();
        user.setId(id);
        return userService.findByListEntity(user);
    }

}
