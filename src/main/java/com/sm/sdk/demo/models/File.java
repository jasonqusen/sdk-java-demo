package com.sm.sdk.demo.models;

/**
 * Created by huaoguo on 2017/5/1.
 */
public class File {
    private String guid;
    private String name;
    private String type;
    private String user;

    public File(String guid, String name, String type, String user) {
        this.guid = guid;
        this.name = name;
        this.type = type;
        this.user = user;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
