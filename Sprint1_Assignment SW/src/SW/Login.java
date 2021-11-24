package SW;


public class Login extends Register{


    @Override
    public void setmail(String e_mail) {
this.E_mail=e_mail;
    }

    @Override
    public String getmail() {
        return E_mail;
    }

    @Override
    public void setpass(String pass) {
this.pass=pass;
    }

    @Override
    public String getpass() {
        return pass;
    }
}
