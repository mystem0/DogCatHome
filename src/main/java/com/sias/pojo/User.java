package com.sias.pojo;

public class User {
    private String userName;
    private String passWord;
    private String userNumber;

    public User(String userNumber,String passWord) {
        this.passWord = passWord;
        this.userNumber = userNumber;
    }

    public User(String userName, String passWord, String userNumber) {
        this.userName = userName;
        this.passWord = passWord;
        this.userNumber = userNumber;
    }

    public User(){};

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userNumber='" + userNumber + '\'' +
                '}';
    }
}
