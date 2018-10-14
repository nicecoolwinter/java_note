package java_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ex2
{
    public static void main(String rags[])
    {
        Connection conn = null;

        try {

            //n1

            if (conn != null) {
                System.out.println("Connection Established.");
            }


        } catch (Exception e) {
            System.out.print(e);
        }
    }

}
/*
 Assume that dbURL, userName,and password are valid.
 which code fragment can be insert at line n1 to enable the code to print connection
 Establish?

 A)conn=Drivermanager.getConnection(userName,password,dbURL);

 B)
 conn=Drivermanager.getConnection(dbUrl);
 conn.setClientInfo("user",userName);
 conn.setClientInfo("password",password);

 C)
 Properties prop=new Properties();
 prop.put("userid",username);
 prop.put("url"dbURL);
 prop.put("url",dbURL);
 con=DriverManager.getConnecton(prop);

 D)
 Properties prop=new Properties();
 prop.put("user",userName);
 prop.put("password",password);
 con=DriverManager.getConnection(dbURL,prop);





 */
