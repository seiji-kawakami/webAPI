package com.kddi.tsugai.webapi.dao;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 19:52
 * To change this template use File | Settings | File Templates.
 */
public class ServiceBean {
    private String serviceId;
    private String account;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
