package com.kddi.tsugai.webapi.dao;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 17:44
 * To change this template use File | Settings | File Templates.
 */
public class UserRequest{
    private UserBean user;
/*    private ServiceBean[] service;
    private AuthBean[] auth;*/

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }
/*
    public ServiceBean[] getService() {
        return service;
    }

    public void setService(ServiceBean[] service) {
        this.service = service;
    }

    public AuthBean[] getAuth() {
        return auth;
    }

    public void setAuth(AuthBean[] auth) {
        this.auth = auth;
    }*/
}
