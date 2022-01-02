package com.company;

import java.util.Scanner;

public class RegisterAsPass extends Register {
    Data obj=new Database();
    String DOB;

    public RegisterAsPass() {
    }

    public RegisterAsPass(String username, String pass, String email, long mobile,String DOB) {
        super(username, pass, email, mobile);
        this.DOB=DOB;
    }

    public void setUserName(String userName) {
        for(int i = 0; i < obj.getPassUsingSystem().size(); ++i) {
            if (userName.equals(obj.getPassUsingSystem().get(i).getUserName())) {
                System.out.println("This UserName is already exist on the system ,please enter another one:");
                Scanner input = new Scanner(System.in);
                userName = input.nextLine();
                this.setUserName(userName);
                break;
            }
        }

        this.userName = userName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setMobileNum(long mobileNum) {
        this.mobileNum = mobileNum;
    }

    public long getMobileNum() {
        return this.mobileNum;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.Password;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    @Override
    public String toString() {
        return "RegisterAsPass{" +
                "Name='"+getUserName()+
                "Email='" + getEmail() +
                "Password='"+getPassword()+
                "Mobile='"+getMobileNum()+
                '}';
    }
}
