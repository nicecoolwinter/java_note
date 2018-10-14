/*

 Given records from the Player table:

 PID    PName   PEmail
 001    Dave    dave@sportz.com
 002    Jack    Jack@sportz.com
 003    Sam     sam@sportz.com



 */

package java_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex4
{

    public static void main(String[] args)
    {
        try {
            //code that loads and registers jdbc driver goes here

            Connection conn = DriverManager.getConnection("url", "username", "password");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                                ResultSet.CONCUR_UPDATABLE);

            st.execute("select * from player");
            st.setMaxRows(2);
            ResultSet rs = st.getResultSet();
            rs.absolute(3);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(
                                       3));
            }
        } catch (SQLException ex) {
            System.out.print("SQLException is raised");

        } catch (NullPointerException ne) {
            System.out.print("NullPointerException is raised");
        }

    }

}

/*

Assume that URL,username,password, and SQL queries are valid.

What is the result?

A)003 Sam sam@spotz.com
B)
002 Jack jack@sportz.com
003 Sam sam@sportz.com

C)The program prints nothing
D)SQLException is raised
E)NullPointerException is raised








*/
