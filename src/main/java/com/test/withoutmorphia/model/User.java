package com.test.withoutmorphia.model;

public class User {
    private String UserId;
    private String UserName;
    private String UserPhoneNumber;

    public User(){
    }

    public User(String userId, String userName, String userPhoneNumber) {
        UserId = userId;
        UserName = userName;
        UserPhoneNumber = userPhoneNumber;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        UserPhoneNumber = userPhoneNumber;
    }

}
