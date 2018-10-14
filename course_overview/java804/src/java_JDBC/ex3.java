package java_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ex3
{

    public static void main(String[] args)
    {
        try {

            Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
            String query = "select * from employee where id=110";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Employee ID:" + rs.getInt("ID"));


        } catch (Exception se) {
            System.out.println("Error");
        }
    }

}
/*
Assume that:
The required database driver is configured in the classpath.
The appropriate database is accessible with thedbURL,userName, and password exists.
The Employee table has a column ID of type Integer and the SQL query matches one record.

A)The code prints Error
B)The code prints the employee ID
C)Compilation fails due to an error at line 17.
D)Compilation fails due to an error at line 18.



*/