package SW;
import java.util.ArrayList;
abstract class Register {
       String user_Name="";
       long Mobile=0;
       String E_mail="";
      String pass="";
     public void setname(String username){
         this.user_Name=username;
     }
     public String getname(){
         return user_Name;
     }
     public  void setmobile(long mobile){
         this.Mobile=mobile;
     }
     public long getmobile(){
         return Mobile;
     }
    abstract public  void setmail(String e_mail);
   abstract public   String getmail();
    abstract public  void setpass(String pass);
     abstract public  String getpass();
}
class RegisterAsPass extends Register{

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
class RegisterAsDriver extends Register{

    long license=0;
    long nationalID=0;
    ArrayList<Register> pending=new ArrayList();
    public void setlicense(long license) {
        this.license=license;
    }


    public long getlicense() {
        return license;
    }
    public void setID(long nationalid) {
        this.nationalID=nationalid;
    }


    public long getID() {
        return nationalID;
    }

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
