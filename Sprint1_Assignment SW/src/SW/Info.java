package com.company;

public abstract class Info {
    protected String userName;
    protected String Password;

    public Info() {
    }

    public Info(String UserName, String password) {
        this.userName = UserName;
        this.Password = password;
    }
    public abstract void setPassword(String var1);

    public abstract void setUserName(String var1);

    public abstract String getPassword();

    public abstract String getUserName();
}
