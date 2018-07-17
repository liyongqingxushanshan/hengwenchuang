package com.qfedu.domain;

public class ShiTi {
    private int id;
    private String timu;
    private String daan;
    private String td;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimu() {
        return timu;
    }

    public void setTimu(String timu) {
        this.timu = timu;
    }

    public String getDaan() {
        return daan;
    }

    public void setDaan(String daan) {
        this.daan = daan;
    }

    public String getTd() {
        return timu+daan;
    }

    public void setTd(String td) {
        this.td = td;
    }
}
