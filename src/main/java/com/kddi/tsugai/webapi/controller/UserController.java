package com.kddi.tsugai.webapi.controller;

import com.kddi.tsugai.webapi.dao.*;
import com.kddi.tsugai.webapi.domain.User;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.annotate.JsonValue;
import org.codehaus.jackson.map.ObjectMapper;
import org.postgresql.util.PGobject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.kddi.tsugai.webapi.service.UserService;
import sun.org.mozilla.javascript.internal.json.JsonParser;

import java.io.File;
import java.io.InputStream;
import java.util.Map;

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

    @RequestMapping(value="/user/fix",method = RequestMethod.POST)
    @ResponseBody
    public void insert(){
        User user = new User();
        userService.insert(user);
    }

    @RequestMapping(value="/user",method = RequestMethod.POST)
    @ResponseBody
    public UserRequest insert(@RequestBody final UserRequest userRequest){
        return userRequest;
    }

    @RequestMapping(value="/servicebean",method = RequestMethod.POST)
    @ResponseBody
    public ServiceBean insert(@RequestBody final ServiceBean serviceBean){
        return serviceBean;
    }

    @RequestMapping(value="/{corpId}/{userId}",method =RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable ("corpId") String corpId,@PathVariable ("userId") String userId){
        return userService.delete(corpId,userId);
    }

    @RequestMapping(value="/sample",method = RequestMethod.POST)
    @ResponseBody
    public Result math(@RequestBody final Request request) {
        final Result result = new Result();
        result.setAddition(request.getLeft() + request.getRight());
        result.setSubtraction(request.getLeft() - request.getRight());
        result.setMultiplication(request.getLeft() * request.getRight());
        return result;
    }


}
