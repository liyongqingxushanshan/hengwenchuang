package com.qfedu.domain;


import java.util.Date;

public class CeShi {

    private int id;
    private int uid;
    private String username;
    private String datatime;
    private int score;


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDatatime() {
        return datatime.substring(0,datatime.length()-2);
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }
}
