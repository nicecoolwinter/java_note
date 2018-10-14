package java_Method_Encapsulation;

class DBConfiguration
{
    String user;
    String password;
}
public class ex5_method
{
    DBConfiguration configureDB(String uname, String password)
    {
        return new DBConfiguration();
    }

    public static void main(String[] args)
    {
        ex5_method r = new ex5_method();
        DBConfiguration dbConf = r.configureDB("manager", "manager");
    }

}

/*
which code fragment must be inserted at line 6 to enable the code to compile?

A)return 0;
B)return DBConfiguration;
C)
DBConfiguration f;
return f;


D)
return new DBConfiguration();





*/