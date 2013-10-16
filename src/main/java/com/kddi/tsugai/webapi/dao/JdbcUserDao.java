package com.kddi.tsugai.webapi.dao;

import com.kddi.tsugai.webapi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.postgresql.Driver;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 13:59
 * To change this template use File | Settings | File Templates.
 */

public class JdbcUserDao {
    private DriverManagerDataSource dataSource=new DriverManagerDataSource();

    public void setDataSource() {
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://ec2-54-238-140-97.ap-northeast-1.compute.amazonaws.com:5432/tsugai_proto");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");
    }

    public User get(String corpId,String userId) throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.queryForObject("select * from t_user where corp_id =? and user_id = ?",new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User u = new User();
                u.setCorpId(resultSet.getString("corp_id"));
                u.setId(resultSet.getString("user_id"));
                u.setProperties(resultSet.getString("properties"));
                return u;  //To change body of implemented methods use File | Settings | File Templates.
            }
        },corpId,userId);
    }

    public void insert(User user){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "insert into t_user (user_id,corp_id,properties) values (?,?,?)";
        String corpId =  "kddi";
        String userId =  "seiji-k@kddi";
        String properties = "'{\"Name\":\"川上 誠司\",\"mailAddress\":\"seiji-k@kddi.com\",\"phone\": \"080-5066-9380\"}'";
        int i = jdbcTemplate.update("insert into t_user values ('seiji-k@kddi','kddi','{\"Name\":\"川上 誠司\",\"mailAddress\":\"seiji-k@kddi.com\",\"phone\": \"080-5066-9380\"}')");
    }

    public int delete(String corpId, String userId) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        return jdbcTemplate.update("delete from t_user where corp_id =? and user_id = ?",
                corpId,userId);
    }
}
