package com.example.co_recyclerview.activity.activity.model;

/**
 * Created by Patrick Ian Co on 9/14/2017.
 */

public class AndroidVersion {
    private int logo;
    private String codename;
    private String version;
    private String api;
    private String released_date;

    public AndroidVersion(int logo, String codename, String version, String api, String released_date){
        this.logo = logo;
        this.codename = codename;
        this.version = version;
        this.api = api;
        this.released_date = released_date;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getReleased_date() {
        return released_date;
    }

    public void setReleased_date(String released_date) {
        this.released_date = released_date;
    }
}
