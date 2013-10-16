package com.kddi.tsugai.webapi.service;

import com.kddi.tsugai.webapi.domain.User;

import java.security.PublicKey;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 9:18
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    public User get(String corpId,String userId);
    public void insert(User user);
    public void update(String id);
    public void delete(String id);

}
