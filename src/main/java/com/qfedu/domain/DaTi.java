package com.qfedu.domain;

public class DaTi {
    private int id;
    private int sid;
    private String dati;
    private int flag;
    private int csid;
    private String timu;

    public String getTimu() {
        return timu;
    }

    public void setTimu(String timu) {
        this.timu = timu;
    }

    private String shiti;

    public String getShiti() {
        return timu+dati;
    }

    public void setShiti(String shiti) {
        this.shiti = shiti;
    }

    public String getDati() {
        return dati;
    }

    public void setDati(String dati) {
        this.dati = dati;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getCsid() {
        return csid;
    }

    public void setCsid(int csid) {
        this.csid = csid;
    }
}
