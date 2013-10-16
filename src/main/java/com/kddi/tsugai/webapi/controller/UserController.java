package com.kddi.tsugai.webapi.controller;

import com.kddi.tsugai.webapi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.kddi.tsugai.webapi.service.UserService;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 9:24
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/api")
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
        public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(value="/{corpId}/{userId}",method = RequestMethod.GET)
    @ResponseBody
    public User get(@PathVariable ("corpId") String corpId,@PathVariable ("userId") String userId){
        return userService.get(corpId,userId);

    }


}
