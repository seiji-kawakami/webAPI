package com.kddi.tsugai.webapi.dao;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 17:26
 * To change this template use File | Settings | File Templates.
 */
public class Request implements Serializable {
    private static final long serialVersionUID = 1513207428686438208L;
    private int left;
    private int right;
    public int getLeft() {return left;}
    public void setLeft(int left) {this.left = left;}
    public int getRight() {return right;}
    public void setRight(int right) {this.right = right;}
}
