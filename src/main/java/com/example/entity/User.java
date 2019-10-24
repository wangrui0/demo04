package com.example.entity;


public class User{
    private  Integer id;
    private  Integer userName ;
    private  Integer passWord;
    private  Integer realNmame;

    public User(Integer id, Integer userName, Integer passWord, Integer realNmame) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.realNmame = realNmame;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserName() {
        return userName;
    }

    public Integer getPassWord() {
        return passWord;
    }

    public Integer getRealNmame() {
        return realNmame;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public void setPassWord(Integer passWord) {
        this.passWord = passWord;
    }

    public void setRealNmame(Integer realNmame) {
        this.realNmame = realNmame;
    }

    public User() {
    }
}
