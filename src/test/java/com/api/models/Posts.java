package com.api.models;

public class Posts {

    private String title;
    private String body;
    private Integer userId;

    public Posts(String title, String body, Integer userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public String gettitle(){return title;}
    public void settitle(String title){this.title = title;}

    public String getbody(){return body;}
    public void setbody(String body) {this.body = body;}

    public Integer getuserID(){return userId;}
    public void setuserId(Integer userId) {this.userId = userId;}

}
