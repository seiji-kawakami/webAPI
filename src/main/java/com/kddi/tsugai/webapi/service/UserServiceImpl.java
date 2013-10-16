package com.kddi.tsugai.webapi.service;

import com.kddi.tsugai.webapi.dao.JdbcUserDao;
import com.kddi.tsugai.webapi.domain.User;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 9:20
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService {
    JdbcUserDao jdbcUserDao = new JdbcUserDao();

    @Override
    public User get(String corpId,String userId){
        User user = new User();
        try {
            jdbcUserDao.setDataSource();
            return jdbcUserDao.get(corpId,userId);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("error jdbcUserDao.get");//To change body of catch statement use File | Settings | File Templates.
        }
        return user;
    }

    @Override
    public void insert(User user){
        jdbcUserDao.setDataSource();
        jdbcUserDao.insert(user);
    }

    @Override
    public void update(String id){

    }

    @Override
    public String delete(String corpId,String userId){
        jdbcUserDao.setDataSource();
        int result = jdbcUserDao.delete(corpId,userId);

        if (result == 1){
            return "Success";
        }else{
            return "Failed";
        }

    }
}
