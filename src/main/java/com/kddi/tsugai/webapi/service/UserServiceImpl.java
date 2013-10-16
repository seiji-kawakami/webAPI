package com.kddi.tsugai.webapi.service;

import com.kddi.tsugai.webapi.domain.User;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 9:20
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User get(String id){
        User user = new User();
        user.setId("seiji-k");
        user.setName("Seiji Kawakami");
        user.setPropertyMap("phone", "080-5066-9380");
        user.setPropertyMap("mailAddress", "seiji-k@kddi.com");
        user.setPropertyMap("password","password");
        user.setProperties();
        return user;
    }

    @Override
    public void insert(User user){

    }

    @Override
    public void update(String id){

    }

    @Override
    public void delete(String id){

    }
}
