package com.company;

import java.util.Scanner;

public class RegisterAsPass extends Register {
    Data obj=new Database();

    public RegisterAsPass() {
    }

    public RegisterAsPass(String username, String pass, String email, long mobile) {
        super(username, pass, email, mobile);
    }

    public void setUserName(String userName) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < obj.getPassUsingSystem().size(); ++i) {
            if (userName.equals(obj.getPassUsingSystem().get(i).getUserName())) {
                System.out.println("This UserName is already exist on the system ,please enter another one:");
              
                userName = input.nextLine();
                this.setUserName(userName);
                break;
            }
        }

        this.userName = userName;
        input.close();
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
        System.out.println(this.mobileNum);
        return this.mobileNum;
    }

    public String getEmail() {
        System.out.println(this.Email);
        return this.Email;
    }

    public String getUserName() {
        System.out.println(this.userName);
        return this.userName;
    }

    public String getPassword() {
        System.out.println(this.Password);
        return this.Password;
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
