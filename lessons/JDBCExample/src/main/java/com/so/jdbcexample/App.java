package com.so.jdbcexample;


public class App {
    public static void main(String[] args) throws Exception{
        SimpleConnection connection = new SimpleConnection();
        connection.createConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "avon1993");

        connection.createTestTable();
                for(int i = 0; i < 10; i++){
            connection.createRecord();
        }
        connection.getRecord();
        connection.updateRecord();
        connection.getRecord();
        connection.removeRecord();
        connection.disconnect();
    }
}
