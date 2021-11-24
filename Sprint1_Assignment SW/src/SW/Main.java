package SW;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegisterAsDriver d = new RegisterAsDriver();
        RegisterAsPass p = new RegisterAsPass();
        passenger pas=new passenger();
        Driver driv=new Driver();
        Admin admin1 = new Admin();
        ArrayList<Register> AddPassenger=new ArrayList<>();
        ArrayList<RegisterAsDriver> AddDriver=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("1-Driver   2-passenger");
        int c1=in.nextInt();
        if(c1==1)
        {
            System.out.println("1-Sign up   2-login");
            c1=in.nextInt();
            if(c1==1){
                System.out.println("enter username");
                String name=in.nextLine();
                d.setname(name);
                System.out.println("enter email");
                String email=in.nextLine();
                d.setmail(email);
                System.out.println("enter pass");
                String pass=in.nextLine();
                d.setpass(pass);
                System.out.println("enter national ID");
                long ID=in.nextLong();
                d.setID(ID);
                System.out.println("enter license number");
                long lic=in.nextLong();
                d.setlicense(lic);
                System.out.println("enter mobile number");
                long mobile=in.nextLong();
                d.setmobile(mobile);// admin verify or not
                if(admin1.verify()==true)
                {
                AddDriver.add(d);//enter on the system
                    System.out.println("Welcome to our System ");

                }
            }
            else if (c1==2) {
                while (true) {
                    System.out.println("enter email");
                    String email = in.nextLine();
                    System.out.println("enter pass");
                    String pass = in.nextLine();
                    if (AddDriver.contains(email) && AddDriver.contains(pass)) {
                        //enter on the system
                    } else {
                        System.out.println("error... password or email is not correct please enter again");
                    }
                }
            }
            else {
                System.exit(0);
            }
        }
        else if(c1==2){
            System.out.println("1-Sign up   2-login");
            c1=in.nextInt();
            if(c1==1){
                System.out.println("enter username");
                String name=in.nextLine();
                p.setname(name);
                System.out.println("enter email");
                String email=in.nextLine();
                p.setmail(email);
                System.out.println("enter pass");
                String pass=in.nextLine();
                p.setpass(pass);
                System.out.println("enter mobile number");
                long mobile=in.nextLong();
                p.setmobile(mobile);
                System.out.println("successfully registered");
                AddPassenger.add(p);
                System.out.println("enter your source then destination");
                String source,dest;
                source=in.nextLine();
                dest=in.nextLine();
                pas.req_aride(source,dest);
                driv.res_area(source);

            }
            else if (c1==2) {
                while (true) {
                    System.out.println("enter email");
                    String email = in.nextLine();
                    System.out.println("enter pass");
                    String pass = in.nextLine();
                    if (AddPassenger.contains(email) && AddPassenger.contains(pass)) {
                        //enter on the system
                    } else {
                        System.out.println("error... password or email is not correct please enter again");
                    }
                }
            }
            else {
                System.exit(0);
            }
        }
        else {
            System.exit(0);
        }
    }
}
