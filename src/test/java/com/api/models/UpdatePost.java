package com.api.models;

public class UpdatePost {

    private Integer id;
    private String title;
    private String body;
    private Integer userId;

    public UpdatePost(Integer id, String title, String body, Integer userId){
        this.id = id;
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public Integer setid(){return id;}
    public void setid(Integer id){this.id = id;}

    public String gettitle(){return title;}
    public void settitle(String title){this.title = title;}

    public String getbody(){return body;}
    public void setbody(String body){this.body = body;}

    public Integer getuserId(){return userId;}
    public void setuserID(Integer userId){this.userId = userId;}

}
