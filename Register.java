package com.company;

public abstract class Register extends Info {
    protected String Email;
    protected long mobileNum;

    public Register() {
    }

    public Register(String username, String pass, String email, long mobile) {
        super(username, pass);
        this.Email = email;
        this.mobileNum = mobile;
    }

    public abstract void setPassword(String var1);

    public abstract void setUserName(String var1);

    public abstract void setEmail(String var1);

    public abstract void setMobileNum(long var1);

    public abstract String getPassword();

    public abstract String getUserName();

    public abstract long getMobileNum();

    public abstract String getEmail();
}
