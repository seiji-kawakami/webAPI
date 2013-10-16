package com.kddi.tsugai.webapi.dao;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 17:26
 * To change this template use File | Settings | File Templates.
 */
public class Result implements Serializable {
    private static final long serialVersionUID = -5054749880960511861L;
    private int addition;
    private int subtraction;
    private int multiplication;

    public int getAddition() { return addition; }
    public void setAddition(int addition) { this.addition = addition; }
    public int getSubtraction() { return subtraction; }
    public void setSubtraction(int subtraction) { this.subtraction = subtraction; }
    public int getMultiplication() { return multiplication; }
    public void setMultiplication(int multiplication) { this.multiplication = multiplication; }
}