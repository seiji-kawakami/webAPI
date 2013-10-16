package com.kddi.tsugai.webapi.domain;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.postgresql.util.PGobject;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: seiji-k
 * Date: 2013/10/16
 * Time: 9:14
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String id;
    private String corpId;
    private Map<String,String> propertyMap = new LinkedHashMap<String, String>();
    private String properties;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public String getCorpId() {
        return corpId;
    }
    public void setPropertyMap(String key,String value){
        propertyMap.put(key, value);
    }

    public void setProperties(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            this.properties = objectMapper.writeValueAsString(this.propertyMap);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void setProperties(String value){
        this.properties = value;
    }

    public String getProperties() {
        return properties;
    }
}
