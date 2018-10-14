package java_Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ex1
{

    public static void main(String[] args) throws Exception{
        Connection conn = DriverManager.getConnection(dbURL, userName, password);
        String query = "select id from employee";

        try(Statement stmt = conn.createStatement())
        {
            ResultSet rs = stmt.executeQuery(query);
            stmt.executeQuery("select id from Customer");

            while (rs.next()) {
                //process the results
                System.out.println("Employee Id:" + rs.getInt("ID"));
            }
        } catch (Exception e)
        {
            System.out.println("Error");
        }

    }

}
/*
Assune that:
    The rquired database driver is configured in the classpath
    The appropriate database is accessible with the dbURL,userName, and password exists
    The Employee and Customer tables are available and each table has id column with a few
    records and the SQL queries are valid

What is the rsult of compiling and executing this code fragment?

A)The program prints employee IDS
B)The program prints customer IDS
C)The program pprints ERROR
D)Compilaton fails on line 17

*/
