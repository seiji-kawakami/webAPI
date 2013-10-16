package com.kddi.tsugai.webapi.dao;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 19:55
 * To change this template use File | Settings | File Templates.
 */
public class AuthBean {
    private String authTypeCd;
    private String value;

    public String getAuthTypeCd() {
        return authTypeCd;
    }

    public void setAuthTypeCd(String authTypeCd) {
        this.authTypeCd = authTypeCd;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
