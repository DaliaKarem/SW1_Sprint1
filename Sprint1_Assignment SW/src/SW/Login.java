package com.company;

public class Login extends Info {
    Data obj=new Database();

    public boolean check_Admin(String username,String pass){
        boolean status=false;
        if(username.equals("ADMIN_55")  && pass.equals("12334567")){
            status=true;
        }
        return status;
    }
    public boolean check_driver(String username,String pass) {
        if(obj.getSuspendingAccounts().contains(username)){
            System.out.println("Your account is suspended ..");
            return false;
        }
        boolean status = false;
        for (int i=0;i<obj.getDriversUsingSystem().size();i++){
            if(obj.getDriversUsingSystem().get(i).getUserName().equals(username) && obj.getDriversUsingSystem().get(i).getPassword().equals(pass)){
                status=true;
                break;
            }
        }
        if(status==true) {
            Login obj=new Login(userName,pass);
            System.out.println("_Welcome to your account_");
        }else {
            boolean stat = false;
            for (int i = 0; i < obj.getPending_drivers().size(); i++) {
                if (obj.getPending_drivers().get(i).getUserName().equals(username)) {
                    stat = true;
                    break;
                }
            }
            if (stat == true) {
                System.out.println("U Can't Login to the system as the admin still not verify your account");
            }
            else {
                System.out.println("Invalid username or password");
            }
        }
        return status;
    }
    public boolean check_pass(String username,String pass){
        if(obj.getSuspendingAccounts().contains(username)){
        System.out.println("Your account is suspended ..");
        return false;
        }
        boolean stat=false;
        for (int i=0;i<obj.getPassUsingSystem().size();i++){
            if(obj.getPassUsingSystem().get(i).getUserName().equals(username) && obj.getPassUsingSystem().get(i).getPassword().equals(pass)){
                stat=true;
                break;
            }
        }
        if(stat==true) {
            Login obj=new Login(userName,pass);
            System.out.println("_Welcome to your account_");
        }
        else {
            System.out.println("Invalid username or password");
        }
        return stat;
    }

    public Login(){

    }
    public Login(String UserName, String password) {
        super(UserName, password);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.Password;
    }
}
