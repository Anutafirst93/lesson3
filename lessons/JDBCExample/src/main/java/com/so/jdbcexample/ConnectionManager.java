package com.so.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Нюта on 18.01.2016.
 */
public class ConnectionManager {
    private static  Connection connection;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver"); //регистрация драйвера
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest",
                    "root",
                    "avon1993");
        }catch (ClassNotFoundException ex){
            System.out.println("Cannot load driver");
        }catch (SQLException ex){
            System.out.println("Cannot connect to database");
        }
    }

    public static Connection getConnection (){
        return connection;
    }
}
